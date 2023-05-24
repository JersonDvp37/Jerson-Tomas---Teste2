package eleicoes2023;

public class Candidato {
    
    private String nome;
    private String bi;
    private String historico;

    public Candidato(String nome, String bi, String historico) {
        this.nome = nome;
        this.bi = bi;
        this.historico = historico;
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

    @Override
    public String toString() {
        return "Candidato{" + "nome=" + nome + ", bi=" + bi + ", historico=" + historico + '}';
    }
   
}
