package com.mycompany.springboot.springbootproject.common.constant;

public enum TypeVerification {
    
    GENERAL(1, "GENERAL"), PONCTUEL(2, "Ponctuel"), INOPINE(3, "inopiné");

    private final String name;
    private final int id;

    TypeVerification(int id, String nom){
        this.name = nom;
        this.id = id;
    }
    
    public String getTypeVerificationName(){
        return name;
    }

    public int getTypeVerificationID(){
        return id;
    }
}
