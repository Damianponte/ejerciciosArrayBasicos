import java.util.Arrays;
import java.util.Scanner;

public class CapturaPokemon
{
    public static void main(String[] args) {
        //Captura de Pokemon.
        //Crea un array de tamaño 5, de String, pero no le des valor a ningún.
        //En un bucle:
        //Pregunta al usuario el nombre del Pokemon que acaba de capturar.
        //Guárdalo en la posición correcta del array.
        //Después, imprime el nombre de todos los Pokemon, pero en orden inverso.

        String[] pokemon = new String[5];
        Scanner lector = new Scanner(System.in);
        //bucle para preguntar al usuario que pokemon captura(el numero de veces que se repite el bucle es  la cantidad del array)
        for (int i = 0; i < pokemon.length; i++) {
            System.out.println("Que pokemon has capturado");
            pokemon[i] = lector.nextLine();

        }
        //bucle for para sacar el array en orden inverso.
        //el bucle empieza en pokemon.length - 1, para comenzar desde el último elemento.
        System.out.println("los pokemon que has capturado son:" );
        for (int i = pokemon.length - 1; i >= 0; i--) {
            System.out.println(pokemon[i]);


        }

    }
}
