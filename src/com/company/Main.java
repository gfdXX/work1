import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int end = 2_147_483_647;
        int mid = (start + end) / 2;
        boolean isFound = false;
        int number; //1 - меньше; 2 - больше ; 0 - ровно
        int count = 1;
        while (!isFound) {
            System.out.println(count + ":число попыток)" + "Ваше число " + mid + "?");
            System.out.println("1 - слева; 2 - справа; 0 - равно");
            number = in.nextInt();
            if (number == 1) {
                end = mid;
                mid = (start + end) / 2;
            }
            if (number == 2) {
                start = mid;
                mid = (start + end) / 2;
            }
            if (number == 0) {
                isFound = true;
                System.out.println("Ваше число " + mid + "!");
            }
            count++;
        }
    }
}