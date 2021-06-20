package Abstract;

import Entities.Customer;
import Entities.Game;

public interface SalesService {

    void sell(Customer customer, Game game);
}
