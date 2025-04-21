public class Cliente {
    private int id;
    private String nome;
    private int desconto;
    private String genero;

    public Cliente(int id, String nome, int desconto) {
        this.id = id;
        this.nome = nome;
        setDesconto(desconto);
        this.genero = "nd";
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public int getDesconto() { return desconto; }
    public String getGenero() { return genero; }

    public void setDesconto(int desconto) {
        if(desconto < 0 || desconto > 100) {
            throw new IllegalArgumentException("Desconto inválido");
        }
        this.desconto = desconto;
    }

    public void setGenero(String genero) {
        if(!genero.matches("m|f|nd")) {
            throw new IllegalArgumentException("Gênero inválido");
        }
        this.genero = genero;
    }

    @Override
    public String toString() {
        return String.format("%s(%d)(%d$)", nome, id, desconto);
    }
}