package Utilities;

import Entities.Game;

public class Utils {

    public static void priceAfterPromotion(Game game,int discountRate){
        System.out.println(game.getName() + " kampanyadan sonraki fiyatı : " + (game.getPrice() - (game.getPrice())/100*discountRate));

    }
}
