package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "voters")
public class Voter {
    @Id
    private String id;

    private String name;
    // Other voter-related fields, if any
}
