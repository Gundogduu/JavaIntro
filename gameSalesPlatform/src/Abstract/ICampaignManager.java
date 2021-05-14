package Abstract;

import Entities.Campaign;

public interface ICampaignManager {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
