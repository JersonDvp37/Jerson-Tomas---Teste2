package eleicoes2023;

 public class Voto {
    
    private boolean valido;
    private boolean branco;
    private String dataVoto;

    public Voto() {
    }

    public Voto(boolean valido, boolean branco, String dataVoto) {
        this.valido = valido;
        this.branco = branco;
        this.dataVoto = dataVoto;
    }

    public boolean isValido() {
        return valido;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public boolean isBranco() {
        return branco;
    }

    public void setBranco(boolean branco) {
        this.branco = branco;
    }

    public String getDataVoto() {
        return dataVoto;
    }

    public void setDataVoto(String dataVoto) {
        this.dataVoto = dataVoto;
    }

    @Override
    public String toString() {
        return "Voto{" + "valido=" + valido + ", branco=" + branco + ", dataVoto=" + dataVoto + '}';
    }
       
}
