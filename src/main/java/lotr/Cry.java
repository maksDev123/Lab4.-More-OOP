package lotr;

public class Cry implements KickStrategy{

    @Override
    public void kick(Character whoKick, Character opponent) {
        System.out.println("Cry...");
    }
    // public
}
