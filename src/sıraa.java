import java.util.Scanner;

public class sıraa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0;
        do {
            System.out.print("Bir sayı girin (programı sonlandırmak için 0 girin): ");
            number = input.nextInt();
            if (number % 4 == 0 && number != 0) {
                sum += number;
            } else if (number % 2 == 0 && number != 0) {
                sum += number;
            }
        } while (number != 0);
        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + sum);
    }
}