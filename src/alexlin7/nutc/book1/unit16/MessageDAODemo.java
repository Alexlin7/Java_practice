package alexlin7.nutc.book1.unit16;

import java.util.Scanner;

public class MessageDAODemo {
    public static void main(String[] args) throws Exception{
        var jdbcUrl = "jdbc:postgresql://localhost:5432/test1";
        var username = args[0];
        var password = args[1];
        var dao = new MessageDAO(jdbcUrl, username, password);
        var console = new Scanner(System.in);
        while(true) {
            System.out.print("(1) 顯示留言 (2) 新增留言:");
            switch (Integer.parseInt(console.nextLine())) {
                case 1 -> dao.get().forEach(message -> System.out.printf("%d\t%s\t%s\t%s\n",
                        message.getId(),
                        message.getName(),
                        message.getEmail(),
                        message.getMsg()));
                case 2 -> {
                    System.out.print("姓名: ");
                    var name = console.nextLine();
                    System.out.print("郵件: ");
                    var email = console.nextLine();
                    System.out.print("留言: ");
                    var msg = console.nextLine();
                    dao.add(new Message(name, email, msg));
                }
            }
        }
    }
}
