package excepciones;
public class Excepciones {
    public static void main(String[] args) {
        int arreglo[] = new int[5];
        //--------------------------- Ecepcion 1 -----------------------------
        try{
            arreglo[5] = 1;
        }catch(ArrayIndexOutOfBoundsException e)//catch(Exception e)
        {
            System.out.println("Error Excepcion 1: " +  e.getMessage());
        }
        System.out.println("Mensaje");
        //--------------------------- Ecepcion 2 -----------------------------
        String arreglo2[]={"1","2","10","n","54"};
        int suma = 0;
        for(int contador = 0; contador < arreglo2.length;contador++){
        try{
            int numero = Integer.parseInt(arreglo2[contador]);
            suma = suma + numero;
        }catch(NumberFormatException e)
        {
            System.out.println("Error Excepcion 2: " +  e.getMessage());
        }
        }
        System.out.println("Suma: " + suma);   
        //--------------------------- Ecepcion 3 -----------------------------
        try{
            int cantidad = Integer.parseInt(null);
            int deuda = cantidad *2;
        }catch(NumberFormatException e)
        {
            System.out.println("Error Excepcion 3: " +  e.getMessage());
        }
        //--------------------------- Ecepcion 4 -----------------------------
        try{
        String valor = null;
        int longitud = valor.length();
        }catch(NullPointerException e)
        {
            System.out.println("Error Excepcion 4: " +  e.getMessage());
        }
    } 
}
