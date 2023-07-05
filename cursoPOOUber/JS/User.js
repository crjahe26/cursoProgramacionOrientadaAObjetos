class User extends Account {
    constructor(license, driver, id, email, password) {
        super(license, driver)
        this.id = id;
        this.email = email;
        this.password = password;
    }
}