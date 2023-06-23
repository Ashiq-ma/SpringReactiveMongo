package com.Ust.SpringReactiveMongo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private String Id;
    private String name;
    private int qty;
    private double price;
}
