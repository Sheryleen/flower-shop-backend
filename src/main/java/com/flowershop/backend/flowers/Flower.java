package com.flowershop.backend.flowers;

import lombok.Data; //automatically generates getters and setters for each property

import javax.persistence.*;


@Entity //entity to the database
@Table(name = "flowers") //table name
@Data
public class Flower {

    @Id //indicates an id field
    //to indicate ids should be generated with new data
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column
    private String name;

    @Column
    private Float price;

    @Column
    private String picture;

    @Column
    private int rating;

    @Column
    private Boolean in_cart;

    @Column
    private Boolean on_sale;

    public Flower(){}

}




