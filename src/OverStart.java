public class OverStart extends Thread {
    public void start() {
        System.out.println("parent");
    }

    public void run() {
        System.out.println("child");
    }
}
    class Dem1{
        public static void main(String[] args) {
            OverStart o1=new OverStart();
            o1.start();
            System.out.println("main method");
        }
    }

