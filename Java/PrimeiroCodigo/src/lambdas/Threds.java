package lambdas;

public class Threds  // 2 execuções ao mesmo tempo
{
    public static void main(String[] args) {

        Runnable t1 = new Runnable() {      // Ruim
            public void run() {
                for (int i = 0; i <= 100; i++)
                {
                    System.err.println("tarefa #1");
                    try 
                    {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {}
                }
            }
        };


        Runnable t2 = () -> {               // Bom
            for (int i = 0; i <= 100; i++){
                System.err.println("tarefa #2");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {}
            }
        };

        Runnable t3 = Threds::trabalho3;    // Ótimo!       

        Thread trabalho1 = new Thread(t1);
        Thread trabalho2 = new Thread(t2);
        Thread trabalho3 = new Thread(t3);
        trabalho1.start();
        trabalho2.start();
        trabalho3.start();
    }

    static void trabalho3() {
        for (int i = 0; i <= 100; i++){
            System.err.println("tarefa #3");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}
        }
    }
}