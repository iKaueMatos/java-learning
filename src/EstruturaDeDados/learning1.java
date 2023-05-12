package EstruturaDeDados;

public class learning1 {
    public static void main(String[] args) {

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 35.4;

        //Acessando um valor do array
        System.out.println("O valor da temperatuerra do dia 3 e:" + temperaturas[2]);

        //Infomando o Tamanho do Array
        System.out.println("O tamanho do array e:" + temperaturas.length);

        //Informa o tamanho do Array e informa o seus valores
        for(int i = 0; i < temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia " + (i+1) + " e: " + temperaturas[i]);
        }

        //Percorrendo o array
        for (double temp : temperaturas){
            System.out.println(temp);
        }
    }

}
