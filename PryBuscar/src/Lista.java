import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Paquete> listado;
    public Lista(){
        listado=new ArrayList<Paquete>();
        predefinir();
    }
    public void predefinir(){
        listado.add(new Paquete(7,"Quito","Guayaquil",200));
        listado.add(new Paquete(100,"Quito","Ibarra",20));
        listado.add(new Paquete(200,"Guayaquil","Guayaquil",2));
        listado.add(new Paquete(300,"Quito","Quito",150));
        listado.add(new Paquete(700,"Ibarra","Guayaquil",700));
    }
    public List<Paquete> getListado(){
        return listado;
    }
    public Paquete buscarPaqueteBinario(int codigoBUscado)throws Exception{
        int i=0;
        int s=listado.size()-1;
        int c=0;
        while(i<=s){
            c=(i+s)/2;
            Paquete aux=listado.get(c);
            if(codigoBUscado==aux.getCodigo())
                return aux;
            else if(codigoBUscado>aux.getCodigo()){
                i=c+1;
            }else
                s=c-1;
        }
        throw new Exception("No existe el codigo.");
    }
    public List<Paquete> buscarDestino(String destino){
        ArrayList paquetes=new ArrayList();
        for (Paquete p:listado){
            if (p.getDestino().compareToIgnoreCase(destino)==0)
                paquetes.add(p);
        }
        return paquetes;
    }
}
