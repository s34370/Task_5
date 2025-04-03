import java.util.ArrayList;

public class Klient {
private String imie;
private String nazwisko;
private String email;
private ArrayList<Wydarzenie> listaRezerwacji;

public Klient(String imie, String nazwisko, String email) {
this.imie = imie;
this.nazwisko = nazwisko;
this.email = email;
}
public Klient(String imie, String nazwisko) {
    this.imie = imie;
    this.nazwisko = nazwisko;
}
public boolean dokonajRezerwacji(Wydarzenie w) {
    listaRezerwacji.add(w);
    return true;
}
public void wyświetlRezerwacje(){
    for(Wydarzenie w : listaRezerwacji){
        System.out.println(w.toString());
    }
}
public void anulujRezerwację(Wydarzenie w) {
    listaRezerwacji.remove(w);
}
public void anulujRezerwację(String nazwaWydarzenia){
    for(int i=0; i<listaRezerwacji.size(); i++){
        Wydarzenie w = listaRezerwacji.get(i);
        if(w.getNazwa().equals(nazwaWydarzenia)){
            listaRezerwacji.remove(i);
            return;
        }
    }
}

public String getImię() {
    return imie;
}
public void setImię(String imie) {
    this.imie = imie;
}
public String getNazwisko() {
    return nazwisko;
}
public void setNazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
}