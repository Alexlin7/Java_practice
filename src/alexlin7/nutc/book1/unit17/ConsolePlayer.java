package alexlin7.nutc.book1.unit17;

public class ConsolePlayer implements Player {
    @Override
    public void play(String video) {
        System.out.println("正在播放" + video);
    }
}
