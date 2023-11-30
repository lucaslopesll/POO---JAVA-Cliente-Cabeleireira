
package salaofinal;


public abstract class Cliente {
    private String nome; 
    private String email; 
    private String tipocabelo;
    private int agendamento;
    private String telefone;
    private float tamanho;
    
    /*List<Tratamento> tratamento;
    public Cadastro (List<Tratamento> tratamento){
        this.tratamento = (List<Tratamento>) tratamento;
    }*/

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipocabelo() {
        return tipocabelo;
    }

    public void setTipocabelo(String tipocabelo) {
        this.tipocabelo = tipocabelo;
    }

    public int getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(int agendamento) {
        this.agendamento = agendamento;
    }
    
}
