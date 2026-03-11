package Pilita_1;

public class pilaNumbers{
    private String[] numbers;
    private int tope;

    public pilaNumbers(int capacidad){
        numbers = new String[capacidad];
        tope = -1;
        }

    //agregar números a la pila XDD
    public void agregarNumbers(String number){
        System.out.println("-- agregar un número a la pila --");
        if (tope < numbers.length){
            tope ++;
            numbers[tope] = number;
            System.out.println("Número " + number + " agregado en la posición: " + tope);
        }
        else{
                System.out.println("la pilita está llenita");
            }
    }

    //Desapilar números de la pila
    public void desapilarNumbers(){
        System.out.println("-- Desapilando un numerito --");
        if (tope >= 0){
            System.out.println("numerito desapilado: " + numbers[tope]);
            tope--;
        }
        else{
            System.out.println("ya no hay mas numeritos");
        }
    }
    public void mostrarCapacidad(){
        System.out.println("Capacidad de la pila: "+ numbers.length );

    }

    public void mostrarPila(){
        System.out.println("-- Mostrar pila --");
        for (int i = tope; i>=0; i--){
            System.out.println("Numerito: "+ numbers[i]);
        }
        if(tope == -1){
            System.out.println("se acarabon los numeritos");
        }
    }
}   