package Conta;

public class TesteReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira conta"  + primeiraConta.saldo);

        Conta segundaConta = primeiraConta; // referencia primeiraConta

        System.out.println("Saldo da segunda conta:" + segundaConta.saldo);

        segundaConta.saldo += 100;

        System.out.println("Saldo da segunda conta com valor adicionado" + segundaConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("São a mesma conta?");
        }
    }

}
