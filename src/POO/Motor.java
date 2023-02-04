package POO;

public class Motor {
    //Composição 1 para 1

    boolean ligado = false;
    double fatorInjecao = 1;

    int giros(){
        if(!ligado){
            return 0;
        }else{
            return (int) Math.round(fatorInjecao * 3000);
        }
    }

}
