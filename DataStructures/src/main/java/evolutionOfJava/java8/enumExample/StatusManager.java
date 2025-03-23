package evolutionOfJava.java8.enumExample;

public enum StatusManager {
    TO_DO("To Do"),
    IN_PROGRESS("In Progress"),
    DONE("Done");

    private final String label;

    StatusManager(String label) {
        this.label = label;
    }

//    public static StatusManager fromString(String text) {
//        for (StatusManager status : StatusManager.values()) {
//            if (status.label.equalsIgnoreCase(text)) {
//                return status;
//            }
//        }
//        throw new IllegalArgumentException("No status found for " + text);
//    }
}
