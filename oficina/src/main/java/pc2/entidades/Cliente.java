/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc2.entidades;

/**
 *
 * @author henrique
 */
public class Cliente {
    private String cpf;
    private String nome;
    private Integer idade;
    private String rg;
    private String telefone;

    public Cliente(String cpf, String nome, Integer idade, String rg, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
        this.telefone = telefone;
    }

    public Cliente() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
