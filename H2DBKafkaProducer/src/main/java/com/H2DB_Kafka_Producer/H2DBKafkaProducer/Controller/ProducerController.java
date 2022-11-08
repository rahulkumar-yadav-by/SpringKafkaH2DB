package com.H2DB_Kafka_Producer.H2DBKafkaProducer.Controller;


import com.H2DB_Kafka_Producer.H2DBKafkaProducer.Producer.TopicProducer;
import com.H2DB_Kafka_Producer.H2DBKafkaProducer.Model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/kafka/producer")
public class ProducerController {
    private final TopicProducer topicProducer;

    @GetMapping("/send/{name}")
    public void send(@PathVariable("name") String name){
        topicProducer.send("Hello! "+name+".");
    }

    @PostMapping("/send")
    public User send(@RequestBody User user){
        topicProducer.send(user.toString());
        return user;

    }

}