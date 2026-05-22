package com.example.CatalogSystem.dto;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FeedbackDto {
    @NotBlank(message = "Feedback name is required")
    private String name;

    @NotBlank(message = "Feedback is required")
    private String bookName;

    @NotBlank(message = "Feedback is required")
    private String feedback;
}
