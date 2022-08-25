package com.github.youssfbr.academia.controllers;

import com.github.youssfbr.academia.entities.Aluno;
import com.github.youssfbr.academia.entities.form.AlunoForm;
import com.github.youssfbr.academia.services.impl.AlunoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/alunos")
public class AlunoController {

    private final AlunoServiceImpl alunoService;

    @GetMapping
    public List<Aluno> getAll() {
        return alunoService.getAll(null);
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm alunoForm) {
        return alunoService.create(alunoForm);
    }

}
