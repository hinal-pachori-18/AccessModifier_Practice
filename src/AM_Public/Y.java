package AM_Public;
import AM_Public.Z.*;

class Simple{

        void msg(){System.out.println("Hello java");}
    }

    public class Y extends Simple {
         void msg(){System.out.println("Hello java");
        }//C.T.Error
        public static void main(String args[]){
            Simple obj=new Simple();
            Zindex zobj = new Zindex();
            obj.msg();
            System.out.println(zobj.a);
        }
    }

