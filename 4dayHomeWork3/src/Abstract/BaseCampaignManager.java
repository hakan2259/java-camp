package Abstract;

import Entities.Customer;
import Entities.Game;
import Utilities.Utils;

public class BaseCampaignManager implements CampaignService{

    @Override
    public void Add(String campaignName, int discountRate,Game game) {
        System.out.println(campaignName + ": tüm oyunlarda %" + discountRate + " indirim");
        Utils.priceAfterPromotion(game,discountRate);
    }

    @Override
    public void update(String campaignName, int discountRate,Game game) {
        System.out.println(campaignName + ": tüm oyunlarda %" + discountRate + " indirim");
        Utils.priceAfterPromotion(game,discountRate);
    }

    @Override
    public void delete(String campaignName) {
        System.out.println(campaignName + " kampanyası sona erdi");
    }
}
