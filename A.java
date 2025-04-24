class A{
    A(){
        System.out.println("Constructor A");
        {
            System.out.println("Initialization Block");
        }
    }
   
    public static void main(String[] args)
    {
        System.out.println("Main Start");
        A a=new A();
        System.out.println("Main End");
    }
}

// Main Start
// Constructor A
// Initialization Block
// Main End
