package com.example.coffeeShop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MenuDto {
    private Long id;
    private String name;
    private Integer price;
}
