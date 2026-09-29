package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private LocalDate data;
    private LocalTime horario;
    private String descricao;

    public Consulta (Paciente paciente, Medico medico, LocalDate data, LocalTime horario, String descricao) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.horario = horario;
        this.descricao = descricao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
