package br.com.dio.collection.list;

import java.util.*;

public class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static void main(String[] args){

        List<Gato> losGatitos = new ArrayList<>(){{
            add(new Gato("Jon",18,"preto"));
            add(new Gato("Simba",6,"tigrado"));
            add(new Gato("Jon",12,"amarelo"));

        }};
        System.out.println("Lista inicial: \n" + losGatitos);

        Collections.sort(losGatitos);
        System.out.println("\nLista pós ordenação Alfabética: \n" + losGatitos);

        Collections.sort(losGatitos, new ComparadorIdade());
//        losGatitos.sort(new ComparadorIdade());
        System.out.println("\nLista pós ordenação Idade: \n" + losGatitos);


    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

    static class ComparadorIdade implements Comparator<Gato>{
        @Override
        public int compare(Gato mimi1, Gato mimi2) {
            return Integer.compare(mimi1.getIdade(), mimi2.getIdade());
        }
    }
}
