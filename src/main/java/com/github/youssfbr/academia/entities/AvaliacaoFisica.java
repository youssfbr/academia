package com.github.youssfbr.academia.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@ManyToOne
    @ManyToOne(cascade = CascadeType.ALL)
    private Aluno aluno;

    private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

    @Column(name="peso_atual")
    private double peso;

    @Column(name="altura_atual")
    private double altura;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AvaliacaoFisica avaliacaoFisica = (AvaliacaoFisica) o;
        return id != null && Objects.equals(id, avaliacaoFisica.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
