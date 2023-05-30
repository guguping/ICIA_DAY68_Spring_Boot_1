### ICIA DAY 68 Spring_Boot 2

# 들여쓰기가 매우 중요함 이상태로 사용하기

### server port 번호 설정

```yaml
server:
  port: 8082
```

### data base 연동 설정

```yaml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/db_springboot?serverTimezone=Asia/Seoul&characterEncoding=UTF-8
    username: user_springboot
    password: 1234
```

### thymeleaf 캐시 설정

```yaml
  thymeleaf:
    cache: false
```

### spring data jpa 설정

```yaml
  jpa:
    database-platform: org.hibernate.dialect.MySQL5InnoDBDialect
    open-in-view: false
    hibernate:
      ddl-auto: create
```
#### DDL-AUTO:CREATE 는 매번 실행할때 마다 테이블을 새로 만든다 (내용이 저장되지 않는다)
#### create 는 주로 테스트할때 사용된다
#### ddl-auto: update 를 사용하면 저장도 가능하고 테이블, 컬럼 생성도 자유롭게 가능하다 

### db query log 관련 설정

```yaml
logging:
  level:
    org:
      hibernate:
        SQL: trace
        type:
          descriptor:
            sql:
              BasicBinder: trace
```