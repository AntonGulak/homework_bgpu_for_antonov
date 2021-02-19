package task1;

public class Playing_card {
    public static final String[] SUITS_LIST = {
            "Пик", "Бубен", "Черв", "Треф"
    };

    public static final String[] RANK_LIST = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Валет", "Королева", "Король", "Туз"
    };

    private String[][] coloda_cart = new String[4][13];


    private int players;

    public Playing_card() {
        rand();
    }

    public void rand ()
    {
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 13; j++)
            {
                coloda_cart[i][j] = SUITS_LIST[i] + " " + RANK_LIST[j];
                //System.out.println(coloda_cart[i][j]);
            }

        }

        int temp = (int) (Math.random() * 13);

        System.out.println(temp);


    }

    public int getNumber_games() {
        return players;
    }

    public void setNumber_games(int number_games) {
        if (number_games > 0 && number_games < 6) {
            this.players = number_games;
        }
        else
            System.out.println("Не хватит карт, введите от 1 до 5 игроков");
    }



}
