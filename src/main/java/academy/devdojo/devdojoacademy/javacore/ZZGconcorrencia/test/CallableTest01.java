package academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

class RandonNumberCallable implements Callable<String>{
    @Override
    public String call() throws Exception {
        int count = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < count; i++) {
            System.out.printf("%s executando uma tarefa callable...  %n", Thread.currentThread().getName());
        }
        return String.format( "%s finished and the random number is %d", Thread.currentThread().getName(), count);
    }
}
public class CallableTest01 {
    public static void main(String[] args) {
        RandonNumberCallable randonNumberCallable = new RandonNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<String> submit = executorService.submit(randonNumberCallable);
        String s = null;
        try {
            s = submit.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Program Finished %s", s);
        executorService.shutdown();
    }
}
