package evolutionOfJava.java13;

public class TextBlocks {
    public static void main(String[] args) {
        String json = """
                {
                    "name": "Alice",
                    "age": 30
                }
                """;
        System.out.println(json);

        String names = """
                {
                "First Name" : "Apurva",
                "Second Name": "Rajasekharuni:
                }
                """;
        System.out.println(names);

    }
}
