package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> acervo;

    Biblioteca() {
        acervo = new ArrayList<Livro>();
    }

    void adicionarlivro(Livro livro){
        // TODO: verificar livro duplicado (isbn)
        acervo.add(livro);
    }

    boolean removerLivro(String isbn) {
        //for(int i = 0; i < acervo.size(); i++) {
        //    acervo.get(i);
        for(Livro livro : acervo) {
            if (isbn.equals(livro.isbn)){
                acervo.remove(livro);

                return true;
            }
        }

        return false;
    }

    ArrayList<Livro> listaTodos() {
        return acervo;
    }

    ArrayList<Livro> listaEmprestados() {
        ArrayList<Livro> emprestados = new ArrayList<>();

        for (var livro : acervo) {
            if(livro.estaEmprestado()) {
                emprestados.add(livro);
            }
        }

        return emprestados;
    }
}
