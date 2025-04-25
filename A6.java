class A6{
    String phone;
    String degree;
    A6(String name,int age,String branch){
        System.out.println(name);
        System.out.println(age);
        System.out.println(branch);
    }
   
    void info(String phone,String degree)
    {
        this.phone=phone;
        this.degree=degree;
        System.out.println(phone);
        System.out.println(degree);
        {
            System.out.println("Initialization block");
        }

    }
    public static void main(String[] args) {
        A6 x=new A6("Sahil", 20, "CSE");
        x.info("93020255","Btech.");
        System.out.println("Main End");
    }
}

// Sahil
// 20
// CSE
// 93020255
// Btech.
// Initialization block
// Main End