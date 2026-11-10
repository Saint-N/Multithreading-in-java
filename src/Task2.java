//public class Task2 extends Thread{
//    public void task(){
//        System.out.println("Task 2 executing on: " + Thread.currentThread().getName());
//    }
//    @Override
//    public void run(){
//        task();
//    }
//}
public class Task2 implements Runnable{
    public void task(){
        System.out.println("Task2 executing on: " + Thread.currentThread().getName());
    }
    @Override
    public void run(){
        task();
    }
}