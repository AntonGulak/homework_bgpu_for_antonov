package task1;

public class Playing_card {
    public static final String[] SUITS_LIST = {
            "Пик", "Бубен", "Черв", "Треф"
    };

    public static final String[] RANK_LIST = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Валет", "Королева", "Король", "Туз"
    };

    private String suit = null;
    private String rank = null;
    private int number_games;

    public Playing_card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }


    @Override
    public String toString() {
        System.out.println(rank+" "+suit);
        return rank+" "+suit;
    }
}
