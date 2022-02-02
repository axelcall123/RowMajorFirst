package rowmajor;
import java.util.*;
public class RowMajor {
    public static void main(String[] args) {
        Scanner  scanner= new Scanner(System.in);

        System.out.println("Matriz uno tamaño; matriz dos posicion");
        String listaUno,listaDos,str="";

        System.out.println("Ingrese la matriz uno-> N1|N1,N2-..Nn");
        listaUno = scanner.nextLine();
        System.out.println("Ingrese la matriz dos-> n1|n1,n2-..Nn");
        listaDos = scanner.nextLine();
        System.out.println("Ingrese lo que quiere insertar");
        str= scanner.nextLine();
        String[]  matrizUnoStr= listaUno.split(",");
        String[] matrizDosStr = listaDos.split(",");
        direcciones rest= new direcciones();
        
        int[] matriz_aux=rest.numero(matrizUnoStr,matrizDosStr);
        //POSICION, TAMAÑO
        // System.out.println(matriz_aux[0]+"::"+matriz_aux[1]+" ; "+str);
        int i=matriz_aux[1];
        ListaSimple lista= new ListaSimple();
        while(i>0){
            if(matriz_aux[0]+1==i){
                lista.insertarInicio(str);
            }else{
                lista.insertarInicio(i-1);
            }
            i--;
        }
        lista.visualizar();
    }

}
