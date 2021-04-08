public class ImplRun implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<=5;){
            System.out.println("run method");
        }
    }
}
class MyD{
    public static void main(String[] args) {
        ImplRun i=new ImplRun();
        Thread t=new Thread(i);
        for(int ii=0;ii<=5;ii++){
            System.out.println("main method");
        }
    }
}
