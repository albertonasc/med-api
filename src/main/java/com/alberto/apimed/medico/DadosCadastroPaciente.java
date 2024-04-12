package com.alberto.apimed.medico;

import com.alberto.apimed.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
}
