//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Task1 task1 = new Task1();
//        Task2 task2 = new Task2();
//        Task3 task3 = new Task3();

//        Thread t1 = new Thread(task1); Create new object for thread class since we can't directly use start and without using start we cannot access run() for multithreading.
//        Thread t2 = new Thread(task2);
//        Thread t3 = new Thread(task3);

//        task1.start();
//        task2.start();
//        task3.start();
        //Lambda Function
        Thread t1 = new Thread(() -> System.out.println("Task1 executing on: " + Thread.currentThread().getName()));
        Thread t2 = new Thread(() -> System.out.println("Task2 executing on: " + Thread.currentThread().getName()));
        Thread t3 = new Thread(() -> System.out.println("Task3 executing on: " + Thread.currentThread().getName()));
        //Start threads for lambda function
        t1.start();
        t2.start();
        t3.start();
    }
}