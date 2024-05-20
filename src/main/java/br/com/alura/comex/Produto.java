package br.com.alura.comex;

public class Produto {

    private String nome;
    private String descricao;
    private Double precoUnit;
    private int quantidade;

    public Produto(String nome, String descricao, Double precoUnit, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.precoUnit = precoUnit;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(Double precoUnit) {
        this.precoUnit = precoUnit;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", precoUnit=" + precoUnit +
                ", quantidade=" + quantidade +
                '}';
    }
}
