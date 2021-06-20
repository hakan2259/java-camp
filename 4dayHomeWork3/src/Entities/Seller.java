package Entities;

import Abstract.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Seller extends Customer implements Entity {

    private double commissioneRate;


    public Seller(){

    }

    public Seller(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId, String customerNumber, String email,double commissioneRate){
        super(id,firstName,lastName,dateOfBirth,nationalityId,customerNumber,email);
        this.commissioneRate = commissioneRate;
    }

    public double getCommissioneRate() {
        return commissioneRate;
    }

    public void setCommissioneRate(double commissioneRate) {
        this.commissioneRate = commissioneRate;
    }
}
