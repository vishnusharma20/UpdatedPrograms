

public class A {

    public void print(){

        System.out.println("A");
    }
}


class B extends  A{

    public void print(){

        System.out.println("B");
    }

}


class C{

    int b=0;
    int a=b+2;

    public static void main(String[] args) {


       /* A a= new A();
        B b= new B();

        ((A)b).print();
        a=b;
        a.print();*/



       C c = new C();
        System.out.println("a ="+ c.a+",b="+c.b);

    }
}
