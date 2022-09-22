class myThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}

class myThread2 implements Runnable{
    public void run(){
        System.out.println("Multi is running");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        try {
            myThread newThread = new myThread();
            newThread.start();
            Thread thread=new Thread(new myThread2());
            thread.start();
        }
        catch (Exception e){
            System.out.println("Exception caught - "+e);
        }
    }
}
