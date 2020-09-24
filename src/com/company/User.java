package com.company;

public class User {
    private  String name;
    private  String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }



    public String getName() {
        return name;
    }

    public User(String name,String word) {
        super();
        this.name=name;
        this.word=word;
    }

    public void setName(String name) {
        this.name = name;
    }
}
