package xyz.dmfe.jwt.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * PublicMessage
 */
@Data
@AllArgsConstructor
public class PublicMessage {

    @NotBlank
    @Size(min = 1, max = 20)
    private String author;

    private String message;

    private Long timestamp;
}
