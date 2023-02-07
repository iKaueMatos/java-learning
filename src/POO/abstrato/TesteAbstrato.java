package POO.abstrato;

public class TesteAbstrato {
    public static void main(String[] args) {
        //Animal a = new Cachorro();
        //System.out.println(a.mover());
        //System.out.println(a.mamar());

        Mamifero b = new Mamifero() {
            @Override
            public String mamar() {
                return null;
            }

            @Override
            public String mover() {
                return null;
            }
        };

    }
}
