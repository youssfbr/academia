package com.github.youssfbr.academia.services.impl;

import com.github.youssfbr.academia.entities.Aluno;
import com.github.youssfbr.academia.entities.AvaliacaoFisica;
import com.github.youssfbr.academia.entities.form.AlunoForm;
import com.github.youssfbr.academia.entities.form.AlunoUpdateForm;
import com.github.youssfbr.academia.repositories.IAlunoRepository;
import com.github.youssfbr.academia.services.IAlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoServiceImpl implements IAlunoService {

    private final IAlunoRepository alunoRepository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll(String dataDeNascimento) {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        return null;
    }
}
