import java.util.Random;
import java.util.Scanner;

public class AmongUS
{
    public static void main(String[] args)
    {   //Impostor Among Us
        // Crea un array con 6 jugadores de Among Us - los nombres.
        // Utiliza la librería Random para decir cual de ellos es el impostor; será el 0, 1, 2, 3, 4.o 5 en el array.
        // Imprime los nombres de los jugadores.
        // Pregunta al jugador cual cree que es el impostor - tiene que escribir el nombre.
        // Utilizando un bucle for, recupera cual es el nombre del impostor que se calculó al principio.
        // Imprime el resultado de la partida.
        Random generator =new Random();
        Scanner lector=new Scanner(System.in);

        String[] jugador=new String[6];
        jugador[0]="Diego";
        jugador[1]="Lucia";
        jugador[2]="Damian";
        jugador[3]="Alejo";
        jugador[4]="Lucas";
        jugador[5]="Miriam";

        //definimos un impostor aleatorio.
        int JugadorOculto = generator.nextInt(jugador.length);
        String Impostor=jugador[JugadorOculto];

        //imprimimos Nombre//
        for(int jugadorInicial=0;jugadorInicial<jugador.length;jugadorInicial++)
        {
            System.out.println("los Nombres de los jugadores son:" + jugador[jugadorInicial]);

        }
        //preguntamos al jugador quien cree que es el impostor
            System.out.print("Introduce el nombre del Impostor: \n");
            String EleccionUsuario=lector.nextLine();
            System.out.print("El Jugador dice que es:" + EleccionUsuario +  "\n");


            for(int intento=1;intento<=4;intento++)
            {if (Impostor.equals(EleccionUsuario) )
                {
                    System.out.println("Has ganado!!!");

                } else

                {
                    System.out.println("No has ganado!!!");
                    System.out.println("vuelve a elegir");
                    EleccionUsuario=lector.nextLine();
                }


            }
                    System.out.print("el impostor era:" + Impostor +  "\n" );



    }
}
