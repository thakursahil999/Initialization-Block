class A8{
    static int count=0;
    static int cou=0;
    A8(){
        System.out.println("Constructor");
       cou++;
       System.out.println(cou);
    }
    {
        count++;
        System.out.println("Ib:"+A8.count);
    }
    
    public static void main(String[] args) {
        A8 x=new A8();
        A8 y=new A8();
        A8 z=new A8();
       
    }

}

// Ib:1
// Constructor
// 1
// Ib:2
// Constructor
// 2
// Ib:3
// Constructor
// 3