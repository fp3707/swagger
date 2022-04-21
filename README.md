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

5.Mapper 못잧는이유

-잘못된 예
<dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis</artifactId>
    <version>3.5.9</version>
</dependency>

-잘된에
    <dependency>
        <groupId>org.mybatis.spring.boot</groupId>
        <artifactId>mybatis-spring-boot-starter</artifactId>
        <version>2.2.2</version>
    </dependency>

    