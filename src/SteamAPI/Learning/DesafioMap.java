package SteamAPI.Learning;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    public static void main(String[] args) {


        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 56, 7, 8, 9, 0);

        // 1. Numero para String binaria .... 6 => "110"
        // 2. inverter a String ... "110" => "011"
        // 3. COnverter de volta para inteiro => "011" => 3

        UnaryOperator<String> inverter = texto -> new StringBuilder(texto).reverse().toString();

        Function<String,Integer> binarioParaInt = textoNumero -> Integer.parseInt(textoNumero,2);

        //Convertendo todos os numeros para binários
        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binarioParaInt)
                .forEach(System.out::println);

    }
}
