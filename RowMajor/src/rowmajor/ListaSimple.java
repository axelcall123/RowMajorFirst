package rowmajor;

import static java.lang.System.*;
public class ListaSimple {
    class Nodo{
        Object info;
        Nodo sig;
        public Nodo(Object info){
            this.info=info;
            sig=null;
        }
    }

    private Nodo primero;

    public ListaSimple() {
        primero = null;
    }
    
    public void insertarInicio(Object info){
        Nodo nuevo = new Nodo(info);
        if(primero==null){
            primero=nuevo;
        }else{
            nuevo.sig=primero;
            primero=nuevo;
        }
    }
    public void visualizar(){
        Nodo aux=primero;
        while(aux!=null){
            out.println("info-> "+aux.info);
            aux=aux.sig;
        }
    }

}
