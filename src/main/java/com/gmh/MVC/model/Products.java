package com.gmh.MVC.model;

public class Products {

    private int productId;
    private String name;
    private String imgUrl;
    private String price;
    private String description;

    public Products(int productId, String name, String imgUrl, String price, String description) {
        this.productId = productId;
        this.name = name;
        this.imgUrl = imgUrl;
        this.price = price;
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
