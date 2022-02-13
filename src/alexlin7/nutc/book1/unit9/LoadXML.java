package alexlin7.nutc.book1.unit9;

import java.io.*;
import java.util.*;

public class LoadXML {
    public static void main (String[] args) throws IOException {
        var props = new Properties();
        props.loadFromXML(new FileInputStream("resource/person.xml"));
        System.out.println(props.getProperty("Alexlin7.nutc.username"));
        System.out.println(props.getProperty("Alexlin7.nutc.password"));
    }
}
