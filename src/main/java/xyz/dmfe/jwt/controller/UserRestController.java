package xyz.dmfe.jwt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import xyz.dmfe.jwt.model.PublicMessage;

/**
 * UserRestController
 */
@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/public-message")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<PublicMessage> get() {
        return ResponseEntity.ok(
                new PublicMessage("John", "This is a public message from John!",
                    System.currentTimeMillis())
        );
    }
}
