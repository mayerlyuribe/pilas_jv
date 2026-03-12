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
        if (tope <= numbers.length){
            tope ++;
            numbers[tope] = number;
            System.out.println("\nNúmero " + number + " agregado en la posición: " + tope);
        }
        else{
                System.out.println("la pilita está llenita");
            }
    }

    //Desapilar números de la pila
    public void desapilarNumbers(){
        System.out.println("\n-- Desapilando un numerito --");
        if (tope >= 0){
            System.out.println("numerito desapilado: " + numbers[tope]);
            tope--;
        }
        else{
            System.out.println("ya no hay más numeritos");
        }
    }

    public void mostrarPila(){
        System.out.println("\n-- Mostrando pila --");
        for (int i = tope; i>=0; i--){
            System.out.println("Numerito: "+ numbers[i]);
        }
        if(tope == -1){
            System.out.println("se acarabon los numeritos");
        }
    }

    public void espaciosPila(){
        System.out.println("----------------------------------------------------");
        System.out.println("Capacidad de la pila es: "+ numbers.length );
        if (numbers.length > tope){
            int espacios = numbers.length - tope;
            System.out.println("Aún quedan: " + espacios + " espacios en la pila para agregar datos");
        }else{
            if(numbers.length==tope){
                System.out.println("La pila está llena, ya no se pueden agregar datos");
            }
        }
        System.out.println("----------------------------------------------------");
    }
}   