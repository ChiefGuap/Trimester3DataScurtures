package src;

public class Exit extends Blueprint {

    public Exit(String words) {
        super.words = words;
    }

    @Override
    public String getwords() {
        return this.words;
    }

    public void run() {
        System.exit(0);
    }


}