package Conta;

public class TesteMetodo {
    public static void main(String[] args) {
        Conta contaDoUsuario = new Conta();
        contaDoUsuario.saldo = 1000;
        contaDoUsuario.deposita(50);
        System.out.println(contaDoUsuario.saldo);

        Boolean ConseguiRetirar = contaDoUsuario.saca(20);
        System.out.println(contaDoUsuario.saldo);

        Conta contaUsuario2 = new Conta();
        contaUsuario2.deposita(1000);
        boolean sucessoTransferencia = contaUsuario2.transfere(300, contaDoUsuario);

        if (sucessoTransferencia) {
            System.out.println("Transferencia feita com sucesso");

        }else{
            System.out.println("Fantou dinheiro,deposite");
        }
        System.out.println(contaUsuario2.saldo);
        System.out.println(contaDoUsuario.saldo);
    }
}
