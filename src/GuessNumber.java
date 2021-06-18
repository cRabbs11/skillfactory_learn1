import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private int randNumber = 0;

    private void generateRandNumber() {

        //Создаем экземпляр класса Random()
        Random rand = new Random();

        //Сохраняем случайное число в переменной randInt;
        randNumber = rand.nextInt(10) + 1;
    }

    public void startGuess() {

        Scanner scanner = new Scanner(System.in);

        generateRandNumber();
        System.out.printf("Игра угадай число \n");
        int playerNumber = randNumber+1;

        do {
            System.out.printf("введи число: ");
            playerNumber = scanner.nextInt();
            if (playerNumber>randNumber) {
                System.out.printf("Загаданное мною число меньше \n");
            } else if (playerNumber<randNumber) {
                System.out.printf("Загаданное мною число больше \n");
            }
        } while (playerNumber!=randNumber);

        System.out.printf("Совершенно верно! Это и есть загаданное мною число!");
    }
}
