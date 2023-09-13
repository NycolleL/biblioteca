package br.senai.janira.sp.Model;

import java.util.Scanner;

public class Register {
    int validaPrint;
    Scanner teclado = new Scanner(System.in);
    User user = new User();
    Livros livros = new Livros();
    Consulta consulta = new Consulta();
    Output output = new Output();

    public void BothRegister() {
        UserRegister();
        output.PrintUser(user);
        LivrosRegister();
        output.PrintLivros(livros);
        ConsultaRegister();
        output.PrintConsulta(consulta);
    }


    public User UserRegister() {
        System.out.println("-------------- CADASTRAR USUÁRIO ---------------");
        System.out.println("Qual é o seu nome? ");
        user.nome = teclado.next();
        System.out.println("Digite um telefone para contato: ");
        user.telefone = teclado.next();
        System.out.println("Digite um endereço de email: ");
        user.email = teclado.next();
        System.out.println("Digite um endereço residêncial: ");
        user.endereco = teclado.next();
        System.out.println("---------- USUÁRIO CADASTRADO COM SUCESSO -------");

        if (validaPrint != 1) {
            output.PrintUser(user);
        }
        return user;
    }

    public Livros LivrosRegister() {
        System.out.println("-------------- CADASTRAR LIVRO ---------------");
        System.out.println("Nome do livro:");
        livros.titulo = teclado.next();
        System.out.println("Autor do Livro:");
        livros.autor = teclado.next();
        System.out.println("Gênero do Livro:");
        livros.genero = teclado.next();
        System.out.println("ISBN do Livro:");
        livros.isbn = teclado.next();
        System.out.println("---------- LIVRO CADASTRADO COM SUCESSO -------");

        if (validaPrint != 1) {
            output.PrintUser(livros);
        }
        return livros;
    }

    public Consulta ConsultaRegister() {
        System.out.println("-------------- CONSULTAR LIVRO ---------------");
        System.out.println("Qual é o seu nome? ");
        consulta.nome = teclado.next();
        System.out.println("Título do Livro:");
        consulta.titulo = teclado.next();
        System.out.println("Qual é o Gênero do Livro?: ");
        consulta.genero = teclado.next();

        if (validaPrint != 1) {
            output.PrintUser(consulta);
        }
        return consulta;
    }

    public void Decision(){
        String decision;

        System.out.println("> Seja Bem Vindo! <");
        System.out.println("Deseja: 1 Cadastrar Usário - 2 Cadastrar um novo Livro - 3 Consultar livros");
        decision = teclado.next();

        switch (decision.toLowerCase()){
            case "Cadastrar Usuário":
            case "1":
                UserRegister();
                break;

            case "Cadastrar Livro":
            case "2":
                LivrosRegister();
                break;

            case "Consultar livros":
            case "3":
                ConsultaRegister();
                break;
        }
    }
}



