from account import Account

class Driver(Account):
    def __init__(self, name, document, id, email, password):
        super().__init__(name, document)
        self.email = email
        self.password = password