package de.iav.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@NoArgsConstructor
@Document(collection = "transactions")
@Data
@AllArgsConstructor
public class Transaction {
    @MongoId
     String id;
     String typeOfTransaction;
     String dateAndTimeOfTransaction;
    @DBRef
     User user;
    @DBRef
     Stock stock;
     Integer quantity;
     Double price;
}
