package com.example.CatalogSystem.model;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Document(collection = "feedback")
public class Feedback {
    @Id
    private String id;

    @Field(name = "name")
    private String name;

    @Field(name = "bookname")
    private String bookName;

    @Field(name = "feedback")
    private String feedback;
}
