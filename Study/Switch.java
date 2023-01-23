package Study;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Switch case ");

        String faixa = "preta";
//Basicamente o Switch case ira receber um valor verdadeiro ou falso no caso um vlao boolean e logo apos isso
// ira executa-lo

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei lutar!E sou muito bom");
            case "marrom":
                System.out.println("Sou quase um faixa preta");
            case "roxa":
                System.out.println("Sou quase faixa marrom");
            case "verde":
                System.out.println("Estou quase na faixa roxa");
            case "laranja":
                System.out.println("Sou quase faixa verde");
            case "amarela":
                System.out.println("Sou quase faixa laranja");
            default:
                System.out.println("Estou iniciando agora");
        }
    }
}
