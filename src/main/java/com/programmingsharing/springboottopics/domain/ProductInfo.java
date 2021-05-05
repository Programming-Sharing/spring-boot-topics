package com.programmingsharing.springboottopics.domain;

public class ProductInfo {
    private Integer productId;
    private String name;
    private String description;

    public ProductInfo(Integer productId, String name, String description) {
        this.productId = productId;
        this.name = name;
        this.description = description;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
