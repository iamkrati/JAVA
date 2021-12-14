package Threading;

public class MThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("new thread");
        }
    }
}
class Test{
    public static void main(String[] args) {
        MThread OBJ=new MThread();
        OBJ.start();
        for(int i=0;i<5;i++){
            System.out.println("main thread");
        }

    }
}
