package Entities;

import Abstract.Entity;

public class Game implements Entity {

    private int id;
    private String name;
    private double price;
    private int discount;
    private double priceAfterDiscount;

    public Game(){

    }

    public Game(int id, String name, double price, int discount, double priceAfterDiscount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.priceAfterDiscount = priceAfterDiscount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public double getPriceAfterDiscount(){
        return this.price - (this.price/100*this.discount);
    }
}
