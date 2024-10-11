package baseball.service;

public class GameService {
    private static final GameService instance = new GameService();
    public static GameService getInstance() {
        return instance;
    }
    private GameService(){
    }
}
