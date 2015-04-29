package com.skplanet.sample;

/**
 * Created by 1002475 on 15. 4. 27..
 */

//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.plandas.PlandasConnectionFactory;
//import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
//@EnableEmbeddedRedis // <1>
//@EnableRedisHttpSession // <2>
//public class Config {
//
//    @Bean
//    public JedisConnectionFactory connectionFactory(){   // (@RedisServerPort int port) {
//        System.out.println("...Config...connectionFactory()");
//        JedisConnectionFactory connection = new JedisConnectionFactory(); // <3>
//          connection.setPort(6379);
//          connection.setHostName("localhost");
////		connection.setPassword("1");
//        return connection;
//    }
//}


import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.plandas.PlandasConnectionFactory;
@EnableRedisHttpSession // <2>
public class Config {

    @Bean
    public RedisConnectionFactory connectionFactory(){   // (@RedisServerPort int port) {

        PlandasConnectionFactory connection = new PlandasConnectionFactory(); // <3>
        //	connection.setPort(port);

        connection.setDomainName("dev.plandas.skplanet.com");
        connection.setServiceCode("sample_003");
        connection.setAuthCode("1234");
        System.out.println("...Config...connectionFactory()");

        //       connection.setPoolConfig(new JedisPoolConfig());

        return connection;
    }
}
// end::class[]