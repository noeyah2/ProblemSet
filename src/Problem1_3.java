import java.util.Scanner;
public class Problem1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x,y,z;
        System.out.println("x,y,z를 입력하시오 >>");

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if(x+y>z && x+z>y && y+z>x){
            System.out.println("삼각형입니다.");
        }
        else System.out.println("삼각형이 아닙니다.");
    }
}
