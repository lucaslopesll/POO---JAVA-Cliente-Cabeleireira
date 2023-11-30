
package salaofinal;

public class Login {

    private int opa, admin, senha, op2;

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public int getOpa() {
        return opa;
    }

    public void setOpa(int opa) {
        this.opa = opa;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    
    void op (){
        if (admin == 123 && senha == 123){
            op2 = 0;
        }else {
            System.out.println("Seu Admin ou Senha está Errado");
            op2 = 1;
        }
    
}

    int setOp2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    
}
