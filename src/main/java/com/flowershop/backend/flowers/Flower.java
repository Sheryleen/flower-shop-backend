package com.flowershop.backend.flowers;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "flowers")
@Data
public class Flower {

    @Id
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




