package task1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = in.nextInt();

        Playing_card distribution = new Playing_card();

        distribution.setNumber_games(n);

        distribution.PrintCard();

        in.close();



    }
}
