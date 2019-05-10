package com.springcloudcontracts.producer.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/*
    Very simple controller saying if a number is even or odd
 */
@Controller
@RequestMapping("/is-odd")
public class EvenOddController {

    @GetMapping("/{number}")
    public ResponseEntity<String> isOdd(@PathVariable("number") Long number) {
        String result = (number % 2 == 1) ? "Yes" : "No" ;
        return ResponseEntity.ok(result);
    }

}
