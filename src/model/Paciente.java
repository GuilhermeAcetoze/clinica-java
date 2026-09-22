package model;

public class Paciente extends Pessoa {
    private String convenio;

    public Paciente(String nome, String cpf, int idade, String convenio) {
        super(nome, cpf, idade);
        this.convenio = convenio;
    }

    @Override // sobrescreve classe Pessoa
    public void exibirDados() {
        super.exibirDados(); // acessar exibirDados Pessoa
        System.out.println("Convênio: " + convenio);
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
}
