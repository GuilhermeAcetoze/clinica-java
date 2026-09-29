package repository;

import model.Paciente;
import java.util.ArrayList;
import java.util.List;

public class PacienteRepository {

    private List<Paciente> pacientes = new ArrayList<>();

    public void adicionar(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void remover(Paciente paciente) {
        pacientes.remove(paciente);
    }

    public void modificar(Paciente paciente) {
        for(int i = 0; i < pacientes.size(); i++) {
            if(pacientes.get(i).getCpf().equals(paciente.getCpf())) {
                pacientes.set(i, paciente);
                return;
            }
        }
    }
}
