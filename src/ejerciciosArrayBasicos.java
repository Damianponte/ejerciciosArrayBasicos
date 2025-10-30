public class ejerciciosArrayBasicos {
    public static void main(String[] args) {
                //Objetos de minecraft.
                //Crea un array de Strings con los objetos del inventario de un jugador - tiene que tener 5 objetos - (por ejemplo: "espada", "pico", "manzana dorada", "bloques de piedra", "antorchas").
                //Usa un bucle for para imprimir:
                //"Tienes en tu inventario: [objeto]".
                //Luego muestra cuántos objetos tiene el jugador.
        //creamos array de 5 objetoss(de 0 a 4)
        String[] objeto=new String[5];
        objeto[0]="ultrapocion";
        objeto[1]="antiveneno";
        objeto[2]="antparalizador";
        objeto[3]="antiquemadura";
        objeto[4]="curatotal";
            //bucle for para sacar cada objeto.
        for(int objetosInventario=0;objetosInventario<objeto.length;objetosInventario++){

                String imprimir=(" Los objetos que hay el inventario son:" + objeto[objetosInventario] ) ;
                System.out.println(imprimir);




        }
        //fuera del bucle para sacar el numero de objetos totales sin que cuenten los del bucle.
        System.out.println("El número de objetos que tiene el inventario es: " + objeto.length);

    }
}
