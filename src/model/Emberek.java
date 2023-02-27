package model;

class Emberek {
    String nev;
    int kor;
    String neme;
    int munkTöltÉv;

    public Emberek( String nev, int kor, String neme, int munkTöltÉv) {
        this.nev = nev;
        this.kor = kor;
        this.neme = neme;
        this.munkTöltÉv = munkTöltÉv;
    }

    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public String getNeme() {
        return neme;
    }

    public int getMunkTöltÉv() {
        return munkTöltÉv;
    }
    
    
    

}
