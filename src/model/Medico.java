package model;

public class Medico extends Pessoa {
    private String crm;
    private String especialidade;

    public Medico(String nome, String cpf, int idade, String crm, String especialidade) {
        super(nome, cpf, idade);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Crm: " +crm);
        System.out.println("Especialidade: " + especialidade);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}




