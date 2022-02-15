package alexlin7.nutc.book1.unit10;

import java.io.IOException;

public class MemberDemo2 {
    public static void main(String[] args) throws IOException {
        Member2[] members = {
                new Member2("B1234", "Justin", 90),
                new Member2("B5678", "Monica", 95),
                new Member2("B9876", "Irena", 18)
        };
        for(var member : members) {
            member.save();
        }
        System.out.println(Member.load("B1234"));
        System.out.println(Member.load("B5678"));
        System.out.print(Member.load("B9876"));
    }
}
