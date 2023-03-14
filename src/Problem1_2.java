import java.util.Scanner;

public class Problem1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("계산할 값 입력하시오 >> ");
        int money = scanner.nextInt();

        System.out.println("50000won : " + money/50000);
        money = money%50000;
        System.out.println("10000won : " + money/10000);
        money = money%10000;
        System.out.println("1000won : " + money/1000);
        money = money%1000;
        System.out.println("500won : " + money/500);
        money = money%500;
        System.out.println("100won : " + money/100);
        money = money%100;
        System.out.println("50won : " + money/50);
        money = money%50;
        System.out.println("10won : " + money/10);
        money = money%10;
        System.out.println("1won : " + money/1);

    }
}
