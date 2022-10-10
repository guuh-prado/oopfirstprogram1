package ion.oopfirstprogram;

public class Produtos {
//ATRIBUTOS

    private int id;
    private String nomeDoProduto, categoria;
    private double estoque, undMed, vlrUnd;
    //METODOS

    public Produtos(int id, String n, String c, double e, double undMed, double vlrUnd) {
        this.setId(id);
        this.setNomeDoProduto(n);
        this.setCategoria(c);
        this.setEstoque(e);
        this.setUndMed(undMed);
        this.setVlrUnd(vlrUnd);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getEstoque() {
        return estoque;
    }

    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }

    public double getUndMed() {
        return undMed;
    }

    public void setUndMed(double undMed) {
        this.undMed = undMed;
    }

    public double getVlrUnd() {
        return vlrUnd;
    }

    public void setVlrUnd(double vlrUnd) {
        this.vlrUnd = vlrUnd;
    }

    @Override
    public String toString() {
        return " Id: " + this.getId()
                + "\n Nome: " + this.getNomeDoProduto()
                + "\n Categoria: " + this.getCategoria()
                + "\n Quantidade em estoque: " + this.getEstoque()
                + "\n Unidade de medida: " + this.getUndMed()
                + "\n Valor unitário: " + this.getVlrUnd();
    }

}
