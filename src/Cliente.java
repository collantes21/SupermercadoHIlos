public class Cliente {

    int numHilo=0;
    public class Saludo {

        private String nombre;
        private int[] carroCompra;

        public Saludo(String nombre, int[] carroCompra) {
            this.nombre = nombre;
            this.carroCompra = carroCompra;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int[] getCarroCompra() {
            return carroCompra;
        }

        public void setCarroCompra(int[] carroCompra) {
            this.carroCompra = carroCompra;
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
