package Model;

public class Register {

    //instancia User
    User user = new User();

    //instancia output
    Output output = new Output();

    public void BothRegister() {
        UserRegister();
        output.PrintUser(user);
    }

    public  User UserRegister(); {
        //coleta de dados do usuário
        System.out.println("///////////////////////////////////");
        System.out.println("---------- CADASTRO USUÁRIO -------");
        System.out.println("Qual é o seu nome? ");
        user.nome = teclado.next();
        System.out.println("Adicione um telefone para contato:");
        user.telefone = teclado.next();
        System.out.println("Adicione um endereço de email:");
        user.email = teclado.next();
        System.out.println("Adicione um endereço residêncial:");
        user.endereco = teclado.next();

        if (validaPrint != 1){
            //printa as informações cadastradas
            output.PrintUser(user);
        }
    }

    public void Decision(){
        String decision;

        System.out.println("-----------------------------------");
        System.out.println("---------- SEJA BEM VINDO ---------");
        System.out.println("O que Deseja? ");
        System.out.println("1 - Cadastrar Usuário");
        System.out.println("2 - Cadastrar um novo Livro");
        System.out.println("3 - Renovar");
        System.out.println("-----------------------------------");
        decision = teclado.next();

        switch (decision.toLowerCase()) {
            case "User":
                UserRegister();
                break;
            case "Renovar":
                RenovarRegister();
                break;
        }


    }
}
