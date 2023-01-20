package kata5_P2.model;

public class Mail {
    private String mail;
    
    public Mail(String mail){
        this.mail = mail;
    }
    public String getDomain(){
        String[] dominio = mail.split("@");
        return dominio[1];
    }
}
