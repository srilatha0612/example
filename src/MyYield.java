public class MyYield extends Thread {
    public void run(){
        for (int i=0;i<=5;i++){
            Thread.yield();
            System.out.println("child");
        }
    }
}
class DemoMy{
    public static void main(String[] args) {
        MyYield y=new MyYield();
        y.start();
        System.out.println("main");
    }
}
