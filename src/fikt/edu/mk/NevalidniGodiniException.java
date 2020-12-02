package fikt.edu.mk;

public class NevalidniGodiniException extends Exception{
    private int nevalidniteGodini;

    public NevalidniGodiniException(int nevalidniteGodini) {
        this.nevalidniteGodini = nevalidniteGodini;
    }

    public NevalidniGodiniException(String message, int nevalidniteGodini) {
        super(message);
        this.nevalidniteGodini = nevalidniteGodini;
    }

    @Override
    public String toString() {
        return "NevalidniGodiniException{" +
                "nevalidniteGodini=" + nevalidniteGodini +
                '}';
    }
}
