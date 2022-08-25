package com.github.youssfbr.academia.repositories;

import com.github.youssfbr.academia.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlunoRepository extends JpaRepository<Aluno, Long> {
}
