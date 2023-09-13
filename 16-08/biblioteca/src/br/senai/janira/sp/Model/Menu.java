package br.senai.janira.sp.Model;

import java.util.Scanner;

public class Menu {
    public void Menu(){
        Scanner teclado = new Scanner(System.in);

        User user = new User();
        Livros livros = new Livros();

        boolean contiuar = true;

        while (contiuar){
            System.out.println("//////////////////////////////////");
            System.out.println("----------- BEM VINDO ! ----------");
            System.out.println("O que deseja?");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Cadastrar um novo livro");
            System.out.println("3 - Consultar livros");
            System.out.println("//////////////////////////////////");

            int userOption = teclado.nextInt();

            }
        }
    }
