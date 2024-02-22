package bronze4_5.sec05;

import java.util.Scanner;

public class ex09_5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minBurger = 2000;
        int minDrink = 2000;

        for (int i = 0; i < 3; i++) {
            int burger = sc.nextInt();
            if(burger < minBurger) minBurger = burger;
        }
        for (int i = 0; i < 2; i++) {
            int drink = sc.nextInt();
            if(drink < minDrink) minDrink = drink;
        }

        System.out.println(minBurger + minDrink - 50);

    }
}
