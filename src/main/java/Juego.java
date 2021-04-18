import java.util.Scanner;
public class Juego {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int o=0;
        while(o!=1) {
            Moneda moneda = new Moneda();
            moneda.lanzarMoneda();
            System.out.println(""+moneda.toString());
            System.out.println("0) Lanzar otra moneda\n1) Salir\nSeleccione una opcion: ");
            o=sc.nextInt();
        }
    }
}