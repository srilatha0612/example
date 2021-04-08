public class MyT implements Runnable {
    public void run() {
        System.out.println("parent class");
    }
}
class Dd{
    public static void main(String[] args) {
        MyT t=new MyT();
        Thread t1=new Thread(t);
        t1.start();
        System.out.println("main thread");
    }
}
