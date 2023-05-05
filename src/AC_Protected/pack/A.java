package AC_Protected.pack;

public class A {
    protected int a = 20;

    protected void msg() {
        System.out.println("Hello hinal");
    }

}
class B {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.a);
        obj.msg();
    }
}
