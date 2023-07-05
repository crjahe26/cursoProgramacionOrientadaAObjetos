public class User extends Account{
    public User(String name, String document, Integer id, String email, String password){
        super(name, document);
        this.id = id;
        this.email = email;
        this.password = password;
    }
}
