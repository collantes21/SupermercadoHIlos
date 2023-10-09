// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Cliente 1 " ,
                new int[]{2,2,1,5,2,3});
        Cliente cliente2 = new Cliente("Cliente 2 " ,
                new int[]{1,3,5,1,1});
        Cliente cliente3 = new Cliente("Cliente 3 " ,
                new int[]{2,5,3,2,4});

        long initialTime=System.currentTimeMillis();
        //System.out.println(initialTime);

        CajeroThread cajero1=new CajeroThread("Cajero 1", cliente1, initialTime);
        CajeroThread cajero2=new CajeroThread("Cajero 2", cliente2, initialTime);
        CajeroThread cajero3=new CajeroThread("Cajero 3", cliente3, initialTime);


        cajero1.start();
        cajero2.start();
        cajero3.start();

        System.out.println(cajero1);
        System.out.println(cajero2);
    }
}