// Examples

// Singleton 
public class Restaurant{
    private static Restaurant _instance = null;
    private Restaurant(){}
    public static Restaurant getInstance(){
        if (_instance == null){
            _instance = new Restaurant;
        }
        return _instance;
    }      
}

// Factory Method
public class CardGame{
    public static CardGame createCardGame(GameType type){
        if (type == GameType.Poker){
            return new PokerGame();
        }else if (type == GameType.BlackJack){
            return new BlackJack();
        }
        return null;
    }
}


