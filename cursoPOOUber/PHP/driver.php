<?php
require_once('account.php');

class Driver extends Account {
    public function __construct($name, $document, $id, $email, $password){
        parent::__construct($name, $document);
            $this->$id = $id;
            $this->$email = $email;
            $this->$password = $password;
    }
}

?>