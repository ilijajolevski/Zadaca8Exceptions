package fikt.edu.mk;

public class Covek {
    private int godini;
    private String ime;
    private String prezime;

    public int getGodini() {
        return godini;
    }

    public void setGodini(int godini) {
        this.godini = godini;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return "Ovaa klasa e Covek{" +
                "ima godini=" + godini +
                ", se vika ='" + ime + '\'' +
                ", se preziva='" + prezime + '\'' +
                '}';
    }

    public Covek(int godini, String ime, String prezime) throws NevalidniGodiniException {

        if ((godini < 0) || (godini>150)) {
            throw new NevalidniGodiniException(godini);
        } else {
            this.godini = godini;
            this.ime = ime;
            this.prezime = prezime;
        }
    }
}
