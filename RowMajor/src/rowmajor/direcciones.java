package rowmajor;

public class direcciones {
    public int[] numero(String[] matrizAStr,String[] matrizBStr){
        int[] matrizAInt = new int[matrizAStr.length];
        int[] matrizBInt = new int[matrizBStr.length];
        int tamañoMatriz=1;
        for (int i = 0; i < matrizAInt.length; i++) {
            matrizAInt[i] = Integer.parseInt(matrizAStr[i]);
            tamañoMatriz=tamañoMatriz*matrizAInt[i];
            matrizBInt[i] = Integer.parseInt(matrizBStr[i]);
        }

        if(matrizAStr.length!=1){

            int resultado = matrizBInt[0];
            String op = "*";// signo operacion
            for (int i = 0; i < matrizAInt.length; i = i + 1) {
                if (op == "*") {
                    if (i == 0) {//LA PRIMERA VEZ SE UTILZA LA POSICION +1
                        resultado = resultado * matrizAInt[i + 1];
                        i = i + 1;
                    } else {//OTRAS ITERACIONES SE UTILZA NORMAL
                        resultado = resultado * matrizAInt[i];
                    }
                    op = "+";
                }
                if (op == "+") {//DE UNA VEZ HAGA LA OPERACION EN LA ITERACION
                    resultado = resultado + matrizBInt[i];
                    op = "*";
                }
            }
            int[] matriz={resultado,tamañoMatriz}; 
            return matriz;
        }else{
            int[] matriz = { matrizBInt[0], tamañoMatriz };
            return matriz;
        }
            
    }
        
}
