
import java.util.Scanner;

public class NivelPoder{
    public static void main(String[] args) {
        //Chequeo de niveles de poder.
        //Crea un array con 5 nombres de Saiyans, y otro array con sus poderes.
        //Por ejemplo, en la posición 0 del de nombres puede aparecer Vegeta, en la posición 0 del de poderes, puede aparecer 9000.

        String[] personajes = new String[5];
        personajes[0] = "Goku";
        personajes[1] = "Vegeta";
        personajes[2] = "krillin";
        personajes[3] = "Picolo";
        personajes[4] = "Gohan";

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
        boolean continuar=true;
        Scanner lector = new Scanner(System.in);
        //usamos bucle while para hacer parar en el momento que elija el usuario

        while(continuar)
        {

            System.out.println("de que personaje quieres saber el nivel de poder");
            String nombre = lector.nextLine();
            // en el bucle for creamos variable booleana "encontrado=false" porque empieza el bucle sin concoer ninguno
            boolean encontrado=false;
            for (int i = 0; i < personajes.length; i++)
            {
                if (personajes[i].equalsIgnoreCase(nombre))
                {
                    //como en cada interaccion del bucle pasa por todos, al ser false no muestra "n tengo datos"
                    //cuando encuentra al personaje el false pasa a ser true , y asi damos el resultado.
                    System.out.println(" el poder de: " + personajes[i] + " es: " + poder[i] + " unidades ");
                    encontrado=true;
                    //si no lo encuentra el resultaod sigue siendo falso y pasa a no tengo datos//
                }
            }
            if (!encontrado){
                System.out.println("no tengo datos");
            }
            //establecemos la condicion para cerrar el bucle del while.
            System.out.println("quieres continuar??(Si/No)");
            String respuesta=lector.nextLine();
            if (respuesta.equalsIgnoreCase("No")) {
                continuar = !true;
            }
        }


        System.out.print("que persona tiene mas poder?");
        int Mayorpoder=poder[0];
        for(int i=0;i<poder.length;i++){
            if(poder[i]>Mayorpoder){
                Mayorpoder=poder[i];

            }


        }
        System.out.println(" el personaje " + personajes[4] + " tiene " +  Mayorpoder + " unidades de poder");
    }

}

