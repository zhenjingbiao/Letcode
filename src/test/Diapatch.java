package test;

public class Diapatch {
    public static void main(String[] args) {
        Human man=new Man();
        Human woman=new Woman();
        Diapatch diapatch=new Diapatch();
        diapatch.sayHello(man);
        diapatch.sayHello(woman);
    }



    public void sayHello(Human human) {
        System.out.println("human");
    }

    public void sayHello(Man man) {
        System.out.println("man");
    }

    public void sayHello(Woman woman) {
        System.out.println("woman");
    }

}
