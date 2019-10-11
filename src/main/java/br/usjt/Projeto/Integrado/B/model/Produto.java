package br.usjt.ccp3bn_mca_projeto_integrado.model;

import javax.persistence.*;

@Entity
public class Produto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private double preco;
    private String codigo;
    private String marca;
    private String categoria;
    private String descricao;
}
