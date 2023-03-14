package ProblemSet1;

import java.util.Scanner;
public class Problem1_1 {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("원의 중심인 점 (x,y)의 좌표를 입력하시오>>"); //Input point(x,y)
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println("원의 반지름을 입력하시오>>");
        int rad = scan.nextInt();

        System.out.println("확인할 점 (a,b)의 좌표를 입력하시오>>"); //Input point(x,y)
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (Math.pow(rad,2) > (Math.pow(x-a,2)) + Math.pow(y-b,2)){
            System.out.println("a,b는 원 안에 있습니다.");}
        else
        System.out.println("a,b는 원 밖에 있습니다.");

    }
}