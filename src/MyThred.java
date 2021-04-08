public class MyThred extends Thread{
    public void run()
    {
        System.out.println("parent");
    }
    public void run(int i)
    {
        System.out.println("child");
    }
    static class Mydem
    {
        public static void main(String[] args)
        {
            MyThred t1=new MyThred();
            t1.start();
        }
    }

}
