package Threading;

public class Implementation implements Runnable{
    @Override
    public synchronized void run() {
        for(int i=0;i<5;i++){
            System.out.println("new thread");
        }
    }
}
class MainThread{
    public static void main(String[] args) {
      //  Implementation obj=new Implementation();
        Thread obj1=new Thread(() -> {
            for(int i=0;i<5;i++){
                System.out.println("new xyz thread");
            }
        });
        obj1.start();
        Thread obj2=new Thread(new Implementation());
        obj2.start();
        System.out.println("lgv");
    }
}
