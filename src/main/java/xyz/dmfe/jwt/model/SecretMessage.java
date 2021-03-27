package xyz.dmfe.jwt.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * SecretMessage
 */
@Data
@AllArgsConstructor
public class SecretMessage {

    private String author;

    private String message;

    private String secret;

    private Long timestamp;
}
