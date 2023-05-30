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