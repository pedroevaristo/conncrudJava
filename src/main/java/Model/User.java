package Model;

public class User {
    private final int Id;
    private String completeName;
    private String cep;//ideia de usar API do gov, mas por enquanto fazer na mão
    private String email;
    private String password;

    public User(int id, String completeName, String cep, String email, String password) {
        Id = id;
        this.completeName = completeName;
        this.cep = cep;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return Id;
    }

    public String getCompleteName() {
        return completeName;
    }

    public String getCep() {
        return cep;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public User setId(int id) {
        Id = id;
        return this;
    }

    public User setCompleteName(String completeName) {
        this.completeName = completeName;
        return this;
    }

    public User setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String toString(){
        return "User={ completeName: " + completeName + ", cep: " + cep + ", email: " + email + " }";
    }
}
