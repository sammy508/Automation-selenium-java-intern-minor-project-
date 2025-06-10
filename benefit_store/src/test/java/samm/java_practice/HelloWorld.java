package samm.java_practice;


public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        System.out.println(hw.sayHello());
        System.out.println("2 + 3 = " + hw.add(2, 3));
    }

    public String sayHello(){
        return "Hello world";
    }
    public int add(int a, int b){
        return a+b;
    }
}


