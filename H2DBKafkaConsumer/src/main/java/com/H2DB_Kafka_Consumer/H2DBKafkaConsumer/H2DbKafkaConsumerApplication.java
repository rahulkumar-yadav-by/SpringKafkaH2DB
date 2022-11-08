package com.H2DB_Kafka_Consumer.H2DBKafkaConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class H2DbKafkaConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2DbKafkaConsumerApplication.class, args);
	}

}
