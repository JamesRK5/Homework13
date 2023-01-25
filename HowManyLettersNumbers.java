package homework;

public class HowManyLettersNumbers {
    public static void main(String[] args) {
        int alphaNum = 0;
        String str = "jhweoijfgLIUGHKLG374356)*(^&(&^";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i))){
alphaNum++;
            }
        }
        System.out.println(alphaNum);
    }
}
