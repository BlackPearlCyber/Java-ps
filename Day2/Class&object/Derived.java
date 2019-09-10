public class Derived extends Base {
    int b ,tot ;
    Derived (int a, int b) {
        super(a);
        this.b=b;

    }
    public void sum()
    {
       tot = a+b;
       System.out.println("Total="+tot);
       
    }
    public static void main (String [] muthu) {
        Derived obj1 = new Derived (3,4);
        obj1.sum ();
    }
}