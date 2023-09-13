package Model;

import java.util.Scanner;

public class Menu {
    public void Menu(){

        Scanner teclado = new Scanner(System.in);
        User user = new User();

        boolean continuar = true;

        while (continuar){
            System.out.println("////////////////////////////////////////");
            System.out.println("------- BEM VINDO A BIBLIOTECA! --------");
            System.out.println("O que Deseja?");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Cadastrar um Livro");
            System.out.println("3 - Renovar ");
            System.out.println("----------------------------------------");
            System.out.println("////////////////////////////////////////");

            int userOption = teclado.nextInt();

            switch (userOption){
                case 1:
                    //user.Decision();
                    break;

                case 2:
                    break;

                case 3:
                    break;
            }
        }
    }
}
