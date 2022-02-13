package alexlin7.nutc.book1.unit9;

import java.io.*;
import java.util.*;

public class LoadSystemProps {
    public static void main(String[] args) {
        var props = System.getProperties();
        System.out.println(props.getProperty("username"));
        System.out.println(props.getProperty("password"));
    }

}
