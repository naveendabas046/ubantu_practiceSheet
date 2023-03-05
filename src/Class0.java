public class Class0 {
    static {
        System.out.println("class0 static block");
    }
    {
        System.out.println("class0 instance block");
    }
    Class0(){
        System.out.println("class0 constructor");
    }
    void m1(){
        System.out.println("class0 m1 method");
    }
    void m2(){
        System.out.println("class0 m2 method");
    }
  

    public static void main(String[] args) throws Exception {
        System.out.println("class0 main program");
        Class0 obj0 = new Class0();

    }
}
