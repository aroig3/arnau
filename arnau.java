package primer_java;

public class Alumne {
public String nom;

public void saluda() {
   System.out.println("Hola, em dic " + nom);
}

public Alumne(String nom) {
   this.nom=nom;
}

public static void main(String[] args) {
   Alumne arnau=new Alumne("arnau");
   arnau.saluda();
}
}
