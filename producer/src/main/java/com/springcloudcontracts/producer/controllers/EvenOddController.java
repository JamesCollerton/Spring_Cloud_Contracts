package com.springcloudcontracts.producer.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/is-odd")
public class EvenOddController {

    @GetMapping("/{number}")
    public ResponseEntity<Boolean> isOdd(@PathVariable("number") Long number) {
        boolean result = (number % 2 == 1);
        return ResponseEntity.ok(result);
    }

}
