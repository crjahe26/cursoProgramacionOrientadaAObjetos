<?php

class Account {
    public $id;
    public $name;
    public $document;
    public $email;
    public $Password;

    public function __construct($name, $document){
        $this->name = $name;
        $this->document = $document;
    }
}

?>