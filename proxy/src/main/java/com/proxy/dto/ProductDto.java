package com.proxy.dto;

public class ProductDto {
    private Long id;
    private String name;
    private int ratings;

    public ProductDto() {
    }

    public ProductDto(Long id, String name, int ratings) {
        this.id = id;
        this.name = name;
        this.ratings = ratings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
}

