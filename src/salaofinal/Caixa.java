
package salaofinal;


public class Caixa extends Tratamento {
    private float total = 0;
   void valor (){
       System.out.println("O valor a ser pago é: "+getCaixat());
   } 

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
    
}
