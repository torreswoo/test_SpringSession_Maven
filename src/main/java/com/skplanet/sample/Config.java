package com.skplanet.sample;

/**
 * Created by 1002475 on 15. 4. 27..
 */

import org.springframework.context.annotation.Bean;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

//import org.springframework.session.redis.embedded.EnableEmbeddedRedis;
//import org.springframework.session.redis.embedded.RedisServerPort;

// tag::class[]
//@EnableEmbeddedRedis // <1>
@EnableRedisHttpSession // <2>
public class Config {

    @Bean
    public JedisConnectionFactory connectionFactory(){   // (@RedisServerPort int port) {
        System.out.println("...Config...connectionFactory()");
        JedisConnectionFactory connection = new JedisConnectionFactory(); // <3>
        //	connection.setPort(port);
        connection.setPort(6379);
        connection.setHostName("localhost");
//		connection.setPassword("1");
        return connection;
    }
}
// end::class[]