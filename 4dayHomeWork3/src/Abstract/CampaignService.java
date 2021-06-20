package Abstract;

import Entities.Customer;
import Entities.Game;

public interface CampaignService {

    void Add(String campaignName, int discountRate,Game game);
    void update(String campaignName, int discountRate,Game game);
    void delete(String campaignName);


}
