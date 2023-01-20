package Conta;

public class Conta {
    public double saldo;
    public int agencia = 66;
    public int numero;
    String titular;

   public void deposita( double valor){
    this.saldo = this.saldo + valor;

   }

   //Metodo saca da nossa conta valor
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfere(double valor,Conta destino){
        if (this.saldo >= valor ){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }else{
            return false;
        }
    }


}


