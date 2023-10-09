import javax.swing.*;
import java.sql.SQLOutput;

public class CajeroThread extends Thread {

    private String nombre;

    private Cliente cliente;

    private long initialTime;

    public CajeroThread(){

    }

    public CajeroThread(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void run(){
        System.out.println("La cajera " + this.nombre + " comienza a procesar la compra del cliente "
                + this.cliente.getNombre()+" en el tiempo de "
                + (System.currentTimeMillis()-this.initialTime)/1000 + " seg");
        for(int i=0; i<this.cliente.getCarroCompra().length; i++){
            //Se procesa el pedido en X segundos
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesador del producto "
                    +(i+1)+ " del cliente "
                    +this.cliente.getNombre()+ "->Tiempo: "
                    + (System.currentTimeMillis()-this.initialTime)/1000
                    + " seg") ;
        }

        System.out.println("La cajera "
                + this.nombre
                + " Ha terminado de procesar "
                + this.cliente.getNombre()
                + " en el tiempo "
                + (System.currentTimeMillis()-this.initialTime)/1000
                + " seg");

    }

    private void esperarXsegundos(int segundos){

        try {
            Thread.sleep(segundos+1000);
        } catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }





}
