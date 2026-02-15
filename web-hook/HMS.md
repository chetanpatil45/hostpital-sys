
#  Setup Webhook 

**Steps**
1. Create Configuration file to create `@Bean` of `RestTemplate` to send payload to another system.
2. Create WebhookService class to implement sending package to **WebhookProducer** Application.
3. Inject that `WebhookService` Dependency into `AppoinmentController` class to create and send payload.
4. Create `WebhookURL` to specify url endpoint of `WebhookProducer` application.
5. Send payload and `WebhookURL` using WebhookService method.

**Config.java**
```java
package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
```

**WebhookService.java**
```java
package com.example.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class WebhookService {

    private final RestTemplate restTemplate;

    public WebhookService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public void sendWebhook(String webhookURL, Map<String, Object> payload){
        System.out.println(restTemplate.postForObject(webhookURL, payload, String.class));
    }
}
```

**AppointmentController.java**
```java
package com.example.controllers;

import com.example.models.Appointment;
import com.example.service.AppointmentService;
import com.example.service.WebhookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/appointment")
public class AppointmentController {
    @Autowired
    private AppointmentService service;

    @Autowired
    private WebhookService webhookService;

    @PostMapping
    public Appointment saveAppointment(@RequestBody Appointment requAppointment){
        System.out.println("-> CREATING APPOINTMENT ");
        Appointment appointment =  service.saveAppointment(requAppointment);

        Map<String, Object> payload = new HashMap<>();

        payload.put("ID",appointment.getId());
        payload.put("PATIENT-ID",appointment.getPatientId());
        payload.put("DOCTOR-ID",appointment.getDoctorId());
        payload.put("DATE",appointment.getDate());

        String webhookURL = "http://localhost:8082/webhook";

        webhookService.sendWebhook(webhookURL,payload);
        return appointment;
    }
    
    /*  other controller methods.
        - getAppointment()
        - getAllAppointment()
        - updateAppointment()
        - deleteAppointment()
     */
}

```

### In this way you can Integrate Webhooks in your Application.
