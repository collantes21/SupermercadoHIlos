public class Supermercado {

    int numHilo=0;
    public class Saludo extends Thread {

        int numHilo=0;


        public Saludo(int numHilo) {
            this.numHilo = numHilo;
        }


        @Override
        public void run() {
            System.out.println("..... ARRANCA EL HILO  " + numHilo);
            for (int i=0; i<3;i++){

                System.out.println("El hilo N " + numHilo+" Te saluda" + "    Vez : " + (i+1));
            }
        }

    }

}
