public class ImplRunn implements Runnable {
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println("parent");
        }
    }
}
class ThreadDemo{
    public static void main(String[] args) {
        ImplRun i=new ImplRun();
        Thread t=new Thread(i);
        t.start();
        for(int ii=0;ii<=5;ii++){
            System.out.println("main thread");
        }
    }
}
