package eleicoes2023;

public class Municipio{
    
    private String descricao;
    private String provincia;
    private int numRecenseados;

    public Municipio(String descricao, String provincia, int numRecenseados) {
        this.descricao = descricao;
        this.provincia = provincia;
        this.numRecenseados = numRecenseados;
    }   
  
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getNumRecenseados() {
        return numRecenseados;
    }

    public void setNumRecenseados(int numRecenseados) {
        this.numRecenseados = numRecenseados;
    }

    @Override
    public String toString() {
        return "Municipio{" + "descricao=" + descricao + ", provincia=" + provincia + ", numRecenseados=" + numRecenseados + '}';
    }
     
}
