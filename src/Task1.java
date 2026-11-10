//public class Task1 extends Thread{
//    public void task(){
//        System.out.println("Task 1 executing on:" + Thread.currentThread().getName());
//    }
//    @Override
//    public void run(){
//        task();
//    }
//}
public class Task1 implements Runnable{
    public void task(){
        System.out.println("Task1 executing on: " + Thread.currentThread().getName());
    }
    @Override
    public void run(){
        task();
    }
}
