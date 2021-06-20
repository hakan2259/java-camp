package com.company;

import Abstract.BaseCampaignManager;
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.PlayerCustomerManager;
import Concrete.SalesManager;
import Entities.Game;
import Entities.Player;
import Entities.Seller;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

        Player player1 = new Player();
        player1.setId(1);
        player1.setFirstName("Hakan");
        player1.setLastName("Sandal");
        player1.setNationalityId("15002004574");
        player1.setDateOfBirth(LocalDate.of(1996,3,13));
        player1.setCustomerNumber("221315");
        player1.setNickName("Bane");

        Seller seller1 = new Seller(1,
                "Betül",
                "Yeşildağ",
                LocalDate.of(1996,2,10),
                "3123123123",
                "2222",
                "betul@gmail.com",
                0.015);

        Game game1 = new Game();
        game1.setId(1);
        game1.setName("call of duty black ops cold war");
        game1.setPrice(300);
        game1.setDiscount(10);

        BaseCustomerManager playerCustomerManager = new PlayerCustomerManager(new MernisServiceAdapter());
        playerCustomerManager.save(player1);

        SalesManager salesManager = new SalesManager();
        salesManager.sell(player1,game1);

        BaseCampaignManager baseCampaignManager = new CampaignManager();
        baseCampaignManager.Add("Haftasonu kampanyası",10,game1);
        baseCampaignManager.update("Yaz Kampanyası",20,game1);







    }
}
