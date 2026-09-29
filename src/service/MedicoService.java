package service;

import model.Medico;
import repository.MedicoRepository;
import java.util.List;

public class MedicoService {
    private MedicoRepository repository;

    public MedicoService(MedicoRepository repository) {
        this.repository = repository;
    }

    public void adicionarMedico(Medico medico) {
        repository.adicionar(medico);
    }

    public void removerMedico(Medico medico) {
        repository.remover(medico);
    }

    public List<Medico> listarMedicos() {
        return repository.listarMedicos();
    }

    public void atualizarMedico(Medico medico) {
        repository.atualizar(medico);
    }
}
