package com.hackathon.castelo.cbox.model;

/**
 * Created by macbook on 06/05/17.
 */

public class Page {

    String link;
    int sex_user;
    String name;
    String qtde;
    String age;

    public Page() {

    }

    public Page(String link, int sex_user, String name, String qtde, String age) {
        this.link = link;
        this.sex_user = sex_user;
        this.name = name;
        this.qtde = qtde;
        this.age = age;
    }

    public int getSex_user() {
        return sex_user;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setSex_user(int sex_user) {
        this.sex_user = sex_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQtde() {
        return qtde;
    }

    public void setQtde(String qtde) {
        this.qtde = qtde;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
