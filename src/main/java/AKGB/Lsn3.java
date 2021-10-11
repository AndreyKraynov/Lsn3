package AKGB;

import java.util.Scanner;

public class Lsn3 {
    public static void main(String[] args) {

        //Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3
//попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли
//указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
//выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).



            int y = 1;
            while (y != 0) {
                Scanner newGame = new Scanner(System.in);
                System.out.println("Хотите сыграть? (нажмите 1, если да или 0, если нет)");
                y = newGame.nextInt();
                System.out.println("Вы ввели: " + y);
            if (y == 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Угадайте число: от 0 до 9. У Вас есть 3 попытки!");

            int b = (int) (Math.random() * 10);
            for (int i = 0; i < 3; i++) {
                int a = sc.nextInt();
                System.out.println("Вы ввели число: " + a);
                if (a < b) {
                    System.out.println("Вы не угадали! Ваше число меньше загаданного!");
                    System.out.println("Осталось попыток: " + (2 - i));

                } else if (a > b) {
                    System.out.println("Вы не угадали! Ваше число больше загаданного!");
                    System.out.println("Осталось попыток: " + (2 - i));

                } else {
                    System.out.println("Вы угадали!");
                    break;
                }
            }

                System.out.println("Загаданное число: " + b);

                   } else if (y==0) {
                System.out.println("До новых встреч!1");
                    break;
                } else {
                    System.out.println("Вы ввели не корректное число! Повторите попытку");
                }

        }


    }
}


