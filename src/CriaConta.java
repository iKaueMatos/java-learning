// Criando um Novo Banco | O que tem dentro de uma conta-bancaria
//Agencia,Numero da conta,deposito,saldo,Sacar,Fechar conta,Transferir para outra conta,Titular

import Conta.Conta;
public class CriaConta {
    public static void main(String[] args) {
       Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);


//Segunda conta
        Conta segundaConta = new Conta();

        segundaConta.saldo = 500;

        System.out.println(segundaConta.saldo);
        System.out.println(segundaConta.agencia);
    }
}
