package Concrete;

import Abstract.BaseCampaignManager;
import Entities.Game;

public class CampaignManager extends BaseCampaignManager {

    @Override
    public void Add(String campaignName, int discountRate,Game game) {
        super.Add(campaignName, discountRate,game);
    }

    @Override
    public void update(String campaignName, int discountRate,Game game) {
        super.update(campaignName, discountRate,game);
    }


    @Override
    public void delete(String campaignName) {
        super.delete(campaignName);
    }
}
