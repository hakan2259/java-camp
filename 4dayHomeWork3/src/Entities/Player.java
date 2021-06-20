package Entities;

import Abstract.Entity;

import java.time.LocalDate;

public class Player extends Customer implements Entity {

    private String nickName;

    public Player(){

    }

    public Player(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId, String customerNumber, String email,String nickName){
        super(id,firstName,lastName,dateOfBirth,nationalityId,customerNumber,email);
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
