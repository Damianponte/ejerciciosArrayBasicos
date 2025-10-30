public class PuntuacionDeJuego {
    public static void main(String[] args) {
        //Puntuaciones de juego
        //Crea un array con las puntuaciones de 6 partidas (valores enteros).
        //Recorre el array para calcular:
        //Puntuación total.
        //Media de puntos por partida.
        //   Mayor puntuación conseguida.
       // Muestra todo con mensajes tipo:
       // "Tu récord fue de 2380 puntos en una partida."

        int []puntuacion=new int[6];
        puntuacion[0]=1250;
        puntuacion[1]=2250;
        puntuacion[2]=3152;
        puntuacion[3]=1002;
        puntuacion[4]=2514;
        puntuacion[5]=1025;
        int puntuacionTotal=0;
        //sacamos array para todas las puntuaciones, la suma se pone en el ciclo para conseguir la suma al recorrer el ciclo for
        for(int puntuacionInicial=0;puntuacionInicial<puntuacion.length;puntuacionInicial++){
           System.out.print ("la puntuación por partida es:" + puntuacion[puntuacionInicial] + "\n");
            puntuacionTotal=puntuacionTotal + puntuacion[puntuacionInicial];
            //media de puntos por partida



        }
        //imprimos fuera el resultado para evitar que se repita en el ciclo
        System.out.println(" La puntuacion total es:" + puntuacionTotal + " \n" );

        /// ////////////////////////////////////////////////////////////////////////////////////////////////
        //media de puntos por partida
        double MediaPuntos=puntuacionTotal/puntuacion.length;
        System.out.println(" la media de puntos por partida es:" + MediaPuntos);

        /// /////////////////////////////////////////////
        //record de puntos por partida
        int Record=puntuacion[0];
        for(int puntuacionInicial=0;puntuacionInicial<puntuacion.length;puntuacionInicial++){
           if( Record<puntuacion[puntuacionInicial]){
               Record=puntuacion[puntuacionInicial];
           }


        }
        System.out.println("el record es:" + Record + " puntos en una partida");


    }
}
