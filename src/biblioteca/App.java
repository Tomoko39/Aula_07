package biblioteca;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro(
            "O Senhor dos Aneis",
            "J. R. R. Tolkien",
            1954,
            "123"
        );
        Livro livro2 = new Livro(
            "Cem anos de Solidao",
            "Gabriel Garcia Marquez ",
            1967,
            "961"
        );

        biblioteca.adicionarlivro(livro1);
        biblioteca.adicionarlivro(livro2);

        livro1.emprestar();
        livro2.emprestar();
        livro1.devolver();

        System.out.println("Livros emprestados: ");
        for (Livro livro : biblioteca.listaEmprestados()) {
            System.out.println(livro.converteParaString());
        }
    }
}
