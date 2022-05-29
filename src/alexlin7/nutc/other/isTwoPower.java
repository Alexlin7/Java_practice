package alexlin7.nutc.other;

import java.util.Scanner;

public class isTwoPower {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if((a&(a-1)) == 0) {
            System.out.println("是2的次方");
        } else {
            System.out.println("不是2的次方");
        }
    }


}
