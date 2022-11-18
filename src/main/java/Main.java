import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int unit [] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        System.out.print("금액을 입력하시오 >> ");
        int money = scanner.nextInt();
        int n;

        for(int i=0; i<unit.length; i++) {
            n = money/unit[i];
            if(n>0) {
                System.out.println(unit[i] + "원 짜리: " + n + "개");
                money = money%unit[i];
            }
        }
        scanner.close();
    }
}
