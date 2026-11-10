public class Task3 extends Thread{
    public void task(){
        System.out.println("Task 3 executing on: " + Thread.currentThread().getName());
    }
    @Override
    public void run(){
        task();
    }
}
