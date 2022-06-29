package alexlin7.nutc.other;

public class Jvm {
    public static void main(String[] args) {
        Class clazz = "abc".getClass();
        System.out.println(clazz.getName());

        int[] myArrays = {1, 2, 3};
        clazz = myArrays.getClass();
        System.out.println(clazz.getName());
    }
}
