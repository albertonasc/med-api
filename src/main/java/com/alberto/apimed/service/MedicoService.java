package com.alberto.apimed.service;

import com.alberto.apimed.entity.DadosListagemMedico;
import com.alberto.apimed.entity.Medico;
import com.alberto.apimed.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository repository;

    public Page<DadosListagemMedico> listarMedicos(Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);
    }

    public Medico buscaMedicoPorId(Long id) {
        return repository.getReferenceById(id);
    }

    public void salvaMedico(Medico medico) {
        repository.save(medico);
    }
}
