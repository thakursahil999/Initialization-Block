class A3{
    A3(){
        System.out.println("Constructor A3");
    }
    static{
        System.out.println("static Initialization block ");
    }
    public static void main(String[] args) {
        System.out.println("Main Start");
        A3 b=new A3();
        System.out.println("Main End");
        }
}

// static Initialization block 
// Main Start
// Constructor A3
// Main End