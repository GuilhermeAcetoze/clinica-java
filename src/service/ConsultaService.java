package service;

import model.Consulta;
import repository.ConsultaRepository;
import java.util.List;

public class ConsultaService {
    private ConsultaRepository repository;

    public ConsultaService(ConsultaRepository consulta) {
        this.repository = repository;
    }

    public void adicionarConsulta(Consulta consulta) {
        repository.adicionar(consulta);
    }

    public void removerConsulta(Consulta consulta) {
        repository.remover(consulta);
    }

    public List<Consulta> listarConsultas() {
        return repository.listarConsultas();
    }

    // CRIAR LOGICA NO MAIN PARA O USUARIO ESCOLHER QUAL CONSULTA ATUALIZAR, CASO +1
    public void atualizarConsulta(Consulta consulta) {
        repository.atualizar(consulta);
    }

}
