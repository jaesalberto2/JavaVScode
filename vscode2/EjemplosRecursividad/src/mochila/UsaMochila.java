package mochila;

public class UsaMochila {
    public static void main(String[] args) {
        Elemento[] elementos={
            new Elemento(1,1),
            new Elemento(2,2),
            new Elemento(4,10),
            new Elemento(1,2),
            new Elemento(12,15),
        };
        Mochila m_base = new Mochila(15, elementos.length);
        Mochila m_opt = new Mochila(15, elementos.length);
        llenarMochila(m_base,elementos,false,m_opt);
        System.out.println(m_opt);


    }

    private static void llenarMochila(Mochila m_base, Elemento[] elementos, boolean llena, Mochila m_opt) {
       if (m_base.getBeneficio()>m_opt.getBeneficio()) {
        
       
        Elemento[] elementosMochBase = m_base.getElementos();
        m_opt.clear();
        //metemos los elementos
        for(elemento e: elementosMochBase){
            if(e!=null){
                m_opt.aniadirElemento(e);
            }
        }
    }
}else{
    //
}

}
