package entities;

public class Email {

    private String endereco;

    public Email(String email) {
        if(!isValid(email)) throw new BusinessException("Email is invalid");

        this.endereco = email;
    }
    private boolean isValid(String email) {
        String patter = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return email.matches(patter);
    }

    public String getEndereco() {
        return endereco;
    }
}
