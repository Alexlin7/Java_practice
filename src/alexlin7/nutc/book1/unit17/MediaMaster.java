package alexlin7.nutc.book1.unit17;

import java.util.Scanner;

public class MediaMaster {
    public static void main(String[] args)
            throws ReflectiveOperationException{
        var playerImp1 = System.getProperty("alexlin7.nutc.book1.unit17.PlayerImp1");
        var player = (Player) Class.forName(playerImp1)
                .getDeclaredConstructor()
                .newInstance();
        System.out.print("輸入想看的影片");
        player.play(new Scanner(System.in).nextLine());
    }
}
