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
