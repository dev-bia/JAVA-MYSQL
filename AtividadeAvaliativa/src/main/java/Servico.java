public class Servico {

    private String descricao_servico;
    private String preco_servico;
    private String avaliaca_servico;
    private String agenda_servico;

    public Servico(String descricao_servico, String preco_servico, String avaliaca_servico, String agenda_servico) {
        this.descricao_servico = descricao_servico;
        this.preco_servico = preco_servico;
        this.avaliaca_servico = avaliaca_servico;
        this.agenda_servico = agenda_servico;
    }

    public String getDescricao_servico() {
        return descricao_servico;
    }

    public void setDescricao_servico(String descricao_servico) {
        this.descricao_servico = descricao_servico;
    }

    public String getPreco_servico() {
        return preco_servico;
    }

    public void setPreco_servico(String preco_servico) {
        this.preco_servico = preco_servico;
    }

    public String getAvaliaca_servico() {
        return avaliaca_servico;
    }

    public void setAvaliaca_servico(String avaliaca_servico) {
        this.avaliaca_servico = avaliaca_servico;
    }

    public String getAgenda_servico() {
        return agenda_servico;
    }

    public void setAgenda_servico(String agenda_servico) {
        this.agenda_servico = agenda_servico;
    }
}
