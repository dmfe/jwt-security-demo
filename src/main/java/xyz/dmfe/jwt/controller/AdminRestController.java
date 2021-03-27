package xyz.dmfe.jwt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import xyz.dmfe.jwt.model.SecretMessage;

/**
 * AdminRestController
 */
@RestController
@RequestMapping("/api")
public class AdminRestController {

    @GetMapping("/secret-message")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<SecretMessage> get() {
        return ResponseEntity.ok(
                new SecretMessage("Pablo", "This is a secret message from Pablo!",
                    "Pablo's secret",System.currentTimeMillis())
        );
    }
}

