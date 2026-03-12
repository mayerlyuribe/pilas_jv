package Pilita_1;
import java.util.Stack;

public class pilaStack {
    public static void main(String[] args) {
        Stack<String> pilaNumbers1 = new Stack<>();

        for (int i = 0; i<7; i++){
            int aleatorio = (int) (Math.random() * 10);
            String number = String.valueOf(aleatorio);
            pilaNumbers1.push(number);
        }
        System.out.println("\nPila 1 con 7 numeritos aleatorios:");
        System.out.println(pilaNumbers1.toString());
        System.out.println("--------------------------------------------------");

        Stack<String> pilaNumbers2 = new Stack<>();

        for(int j = -1; j < 6; ++j){
            pilaNumbers2.push(pilaNumbers1.peek());
            pilaNumbers1.pop();
        }
        System.out.println("Pila 2 con los datos de la pila 1 en orden inverso:");
        System.out.println(pilaNumbers2.toString());
        System.out.println("---------------------------------------------------");


    }
}
