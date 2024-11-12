public class ArbolAVL {
    private NodoArbolAVL raiz;
    public ArbolAVL(){
        raiz = null;
    }
    //Buscar
    public NodoArbolAVL buscar(int d, NodoArbolAVL r){
        if(raiz == null){
            return null;
        }else if(r.dato == d){
            return r;
        }else if(r.dato < d){
            return buscar(d, r.hijoDerecho);
        }else{
            return buscar(d, r.hijoizquierdo);
        }
    }
    public NodoArbolAVL obtenerRaiz(){
        return raiz;
    }
    //Obtener el factor de equilibrio
    public int obtenerFE(NodoArbolAVL x){
        if(x == null){
            return -1;
        }else{
            return x.fe;
        }
    }

    //Rotacion simple izquierda
    public NodoArbolAVL rotacionIzquierda(NodoArbolAVL c){
        NodoArbolAVL aux = c.hijoizquierdo;
        c.hijoizquierdo = aux.hijoDerecho;
        aux.hijoDerecho = c;
        c.fe = Math.max(obtenerFE(c.hijoizquierdo), obtenerFE(c.hijoDerecho)) + 1;
        aux.fe = Math.max(obtenerFE(aux.hijoizquierdo), obtenerFE(aux.hijoDerecho)) + 1;
        return aux;
    }

    //Rotacion simple derecha
    public NodoArbolAVL rotacionDerecha(NodoArbolAVL c){
        NodoArbolAVL aux = c.hijoDerecho;
        c.hijoDerecho = aux.hijoizquierdo;
        aux.hijoizquierdo = c;
        c.fe = Math.max(obtenerFE(c.hijoizquierdo), obtenerFE(c.hijoDerecho)) + 1;
        aux.fe = Math.max(obtenerFE(aux.hijoizquierdo), obtenerFE(aux.hijoDerecho)) + 1;
        return aux;
    }

    //Rotacion doble derecha
    public NodoArbolAVL rotacionDobleIzquierda(NodoArbolAVL c){
        NodoArbolAVL temporal;
        c.hijoizquierdo = rotacionDerecha(c.hijoizquierdo);
        temporal = rotacionIzquierda(c);
        return temporal;
    }
    //Rotacion doble izquierda
    public NodoArbolAVL rotacionDobleDerecha(NodoArbolAVL c){
        NodoArbolAVL temporal;
        c.hijoDerecho = rotacionIzquierda(c.hijoDerecho);
        temporal = rotacionDerecha(c);
        return temporal;
    }
    //Metodo para insertar AVL
    public NodoArbolAVL insertarAVL(NodoArbolAVL nuevo, NodoArbolAVL subAr){
        NodoArbolAVL nuevoPadre= subAr;
        if(nuevo.dato < subAr.dato){
            if(subAr.hijoizquierdo == null){
                subAr.hijoizquierdo = nuevo;
            }else{
                subAr.hijoizquierdo = insertarAVL(nuevo, subAr.hijoizquierdo);
                if((obtenerFE(subAr.hijoizquierdo) - obtenerFE(subAr.hijoDerecho) == 2)){
                    if(nuevo.dato < subAr.hijoizquierdo.dato){
                        nuevoPadre = rotacionIzquierda(subAr);
                    }else{
                        nuevoPadre = rotacionDobleIzquierda(subAr);
                    }
                }
            }
    } 
    else if(nuevo.dato > subAr.dato){
        if(subAr.hijoDerecho == null){
            subAr.hijoDerecho = nuevo;
        }else{
            subAr.hijoDerecho = insertarAVL(nuevo, subAr.hijoDerecho);
            if((obtenerFE(subAr.hijoDerecho) - obtenerFE(subAr.hijoizquierdo) == 2)){
                if(nuevo.dato > subAr.hijoDerecho.dato){
                    nuevoPadre = rotacionDerecha(subAr);
                }else{
                    nuevoPadre = rotacionDobleDerecha(subAr);
                }
            }
        }
    }else{
        System.out.println("Nodo duplicado");
    }
    //Actualizar la altura
    if((subAr.hijoizquierdo == null) && (subAr.hijoDerecho != null)){
        subAr.fe = subAr.hijoDerecho.fe + 1;

    }else if((subAr.hijoDerecho == null) && (subAr.hijoizquierdo != null)){
        subAr.fe = subAr.hijoizquierdo.fe + 1;
    }else{
        subAr.fe = Math.max(obtenerFE(subAr.hijoizquierdo), obtenerFE(subAr.hijoDerecho)) + 1;
    }
    return nuevoPadre;
    }
    //Metodo para insertar
    public void insertar(int d){
        NodoArbolAVL nuevo = new NodoArbolAVL(d);
        if(raiz == null){
            raiz = nuevo;
        }else{
            raiz = insertarAVL(nuevo, raiz);
        }
    }
    //Recorridos
    //Metodo para recorrer en preorden
    public void preorden(NodoArbolAVL r){
        if(r != null){
            System.out.print(r.dato + ", ");
            preorden(r.hijoizquierdo);
            preorden(r.hijoDerecho);
        }
    }
    //Metodo para recorrer en inorden
    public void inorden(NodoArbolAVL r){
        if(r != null){
            inorden(r.hijoizquierdo);
            System.out.print(r.dato + ", ");
            inorden(r.hijoDerecho);
        }
    }
    //Metodo para recorrer en postorden
    public void postorden(NodoArbolAVL r){
        if(r != null){
            postorden(r.hijoizquierdo);
            postorden(r.hijoDerecho);
            System.out.print(r.dato + ", ");
        }
    }
    






}
