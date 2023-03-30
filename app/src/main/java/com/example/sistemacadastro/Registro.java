package com.example.sistemacadastro;

public class Registro {

    private String nome;
    private String endereco;
    private String telefone;

    private String email;

    public Registro(String nome, String endereco, String telefone, String email)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEndereco() { return endereco; }

    public String getEmail() { return email; }
}
