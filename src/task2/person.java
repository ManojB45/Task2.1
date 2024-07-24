package task2;

public class person {
	 private String name;
	    private int age;

	    // Default constructor with default age of 18
	    public person(String name) {
	        this.name = name;
	        this.age = 18;
	    }

	    // Constructor with name and age
	    public person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Method to display name and age
	    public void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	

	// Main method for testing
    public static void main(String[] args) {
        person person1 = new person("John Doe");
        person1.display();  // Output: Name: John Doe, Age: 18

        person person2 = new person("Jane Smith", 25);
        person2.display();  // Output: Name: Jane Smith, Age: 25
    }
}
