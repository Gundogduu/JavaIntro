package Abstract;

import java.util.ArrayList;

import Entities.Campaign;

public abstract class BaseCampaignManager implements ICampaignManager{

	ArrayList<Campaign> campaignes = new ArrayList<Campaign>();
	
	@Override
	public void add(Campaign campaign) {
		campaignes.add(campaign);
		System.out.println("----Campaign---------------- ");	
		System.out.println("save to db: " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		campaignes.set(campaign.getId(), campaign);
		System.out.println("update to db: " + campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		campaignes.remove(campaign);
		System.out.println("delete to db: " + campaign.getName());
		
	}
}
