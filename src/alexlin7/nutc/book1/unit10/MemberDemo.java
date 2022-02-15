package alexlin7.nutc.book1.unit10;

import java.io.IOException;

public class MemberDemo {
    public static void main(String[] args) throws IOException {
        Member[] members = {
                new Member("B1234", "Justin", 90),
                new Member("B5678", "Monica", 95),
                new Member("B9876", "Irena", 18)
        };
        for(var member : members) {
            member.save();
        }
        System.out.println(Member.load("B1234"));
        System.out.println(Member.load("B5678"));
        System.out.print(Member.load("B9876"));
    }
}
