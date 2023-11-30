
package salaofinal;


public class Tratamento {
    private int tratamento;
    private float valorTrata;
    private float caixat;

    public int getTratamento() {
        return tratamento;
    }

    public void setTratamento(int tratamento) {
        this.tratamento = tratamento;
    }

    public float getValorTrata() {
        return valorTrata;
    }

    public void setValorTrata(float valorTrata) {
        this.valorTrata = valorTrata;
    }

    public float getCaixat() {
        return caixat;
    }

    public void setCaixat(float caixat) {
        this.caixat = caixat;
    }
     
    void valortratamento(){
        switch (tratamento) {
            case 1:
                caixat = (float) 90.00;
                System.out.println("Tratamento Selagem");
                break;
            case 2:
                caixat = (float) 50.00;
                System.out.println("Tratamento Cauterização");
                break;
            case 3:
                caixat = (float) 50.00;
                System.out.println("Tratamento Botox");
                break;
            case 4:
                caixat = (float) 100.00;
                System.out.println("Tratamento Progressiva");
                break;
            default:
                break;
        }
    }

   
}
