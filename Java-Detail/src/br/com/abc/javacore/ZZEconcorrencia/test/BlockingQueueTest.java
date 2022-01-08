package br.com.abc.javacore.ZZEconcorrencia.test;

import java.util.concurrent.*;

public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        Thread t1 = new Thread(new RemoveFromQueue(bq));
        bq.put("Darlan");
        System.out.println(bq.peek());
        System.out.println("Tentando colocar outro valor");
        t1.start();
        bq.put("DevDojo o melhor dojo de TI do Brasil");
        System.out.println("Inserido o último valor");
    }

    static class RemoveFromQueue implements Runnable {
        private BlockingQueue<String> bq;

        public RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " entrando em espera por 2s");
            try {
                TimeUnit.SECONDS.sleep(5);
                System.out.println("Removendo o valor: " + bq.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
