class A1{
    A1(){
        System.out.println("Constructor A");
        
    }
    {
        System.out.println("Initialization Block");
    }
    public static void main(String[] args)
    {
        System.out.println("Main Start");
        A1 a=new A1();
        System.out.println("Main End");
    }
}

// Main Start
// Initialization Block
// Constructor A
// Main End