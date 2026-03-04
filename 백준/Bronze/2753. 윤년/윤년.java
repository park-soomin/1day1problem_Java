import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt();

        if ((years%4==0 && years%100!=0) || (years%400==0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}