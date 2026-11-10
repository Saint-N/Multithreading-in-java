public class Task2 extends Thread{
    public void task(){
        System.out.println("Task 2 executing on: " + Thread.currentThread().getName());
    }
    @Override
    public void run(){
        task();
    }
}
