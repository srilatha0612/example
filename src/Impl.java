public class Impl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("run method");
        }
    }
    }    class ThredDemo{
        public static void main(String[] args) {
            Impl i=new Impl();
            Thread t=new Thread(i);
            t.start();
            for(int ii=0;ii<=5;ii++){
                System.out.println("main");
            }
    }
}
