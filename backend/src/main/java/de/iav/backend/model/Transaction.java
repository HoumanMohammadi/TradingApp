package de.iav.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@Document(collection = "transactions")
@Data
@AllArgsConstructor
public class Transaction {

    private String id;
    private String typeOfTransaction;
    private String dateAndTimeOfTransaction;
    @DBRef
    private User user;
    @DBRef
    private Stock stock;
    private Integer quantity;
    private Double price;
}
