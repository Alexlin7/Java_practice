package alexlin7.nutc.unit9;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    collectNameTo(names);
    System.out.println("訪客名單: ");
    printUpperCase(names);
  }

  static void collectNameTo(ArrayList<String> names) {
    Scanner userInput = new Scanner(System.in);
    while(true) {
      System.out.print("訪客名稱:");
      String name = userInput.nextLine();
      if(name.equals("quit")) break;
      names.add(name);
    }
    userInput.close();
  }

  static void printUpperCase(ArrayList<String> names) {
    for(int i = 0; i < names.size(); i++) {
      String name = (String) names.get(i);
      System.out.println(name.toUpperCase());
    }
  }
}