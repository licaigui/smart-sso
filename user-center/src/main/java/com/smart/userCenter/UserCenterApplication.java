package com.smart.userCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;

//@EnableRedisHttpSession
//@SpringBootApplication
@SpringBootApplication(exclude = { RedisAutoConfiguration.class, RedisRepositoriesAutoConfiguration.class })
public class UserCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCenterApplication.class, args);
	}
}
