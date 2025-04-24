class A5{
    A5(){
        System.out.println("Constructor A5");
    }
    void pro(){
        System.out.println("Method");
        {
            System.out.println("Initialization block inside method");
        }
    }
    public static void main(String[] args) {
        System.out.println("Main Start");
        A5 x=new A5();
        x.pro();
        System.out.println("Main End");
    }
}

// Main Start
// Constructor A5
// Method
// Initialization block inside method
// Main End