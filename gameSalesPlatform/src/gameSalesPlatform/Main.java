package gameSalesPlatform;


import java.util.Date;
import Abstract.BaseCampaignManager;
import Abstract.BaseGameManager;
import Abstract.BaseMemberManager;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.MemberManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Member;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		BaseGameManager gameManager = new GameManager();
		gameManager.add(new Game(1,"Resident Evil VILLAGE",250));
		gameManager.add(new Game(2, "The Last Of Us", 350));
		gameManager.add(new Game(3, "Escape From Tarkov", 399));
		gameManager.add(new Game(2, "Formula One 2021", 150));
		gameManager.add(new Game(2, "IRacing", 100));
		gameManager.getAll();
		
		BaseMemberManager memberManager = new MemberManager(new MernisServiceAdapter());
		memberManager.add(new Member(1, "Samet", "Akar", "21548798512", new Date(1991,2,14), "akar_", "12345"));
		memberManager.add(new Member(2, "Orhan", "Demir", "91848798525", new Date(1987,9,11), "demir2", "47859"));
		memberManager.add(new Member(3, "Yavuz", "Noyan", "54748793629", new Date(1991,2,14), "noyan14", "987654"));
		memberManager.add(new Member(4, "Hayri Can", "Gündoðdu", "21466815496", new Date(1995,11,11), "noyan14", "987654"));
		memberManager.getAll();
		
		BaseCampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1, "Summer Sale!", 15, new Date(14,05,2021), new Date(14,05,2021)));
	}
}
