public class OverStart1 extends Thread {
    public void start(){
        System.out.println("start method ");
    }
    public void run(){
        System.out.println("run method");
    }
}
class Dep{
    public static void main(String[] args) {
        OverStart1 o=new OverStart1();
        o.start();
        System.out.println("main");
    }
}
