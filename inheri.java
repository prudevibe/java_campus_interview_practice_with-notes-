/**
 * inheri
 */
public class inheri {

    protected int height;
    protected int width;
    public void set_values(int a,int b)
    {
        height=a;
        width = b;

    }
    public static void main(String[] args) {
        rect rect1 =new rect();
        tringle tr1=new tringle();
        rect1.set_values(10,20);
        tr1.set_values(20, 30);
        System.out.println("rectangle one area is" + rect1.area());
        System.out.println("triangle area is"+ tr1.area());
    }
}
