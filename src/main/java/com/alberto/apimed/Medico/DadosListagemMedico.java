package com.alberto.apimed.Medico;

import com.alberto.apimed.entity.Especialidade;
import com.alberto.apimed.entity.Medico;

public record DadosListagemMedico(String nome, String email, String crm, Especialidade especialidade) {

    public DadosListagemMedico(Medico medico) {
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
