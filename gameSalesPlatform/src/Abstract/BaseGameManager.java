package Abstract;


import java.util.*;

import Entities.Game;

public abstract class BaseGameManager implements IGameService{

	ArrayList<Game> games = new ArrayList<Game>();
	
	@Override
	public void add(Game game) {
		games.add(game);
		System.out.println("save to db: " + game.getName());
		
	}

	@Override
	public void update(Game game) {
		games.set(game.getId(), game);
		System.out.println("update to db: " + game.getName());
		
	}

	@Override
	public void delete(Game game) {
		games.remove(game);
		System.out.println("delete to db: " + game.getName());
		
	}

	@Override
	public void getAll() {
		System.out.println("----Game list---------------- ");	
		for (Game game : games) {
			System.out.println("Game: " + game.getName() + " | Price: " + game.getPrice());
		}
	}
}
