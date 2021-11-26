package com.dadavivi.aliyunipv6ddns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AliyunIpv6DdnsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AliyunIpv6DdnsApplication.class, args);
	}

}
