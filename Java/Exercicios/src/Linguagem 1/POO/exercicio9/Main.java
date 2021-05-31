package exercicios.Linguagem1.POO.exercicio9;

public class Main {
    public static void main(String[] args) {
        Autor autorExemplo = new Autor();
        autorExemplo.setNome("Lewis Carroll");
        autorExemplo.setCodigo(2314);
        autorExemplo.setEmail("LewisCarroll@gmail.com");
        autorExemplo.setEndereco("53456-977");
        autorExemplo.setGenero(Genero.MASCULINO);

        Livro livroExemplo = new Livro();
        livroExemplo.setTitulo("Alice no país das maravilhas");
        livroExemplo.setAutor(autorExemplo);
        livroExemplo.setDescricao("Descrição do livro");
        livroExemplo.setQuantidadePaginas(280);
        livroExemplo.setAssunto(Assunto.ROMANCE);

        Livro livroExemplo2 = new Livro();
        livroExemplo.setTitulo("Alice no país das maravilhas 2");
        livroExemplo.setAutor(autorExemplo);
        livroExemplo.setDescricao("Descrição do livro");
        livroExemplo.setQuantidadePaginas(280);
        livroExemplo.setAssunto(Assunto.ROMANCE);


        Editora editoraExemplo = new Editora();
        editoraExemplo.setNome("Editora Real");
        editoraExemplo.setEndereco("64476-440");

        Estante estanteExemplo = new Estante();
        estanteExemplo.adicionarLivro(livroExemplo);
        estanteExemplo.adicionarLivro(livroExemplo2);
        System.out.println(estanteExemplo.getNaoLidos());
        System.out.println(estanteExemplo.getLidos());

    }
}
