# swagger
1.swager 종속성 추가

2.버전이 안 맞으면 애러 plug-in org.springframework.boot 자바2.6.6 의존선 고침

3.어플리케이션 프로퍼티에 spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER 추가

4.		
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-boot-starter</artifactId>
	<version>3.0.0</version>
</dependency>