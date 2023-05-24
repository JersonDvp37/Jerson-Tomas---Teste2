package eleicoes2023;

public class Votos {
    
    private String nome;
    private String bi;
    private String historico;
    private String municipio;
    
    public Votos(){
    }
    
    public Votos(String nome, String bi, String historico, String municipio){
        this.nome = nome;
        this.bi = bi;
        this.historico = historico;
        this.municipio = municipio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String minicipio) {
        this.municipio = minicipio;
    }

    @Override
    public String toString() {
        return "Votos{" + "nome=" + nome + ", bi=" + bi + ", historico=" + historico + ", municipio=" + municipio + '}';
    }
}
