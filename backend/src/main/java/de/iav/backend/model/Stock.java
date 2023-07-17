package de.iav.backend.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@NoArgsConstructor
@Document(collection = "stocks")
@Data
@AllArgsConstructor
public class Stock {


    private String id;
    private String isin;
    private String stockTicker;
    private String companyName;


}