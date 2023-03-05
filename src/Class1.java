public class Class1 extends Class0{
    static {
        System.out.println("class1 static block");
    }
    {
        System.out.println("class1 instance block");
    }
    Class1(){
        System.out.println("class1 constructor");
    }
    void m1(){
        System.out.println("class1 m1 method");
    }
    void m3(){
        System.out.println("class1 m2 method");
    }
public static void main(String[] arg) {
    System.out.println("class1 main program");
    Class1 obj1 = new Class1();
}
    
}
