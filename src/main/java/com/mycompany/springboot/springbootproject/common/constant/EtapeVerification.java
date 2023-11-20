package com.mycompany.springboot.springbootproject.common.constant;

public enum EtapeVerification {
    
    ETUDE(1, "Etude préalable du dossier"), 
    AVIS_VERIFICATION(2,"Avis de vérification au contribuable"),
    PRISE_CONTACT(3,"Prise de contact avec le contribuable"),
    CONTROLE(4,"Vérification sur place"),
    SYNTHESE(5,"Synthèse de la vérification"),
    RESTITUTION(6,"Débat Oral et contradiction"),
    NOTIFICATION(7,"Notification sur les résultats de la vérification"),
    CLOTURE(8,"Clôture de la vérification");

    private int id;
    private String name;

    EtapeVerification(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
