public class MyOver extends Thread {
    public void run() {
            System.out.println("parent");
        }
    public  void run(int j){
            System.out.println("child");
        }
    static class De{
        public static void main(String[] args) {
           MyOver m=new MyOver();
           m.start();

        }
    }
}
