package alexlin7.nutc.unit9;

import java.io.*;
import java.util.*;

public class LoadProperties {
    public static void main (String[] args) throws IOException {
        var props = new Properties();
        props.load(new FileInputStream("resource/person.properties"));
        System.out.println(props.getProperty("username"));
        System.out.println(props.getProperty("password"));


    }
}
