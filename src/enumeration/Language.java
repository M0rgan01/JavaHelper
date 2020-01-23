package enumeration;

public enum Language {

    JAVA("Langage JAVA", "Eclipse"),
    C ("Lanage C", "Code Block"),
    CPlus ("Langage C++", "Visual studio"),
    PHP ("Langage PHP", "PS Pad");

    private String name ="";
    private String editor="";

    Language(String name, String editor){
        this.name=name;
        this.editor=editor;

    }

    public void getEditor() {
        System.out.println("Editeur : "+editor);
    }

    public String toString() {
        return name;
    }
}
