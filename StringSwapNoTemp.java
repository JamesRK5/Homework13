package homework;

public class StringSwapNoTemp {
    public static void main(String[] args) {
String one = "I wanna swap";
String two = "Put me in the other String";
        System.out.println(one.replaceAll("I wanna swap","Put me in the other String"));
        System.out.println(two.replaceAll("Put me in the other String","I wanna swap"));
    }
}
