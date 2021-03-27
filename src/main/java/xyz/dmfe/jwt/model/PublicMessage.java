package xyz.dmfe.jwt.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * PublicMessage
 */
@Data
@AllArgsConstructor
public class PublicMessage {

    private String author;

    private String message;

    private Long timestamp;
}
