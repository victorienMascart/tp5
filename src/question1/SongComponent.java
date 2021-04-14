package question1;

public abstract class SongComponent {
    int size;
    public void add(SongComponent newSongComponent) {
        size++;
    }

    public void remove(SongComponent newSongComponent) {
        throw new UnsupportedOperationException();
    }


    public SongComponent getComponent(int componentIndex) {
        throw new UnsupportedOperationException();
    }

    public String getSongName() {
        throw new UnsupportedOperationException();
    }

    public String getBandName() {
        throw new UnsupportedOperationException();
    }

    public int getReleaseYear() {
        throw new UnsupportedOperationException();
    }


    public void displaySongInfo() {
        throw new UnsupportedOperationException();
    }

}
