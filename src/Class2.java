public class Class2 extends Class1{
    static {
        System.out.println("class2 static block");
    }
    {
        System.out.println("class2 instance block");
    }
    Class2(){
        System.out.println("class2 constructor");
    }
    void m1(){
        System.out.println("class2 m1 method");
    }
    void m4(){
        System.out.println("class2 m2 method");
    }

public static void main(String[] args) {
    System.out.println("class2 main program");
    Class0 obj2 = new Class2();
    obj2.m4();
}
    
}
