public class MyOver2 extends Thread
{
    public void run()
    {
        System.out.println("parent");
    }
    public void run(int i)
    {
        System.out.println("child");
    }
    static class Demn{
        public static void main(String[] args)
        {
            MyOver2 o=new MyOver2();
            o.start();
        }
    }
}
