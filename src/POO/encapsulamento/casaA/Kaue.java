package POO.encapsulamento.casaA;

public class Kaue {

    Anselmo anselmo = new Anselmo();
    void testeAcesso(){
      //  System.out.println(anselmo.segredo); // atributo privado so sera possivel executa-lo na propria classe -> private
        System.out.println(anselmo.facoDentroDeCasa); // Acesso permitido -> default -> pacote
        System.out.println(anselmo.formaDeFalar); // acesso permitido -> protected
        System.out.println(anselmo.todosSabem); // Acesso permitido -> public
    }


}
