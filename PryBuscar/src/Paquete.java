public class Paquete{
    private int codigo;
    private String destino;
    private String origen;
    private int peso;

    public Paquete() {

    }
    public Paquete(int codigo, String destino, String origen, int peso) {
        this.codigo = codigo;
        this.destino = destino;
        this.origen = origen;
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Paquete " +
                "Codigo: " + codigo +
                ", destino: " + destino +
                ", origen: " + origen +
                ", peso: " + peso + "\n";
    }
}
