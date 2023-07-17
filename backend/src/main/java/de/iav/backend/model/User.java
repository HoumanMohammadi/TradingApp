package de.iav.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@NoArgsConstructor
@Document(collection = "users")
@Data
@AllArgsConstructor
public class User {
   @MongoId
    private String Id;
    private String firstName;
    private String lastName;
}
