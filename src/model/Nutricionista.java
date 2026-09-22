package model;

public class Nutricionista extends Pessoa {
    private String crn;
    private String especialidade;

    public Nutricionista (String nome, String cpf, int idade, String crn, String especialidade) {
        super(nome, cpf, idade);
        this.crn = crn;
        this.especialidade = especialidade;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Crn: " + crn);
        System.out.println("Especialidade: " + especialidade);
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
