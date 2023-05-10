package POO.interface1;


//A partir do momento que criamos uma interface agora não podemos implenta-la dentro de uma classe sem chamar o respectivos
//Atributos ou metodos que estão dentro da interface.a questão e que na maioria das vezes a interface sera utilizada para
//capacitar o desenvolvimento de uma aplicação com um assinatura de metodos onde serão sobreescritos diarimente

//Quando trabalhamos com interface basicamente podemos implementar multiplas interfaces dentro de uma classe
public interface DataLoader {

    public abstract void loader();

    default void checkPermisson() {

    }

}
