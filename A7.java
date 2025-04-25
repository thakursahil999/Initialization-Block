class Exp {
    String name;
    int age;
    String branch;
    String defaultGreeting;

    // Initialization Block - runs before constructor
    {
        defaultGreeting = "Welcome to the Java world!";
        System.out.println("Initialization block executed.");
    }

    // Constructor
    Exp(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
        System.out.println("Constructor executed.");
    }

    // Method to display student info
    void info(String phone, String degree) {
        System.out.println(defaultGreeting);  // From the init block
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
        System.out.println("Phone: " + phone);
        System.out.println("Degree: " + degree);
    }
}

 class A7{
    public static void main(String[] args) {
        Exp x = new Exp("Sahil", 20, "CSE");
        x.info("93020255", "BTech");
        System.out.println("Main End");
    }
}
