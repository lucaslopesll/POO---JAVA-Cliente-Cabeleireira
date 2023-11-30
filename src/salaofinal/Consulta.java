
package salaofinal;

public class Consulta{

    /*public Consulta(ArrayList<Tratamento> tratamento) {
        super(tratamento);
    }*/
    void imprimir(Tratamento tratamento){
        tratamento.valortratamento();
        
    }
    void imprimir2 (Cadastro cadastro){
        String mensagem = "Dados das Clientes cadastradas -> ";
        System.out.println(mensagem);
        cadastro.Cad();
    }
    
}
