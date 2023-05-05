//iN PROTECTED Keyword we can access data memmber and method from within class or within package
// or it can be used outside class but with inheritance we can extends parent class from child class and create obj of child class

package AC_Protected.mypack;
import AC_Protected.pack.A;
 public class B extends A{
    public static void main(String args[]){
        B obj = new B();
        obj.msg();
        System.out.println(obj.a);
    }

}
