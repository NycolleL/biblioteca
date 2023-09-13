package br.senai.janira.sp.Model;

public class Output {
    public void PrintUser(User user){

        System.out.println("///////////////////////////////////////////");
        System.out.println("-------------- Cadastro Usuário -----------");
        System.out.println("Qual é o seu nome: " + user.nome);
        System.out.println("///////////////////////////////////////////");
    }

    public void PrintLivros(Livros livros){
        System.out.println("/////////////////////////////////////////////");
        System.out.println("---------------- Cadastro Livro -------------");
        System.out.println("Título que deseja cadastrar: " + livros.titulo);
        System.out.println("/////////////////////////////////////////////");
    }

    public void PrintConsulta(Consulta consulta){
        System.out.println("////////////////////////////////////////////////");
        System.out.println("--------------- Consulta dos livros ------------");
        System.out.println("Qual livro deseja consulta?: " + consulta.titulo);
        System.out.println("////////////////////////////////////////////////");
    }
}
