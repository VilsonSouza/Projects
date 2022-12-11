package com.eumemu.parkingcloudproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("/")
public class ParkingCloudProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingCloudProjectApplication.class, args);
	}

}
