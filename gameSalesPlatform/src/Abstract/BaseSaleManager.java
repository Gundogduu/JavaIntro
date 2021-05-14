package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public abstract class BaseSaleManager implements ISaleManager{

	@Override
	public void sale(Game game, Member member) {
		System.out.println("Purchased game: " + game.getName() + "Purchaser: " + member.getFirstName());
	}

	@Override
	public void saleWithCampaign(Campaign campaign, Game game, Member member) {
		System.out.println(campaign.getName() + game.getName() + member.getFirstName());
	}
}
