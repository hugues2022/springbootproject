package com.mycompany.springboot.springbootproject.common.constant;

public enum StatusType {
    
    TODO(1, "A Faire"), INPROGRESS(2, "En cours"), INAPPROVAL(3, "En Validation"), DONE(4,"Terminé");

    private int id;
    private String name;

    StatusType(int id, String nom){
        this.id = id;
        this.name = nom;
    }

    public int getId(StatusType status){
        int r = 0;
        switch (status) {
            case TODO:
                r = 1;
                break;
            case INPROGRESS:
                r = 2;
                break;
            case INAPPROVAL:
                r = 3;
                break;
            case DONE:
                r = 4;
                break; 
            default:

                break;
        }
        return r;
    }
}
