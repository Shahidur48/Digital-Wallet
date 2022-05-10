package com.optimagrowth.wallet.service.client;

import com.optimagrowth.wallet.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



@Component
public class UserRestTemplateClient {
    @Autowired
    RestTemplate restTemplate;

    public User IsUser(Long userId){
        ResponseEntity<User> restExchange =
                restTemplate.exchange(
                        "http://user-service/users/{userId}",
                        HttpMethod.GET,
                        null, User.class, userId);

        return restExchange.getBody();
    }
}
