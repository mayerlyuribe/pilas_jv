package Pilita_1;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la capacidad de la pila:");
        int capacidad = scanner.nextInt();

        pilaNumbers numerolocos = new pilaNumbers(capacidad);
        for (int i = 0; i < 5; i++){
            int aleatorio = (int) (Math.random() * 10);
            String number = String.valueOf(aleatorio);
            numerolocos.agregarNumbers(number);
        }
        //mejorar parte para apilar los valores por interfaz o directamente aleatorios.
        numerolocos.mostrarPila();
        numerolocos.desapilarNumbers();//desapila, o bueno toma el numero que está en el tope y lo borra de la pilita
        numerolocos.mostrarPila();
        numerolocos.agregarNumbers("7");//agrega nuevos números a la pila manualmente
        numerolocos.agregarNumbers("99");
        numerolocos.mostrarPila();
        numerolocos.mostrarCapacidad();
    }

}
