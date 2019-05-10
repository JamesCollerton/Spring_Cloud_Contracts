package com.springcloudcontracts.consumer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/is-odd")
public class EvenOddController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{number}")
    public ResponseEntity<String> isOdd(@PathVariable("number") Long number) {

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/json");

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                "http://localhost:8082/is-odd/" + number,
                HttpMethod.GET,
                new HttpEntity<>(httpHeaders),
                String.class);

        return responseEntity;

    }

}
