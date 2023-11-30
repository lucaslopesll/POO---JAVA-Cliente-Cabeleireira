
package salaofinal;


import  java.util.Scanner;

public class SalaoFinal {

    
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       Login login = new Login();
       Cadastro cadastro = new Cadastro();
       Tratamento tratamento = new Tratamento();
       Consulta consulta = new Consulta();
       Caixa caixa = new Caixa();
       int op3;
       do{
       System.out.println("Login");    
       System.out.println("Admin: ");
       login.setAdmin(input.nextInt());
       System.out.println("------------"
               + "\n Senha: ");
       login.setSenha(input.nextInt());
       System.out.println("------------");
       login.op();
       }while(login.getOp2() != 0); 
       do{
        System.out.println("Escolha uma das opções: ");
        System.out.println("MENU - "
                   + "\n 1 - Cadastrar"
                   + "\n 2 - Tratamento"
                   + "\n 3 - Caixa"
                   + "\n 4 - Consulta"
                   + "\n 5 - Sair");
        op3 = input.nextInt();
        switch (op3){
            case 1:
                System.out.println("Cadastro: ");
                System.out.println("Digite o Nome: ");
                cadastro.setNome(input.next());
                System.out.println("Digite o Email: ");
                cadastro.setEmail(input.next());
                System.out.println("Digite o Agendamento: ");
                cadastro.setAgendamento(input.nextInt());
                System.out.println("Digite o Telefone: ");
                cadastro.setTelefone(input.next());
                System.out.println("Digite o Tamanho do Cabelo: ");
                cadastro.setTamanho(input.nextFloat());
                System.out.println("Digite o tipo de cabelo: ");
                cadastro.setTipocabelo(input.next());
    
            break;
            case 2:
                System.out.println("Tratamento: "
                    + "Digite o Tratamento: \n"
                    +"1 - Selagem\n" 
                    +"2 - Cauterização\n" 
                    +"3 - Botox\n" 
                    +"4 - Progressiva");
                tratamento.setTratamento(input.nextInt());
            break;
            case 3:
                System.out.println("Caixa: ");
                caixa.valor();
                break;
         
            case 4:
                System.out.println("Consulta: ");
                consulta.imprimir2(cadastro);
                consulta.imprimir(tratamento);
                
                break;
            case 5:
                System.out.println("Você saiu do Sistema");
                
            break;
            default:
                System.out.println("Opção ivalida, digite uma opção valida");
                op3 = input.nextInt();
     
        }
       }while(op3 != 5); 
           
       
       
       
       
       
    }
    
}
