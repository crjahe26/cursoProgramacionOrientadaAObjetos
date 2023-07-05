class Driver extends Account {
    constructor(license, document, id, email, password) {
        super(license, document)
        this.id = id;
        this.email = email;
        this.password = password;
    }
}