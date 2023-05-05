package AM_Private;

public class AM_Private {
    private int data = 10;

    private void displaydata() {
        System.out.println("Hello java");
    }
//
    public static void main(String[] args) {
        AM_Private obj = new AM_Private();
        System.out.println(obj.data);//It does not give error
    }
}
class Main
{
    public static void main(String[] args) {
//        AM_Private obj = new AM_Private();
//        System.out.println(obj.data); //Compile time error you cannot access private data member in another class
//        obj.displaydata();
    }
}