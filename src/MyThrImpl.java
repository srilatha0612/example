public class MyThrImpl implements Runnable
{
    public void run(){
        System.out.println("parent method");
    }
}
class Det{
    public static void main(String[] args) {
        MyThrImpl m=new MyThrImpl();
        Thread t=new Thread(m);
        t.start();
        System.out.println("main");
    }

}
