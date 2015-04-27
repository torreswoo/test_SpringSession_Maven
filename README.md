# test_SpringSession_Maven
1. spring-session httpsession 예제
http://docs.spring.io/spring-session/docs/current/reference/html5/guides/httpsession.html

2. redis local 설치
http://redis.io/topics/quickstart
redis-server
redis-cli

3. local redis와 연결
http://stackoverflow.com/questions/29671237/can-i-let-spring-session-used-a-standalone-redis

4. SpringMVC프로젝트로 dependency추가
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
