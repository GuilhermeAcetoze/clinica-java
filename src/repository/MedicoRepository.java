package repository;

import model.Medico;
import java.util.ArrayList;
import java.util.List;

public class MedicoRepository {

    private List<Medico> medicos = new ArrayList<>();

    public void adicionar(Medico medico) {
        medicos.add(medico);
    }

    public void remover(Medico medico) {
        medicos.remove(medico);
    }

    public List<Medico> listarMedicos() {
        return medicos;
    }

    public void atualizar(Medico medico) {
        for(int i = 0; i < medicos.size(); i++) {
            if(medicos.get(i).getCrm().equals((medico.getCrm()))) {
                medicos.set(i, medico);
                return;
            }
        }
    }
}
