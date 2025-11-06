
import java.util.Scanner;

public class NivelPoder{
    public static void main(String[] args) {
        //Chequeo de niveles de poder.
        //Crea un array con 5 nombres de Saiyans, y otro array con sus poderes.
        //Por ejemplo, en la posición 0 del de nombres puede aparecer Vegeta, en la posición 0 del de poderes, puede aparecer 9000.

        String[] Personajes = new String[5];
        Personajes[0] = "Goku";
        Personajes[1] = "Vegeta";
        Personajes[2] = "krillin";
        Personajes[3] = "Picolo";
        Personajes[4] = "Gohan";

        int[] poder = new int[5];
        poder[0] = 90000;
        poder[1] = 80000;
        poder[2] = 25000;
        poder[3] = 75000;
        poder[4] = 95000;

        //A continuación, en un bucle:
        //Pregunta al usuario de quién quiere conocer el poder.
        //Imprime el poder de ese guerrero si existe; si no existe, imprime "No tengo datos".
        //Pregunta al usuario si quiere preguntar por otro guerrero, o si quiere acabar



        //int Record=puntuacion[0];
        //for(int puntuacionInicial=0;puntuacionInicial<puntuacion.length;puntuacionInicial++){
        //if( Record<puntuacion[puntuacionInicial]){
        //Record=puntuacion[puntuacionInicial];


        System.out.print("que persona tiene mas poder?");
        int Mayorpoder=poder[0];
        for(int i=0;i<poder.length;i++){
            if(poder[i]>Mayorpoder){
                Mayorpoder=poder[i];

            }


        }
        System.out.println(" el personaje " + Personajes[4] + " tiene " +  Mayorpoder + " unidades de poder");
    }

}

