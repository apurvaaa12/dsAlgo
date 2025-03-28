package evolutionOfJava.java12;

public class SwitchExpressions {
    public static void main(String[] args){
        int number = 100;
        String result = switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> "Unknown";
        };

        System.out.println(result);

    }
}
