package repository;

import model.Consulta;
import java.util.ArrayList;
import java.util.List;

public class ConsultaRepository {
    private List<Consulta> consultas = new ArrayList<>();

    public void adicionar(Consulta consulta) {
        consultas.add(consulta);
    }


    public void remover(Consulta consulta) {
        consultas.remove(consulta);
    }

    public List<Consulta> listarConsultas() {
        return consultas;
    }

    public void atualizar(Consulta consulta) {
        for(int i = 0; i < consultas.size(); i++) {
            if(consultas.get(i).getPaciente().equals((consulta.getPaciente()))) {
                consultas.set(i, consulta);
                return;
            }
        }
    }
}
