package service;

import model.Paciente;
import repository.PacienteRepository;

public class PacienteService {
    private PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public void cadastrarPaciente(Paciente paciente) {
        repository.adicionar(paciente);
    }

    public void removerPaciente(Paciente paciente) {
        repository.remover(paciente);
    }

    public void modificarPaciente(Paciente paciente) {
        repository.modificar(paciente);
    }
}
