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

    //Раздача карт каждому игроку
    public void PrintCard()
    {
        int tmp =0 ;

        for (int i = 0; i < players; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.println(coloda_cart[tmp++]);
            }

            System.out.println("");
        }
    }

    //Массив для колоды карт
    private static String[] coloda_cart = new String[52];


    public void rand ()
    {
        //Получение  неразмешанной колоды карт
        int tmp = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 13; j++)
            {
                coloda_cart[tmp++] = SUITS_LIST[i] + " " + RANK_LIST[j];
            }

        }

        //Получение размешанной колоды карт
        for (int i = 0; i < 528; i++)
        {
            var j = (int) (Math.random()*52);
            var k = (int) (Math.random()*52);

            String str_tmp = coloda_cart[j];
            coloda_cart[j] = coloda_cart[k];
            coloda_cart[k] = str_tmp;
        }

    }
    //Количество игроков
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
