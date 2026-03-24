package com.junior.crud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fornecedor")
    private Long id;

    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    @Column(name = "cnpj_fornecedor")
    private String cnpj;

    @Column(name = "contato_fornecedor")
    private String contato;

    public Fornecedor() {}

    public Long getId() { return id; }
    public String getNomeFantasia() { return nomeFantasia; }
    public String getCnpj() { return cnpj; }
    public String getContato() { return contato; }

    public void setId(Long id) { this.id = id; }
    public void setNomeFantasia(String nomeFantasia) { this.nomeFantasia = nomeFantasia; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }
    public void setContato(String contato) { this.contato = contato; }
}