public class AreaCirc {
    double raio;

    //Agora esse atributo pertence a classe

    final static double pi = 3.14556678;

    public AreaCirc(double raioInicial){
        raio = raioInicial;
    }
    double area(){
        return (raio * raio) * pi;
    }
}


