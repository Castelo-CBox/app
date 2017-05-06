package com.hackathon.castelo.cbox.model;

/**
 * Created by macbook on 06/05/17.
 */

public class People {

    String name;
    String cpf;
    String email;
    String phone;

    public People (){

    }

    public People (String name, String cpf, String email, String phone) {
        this.name = name;
        this.cpf  = cpf;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String telefone) {
        this.phone = phone;
    }
}
