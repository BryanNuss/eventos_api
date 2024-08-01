package com.hellow.eventos.classes;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Date data;
    private String descricao;
    private Integer lotacao;
    @ManyToOne
    @JoinColumn(name="id_tipo")
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;





}
