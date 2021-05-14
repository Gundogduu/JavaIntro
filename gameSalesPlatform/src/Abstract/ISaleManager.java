package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public interface ISaleManager {
	void sale(Game game, Member member);
	void saleWithCampaign(Campaign campaign, Game game, Member member);
}