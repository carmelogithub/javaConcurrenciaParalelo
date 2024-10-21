public class EjemploHilo  extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Ejecutando hilo " + i);
        }
    }

    public static void main(String[] args) {
        EjemploHilo hilo = new EjemploHilo();
        EjemploHilo hilo2= new EjemploHilo();
        hilo.start();

        hilo2.start();
    }
}
