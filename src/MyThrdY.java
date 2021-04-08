public class MyThrdY extends  Thread {
    public void run(){
        for (int i=0;i<=5;i++){
            Thread.yield();
            System.out.println("child");
        }
    }
}
class Dddd{
    public static void main(String[] args) {
        MyThrdY m=new MyThrdY();
        m.start();
        System.out.println("main");
    }
}
