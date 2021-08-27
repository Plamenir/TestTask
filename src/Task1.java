import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        number = sc.nextInt();
        if (isPalindrome(number)) {
            System.out.println("Ваше число - палиндром!");
        } else {
            System.out.println("Ваше число не является палиндромом!");
        }
    }

     static private boolean isPalindrome(int number) {
        int remainder = 0, summ = 0;
        int temp = number;
        while (number > 0) {
            remainder = number % 10;
            summ = (summ * 10) + remainder;
            number = number / 10;
        }
        if(temp == summ) {
            return true;
        }
        return false;
    }
}
