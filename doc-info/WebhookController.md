
# Webhook Application 

**Use case -** To show notification when an appointment is booked on **HMS**.

## To Setup webhook

1. Create a simple spring web project with ``spring-stater-web`` starter pack.
2. Create controller class to handle payload requests.
3. Create controller method using `@PostMapping` and `@GetMapping` annotations.
4. Receive the payload in `@RequestBody` as **Map<String, Object>**.
5. Process that payload and send msg in the response.

## This is main application file
**WebhookProducerApplication.java**
```java
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebhookProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebhookProducerApplication.class, args);
	}
}

```

## This is controller file for Webhook project
**WebhookController.java**
```java 
package com.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
public class WebhookController {

    @PostMapping("/webhook")
    public ResponseEntity<String> handleWebhook(@RequestBody Map<String, Object> payload){
        System.out.println("Payload :: "+payload);
        //process payload
        return ResponseEntity.ok("Payload received and processed.");
    }

    @GetMapping("/webhook")
    public String testAPI(){
        return "GET MAPPING --> TEST SUCCESS";
    }
}
```
