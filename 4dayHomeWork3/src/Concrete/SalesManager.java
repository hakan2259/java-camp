package Concrete;

import Abstract.SalesService;
import Entities.Customer;
import Entities.Game;

public class SalesManager implements SalesService {
    @Override
    public void sell(Customer customer, Game game) {
        System.out.println(customer.getFirstName() + " " + customer.getLastName() + " isimli kişi " + game.getName() + " adlı oyunu satın aldı");
    }
}
