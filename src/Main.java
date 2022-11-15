import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        Scanner sc=new Scanner(System.in);
        k= sc.nextInt();
        for(int i=0;i<k;i++) {
            long n;
            n = sc.nextLong();
            if (n >= 1900) {
                System.out.println("Division 1");
            } else if (n >= 1600 && n <= 1899) {
                System.out.println("Division 2");
            } else if (n >= 1400 && n <= 1599) {
                System.out.println("Division 3");
            } else if (n <= 1399) {
                System.out.println("Division 4");
            }
        }
    }
}