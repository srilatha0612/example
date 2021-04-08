public class Yield extends Thread {
    public void run(){
        for(int i=0;i<=5;i++){
            Thread.yield();
            System.out.println("child");
        }
    }
    static class ThreadDemo7{
        public static void main(String[] args) {
            Yield y=new Yield();
            y.start();
            for(int i=0;i<=5;i++){
                System.out.println("main");
            }
        }

    }
}
