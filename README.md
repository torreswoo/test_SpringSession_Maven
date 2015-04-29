#Spring-Session프로젝트 
1. spring-session httpsession 예제
http://docs.spring.io/spring-session/docs/current/reference/html5/guides/httpsession.html

2. redis local 설치
http://redis.io/topics/quickstart
redis-server
redis-cli

3. local redis와 연결
http://stackoverflow.com/questions/29671237/can-i-let-spring-session-used-a-standalone-redis
(기본 hostname : localhost, 비번은 없음)

4. SpringMVC프로젝트로
spring-session-data-redis
spring-session
jstl
javax.servlet-api
taglibs
spring-web

5.필터등을 사용한 기본 세팅팅
Initializer클래스 : AbstractHttpSessionApplicationInitializer를 상속한 클래스로 레디스를 설정해 놓은Config를사용한다.
Config클래스 : JedisConnectionFactory를 생성하고 Jedis를 사용하여 Redis와 연결
SessionServlet클래스 : Session을 getSession()해서 setAttribute()하는 과정


#프로젝트에 spring-data-plandas포함
1. http://mvn.skplanet.com/index.html#nexus-search;quick~spring-data-plandas
        <dependency>
            <groupId>com.skplanet.spring.data.plandas</groupId>
            <artifactId>spring-data-plandas</artifactId>
            <version>1.1.1-spring4</version>
        </dependency>
        
2. 클라이언트체크 https://plamos.skplanet.com/services/clients
        connection.setDomainName("dev.plandas.skplanet.com");
        connection.setServiceCode("sample_003"); //id
        connection.setAuthCode("****"); //pw
        
3. JedisConnectionFactory -> PlandasConnectionFactory로 변환


# log4j프로젝트에 추가하기기
1. WEB-INF/classes/log4j.properties파일추가
2. 세팅
log4j.rootLogger=DEBUG, A1 // Set root logger level to DEBUG and its only appender to A1.
log4j.appender.A1=org.apache.log4j.ConsoleAppender // A1 is set to be a ConsoleAppender.
log4j.appender.A1.layout=org.apache.log4j.PatternLayout // A1 uses PatternLayout.
