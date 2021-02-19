package task1;

public class Playing_card {
    public static final String[] SUITS_LIST = {
            "Пик", "Бубен", "Черв", "Треф"
    };

    public static final String[] RANK_LIST = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Валет", "Королева", "Король", "Туз"
    };

    public Playing_card() {
        rand();
    }

    private static String[][] coloda_cart = new String[4][13];

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

        int temp1_rand = (int) (Math.random() * 255);
        int temp2_rand = (int) (Math.random() * 255);

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 13; j++)
            {
                int t1_i = (i+temp1_rand)%4;
                int t2_i = (i+temp2_rand)%4;

                int t1_j = (j+temp1_rand)%13;
                int t2_j = (j+temp2_rand)%13;

                String temp = coloda_cart[t1_i][t1_j];
                coloda_cart[t1_i][t1_j] = coloda_cart[t2_i][t2_j];
                coloda_cart[t2_i][t2_j] = temp;

            }

        }

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 13; j++)
            {
                System.out.println(coloda_cart[i][j]);
            }

        }




    }

    private int players;

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
