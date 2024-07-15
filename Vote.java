class voter {
    private int voterId;
    private String name;
    private int age;

    public voter(int voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Getters and setters (omitted for brevity)
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
 public class Vote {
    public static void main(String[] args) {
        try {
            voter voter1 = new voter(1, "Ganesh", 20);
            voter voter2 = new voter(2, "Abi", 18);
            System.out.println("Valid oge of vote");
            System.out.println("Invalid age of vote");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}