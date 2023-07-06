package com.example.demo.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Document(collection = "product")
@Data
public class Product {
   @Id
    private String id;
    private String name;
    private Integer prize;
    private boolean active;
    private Date createdDate;
    private Date updatedDate;  
}
