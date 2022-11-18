package org.uniproj.pessoa;

public class Pessoa {
    private int idade, peso, altura ; 
    private double imc;
    private String nome, codigo, sexo;

    public Pessoa(int idade, int peso, int altura, String nome, String codigo, String sexo) {
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
        this.codigo = codigo;
        this.sexo = sexo;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getImc(){
        return imc;
    }

}
