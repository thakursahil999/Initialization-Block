class A4{
    A4(){
        System.out.println("Constructor A4");
        static{
            System.out.println("static Initialization block ");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Main Start");
        A4 b=new A4();
        System.out.println("Main End");
        }
}

// we can use static initialization block inside constructor

