package Pilita_1;

public class main {
    public static void main(String[] args) {
        int capacidad = 9;
        System.out.println("\nLa pila tiene una capacidad de: " + capacidad);

        System.out.println("-- agregando 5 números aleatorios a la pila --");
        pilaNumbers numerolocos = new pilaNumbers(capacidad);
        for (int i = 0; i < 5; i++){
            int aleatorio = (int) (Math.random() * 10);
            String number = String.valueOf(aleatorio);
            numerolocos.agregarNumbers(number);
        }
        numerolocos.mostrarPila();
        numerolocos.desapilarNumbers();
        numerolocos.mostrarPila();
        numerolocos.espaciosPila();
    }

}

