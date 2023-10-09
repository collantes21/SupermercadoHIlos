    public class Cliente {

        private String nombre;
        public static int[] carroCompra;

        public Cliente(String nombre, int[] carroCompra) {
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

//        @Override
//        public void run() {
//            System.out.println("..... ARRANCA EL HILO  " + numHilo);
//            for (int i=0; i<3;i++){
//
//                System.out.println("El hilo N " + numHilo+" Te saluda" + "    Vez : " + (i+1));
//            }
//        }

    }


