package br.com.alura.comex;

public class Comparar {

    public static void main(String[] args) {
        Produto livro1 = new Produto("Clean Code","livro", 95.17, 1);
        Produto livro2 = new Produto("Clean Architecture","livro", 102.90, 1);

        System.out.println(livro1);
        System.out.println(livro2);

        if (livro1.equals(livro2)){
            System.out.println("Esses produtos são iguais");
        } else {
            System.out.println("Esse produtos são diferentes");
        }
    }

}
