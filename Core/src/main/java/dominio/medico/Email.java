package dominio.medico;

public class Email {

    private String endereco;

    public Email(String email) throws IllegalArgumentException{
        if(!isValid(email)) throw new IllegalArgumentException("Email is invalid");

        this.endereco = email;
    }
    private boolean isValid(String email) {
        String patter = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

        return email.matches(patter);
    }
}
