package collections.DojoCollections.dominio;

public class SmartphoneExemplo {
    private String serailNumber;
    private String marca;

    public SmartphoneExemplo(String serailNumber, String marca) {
        this.serailNumber = serailNumber;
        this.marca = marca;
    }

    public String getSerailNumber() {
        return serailNumber;
    }

    public void setSerailNumber(String serailNumber) {
        this.serailNumber = serailNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    //Regras
    //Reflexivo x.equals(x) tem que ser true para tudo que for diferente de null
    //Simetrico; para x e y diferntes de null,se x.equals(y) == true logo,y.equals(x) == true
    //Transitividade:para x,y,z diferente de null,se X.equals(y) == true,logo y.equals(x) == true logo,y.equals(z) == true
   //Consistente:x.equals(x) sempre retorna true se x for diferente de null
    //para x diferente de null,x.equals(null) tem que retornar false.
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false; //Se for uma classe diferente retornamos false
        SmartphoneExemplo smartphoneExemplo = (SmartphoneExemplo) obj;
        //Basicamente agora estamos verificando o conteudo do serialNumber ao inves da referencia do objeto então se conteudo do serialNumber for igual a outro retornara = true caso ao contrario retornara falso!
        return serailNumber != null && serailNumber.equals(smartphoneExemplo.serailNumber); //Aqui fazemos a comparação onde fala que um objeto e igual a outro a partir do seu conteudo
    }


    //Regras
    //Se x.equals(y) == true,y.hashcode() == x.hashCode()
    //y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem que ser true
    //x.equals(y) == false
    //y.hashcode() != x.hashcode() x.equals(y) devera ser false
    @Override
    public int hashCode() {
        return serailNumber == null ? 0 : this.serailNumber.hashCode();
    }
}
