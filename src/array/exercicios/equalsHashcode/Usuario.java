package array.exercicios.equalsHashcode;

public class Usuario {
        String nome;
        String email;

        public boolean equals(Object objeto) {

                Usuario outhers = (Usuario) objeto;
                boolean nameEqual = outhers.nome.equals(this.nome);
                boolean emailEqual = outhers.email.equals(this.email);

                return  nameEqual && emailEqual;

        }
}
