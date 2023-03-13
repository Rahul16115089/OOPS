package Oops.Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*for (int i=0;i<100;i++){
            MultithreadingDemo obj = new MultithreadingDemo(i);
            obj.start();
        }*/

        /*
        Oops.Thread.currentThread().setPriority(1);
        ThreadJoinDemoA a = new ThreadJoinDemoA(5);
        ThreadJoinDemoB b = new ThreadJoinDemoB(5);

        Oops.Thread at = new Oops.Thread(a);
        at.setPriority(10);
        Oops.Thread bt = new Oops.Thread(b);
        bt.setPriority(10);
        at.start();
        at.join();
        bt.start();
        System.out.println("Threads completed");
        */
        ExecutorService service = Executors.newFixedThreadPool(3);
        SynchronizedMethods summation = new SynchronizedMethods();

        IntStream.range(0, 1000)
                .forEach(count -> service.submit(summation::calculate));
        service.awaitTermination(1, TimeUnit.MILLISECONDS);
        System.out.println(summation.getSum());
        service.shutdown();




    }


}