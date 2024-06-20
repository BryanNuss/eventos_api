package com.hellow.eventos.classes.com.hellow.eventos.classes;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name="endereco")
@Table(name="endereco")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class evento {
    private Integer id;
    private String nome;
    private Date data;
    private String descricao;
    private Integer lotacao;
    @ManyToOne
    private Tipo tipo;
    private Endereco endereco;
}
