package homework;

public class HowManySentence {
    public static void main(String[] args) {
        String a = "Is it a saturday? Is it raining? Do we have a Java Class today?";
        String [] aArr = a.split("[.?!]");
        System.out.println("There are "+aArr.length+" sentences");

        }
    }
