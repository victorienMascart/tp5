package question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompositeTest {
    @Test
    public void instanceOfSongComponent() {
        SongGroup songGroup = new SongGroup("Industrial",
                        "is a style of experimental music that draws on transgressive and provocative themes");
        assertTrue(songGroup instanceof SongComponent);

        Song song = new Song("Head Like a Hole", "NIN", 1990);
        assertTrue(song instanceof SongComponent);
    }

    @Test
    public void addToComponent() {
        SongGroup songGroup = new SongGroup("Industrial",
                "is a style of experimental music that draws on transgressive and provocative themes");
        songGroup.add(new Song("Head Like a Hole", "NIN", 1990));

        assertEquals(1, songGroup.songComponents.size());
    }

    @Test
    public void test() {
        SongComponent industrialMusic =
                new SongGroup("Industrial",
                        "is a style of experimental music that draws on transgressive and provocative themes");

        SongComponent heavyMetalMusic =
                new SongGroup("\nHeavy Metal",
                        "is a genre of rock that developed in the late 1960s, largely in the UK and in the US");

        SongComponent dubstepMusic =
                new SongGroup("\nDubstep",
                        "is a genre of electronic dance music that originated in South London, England");

        SongComponent everySong = new SongGroup("Song List", "Every Song Available");
        MusicStore crazyLarry = new MusicStore(everySong);

        everySong.add(industrialMusic);
        assertEquals(1, crazyLarry.songList.size);

        industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));
        assertEquals(2, industrialMusic.size);

        everySong.add(dubstepMusic);
        assertEquals(2, crazyLarry.songList.size);

        dubstepMusic.add(new Song("Centipede", "Knife Party", 2012));
        dubstepMusic.add(new Song("Tetris", "Doctor P", 2011));
        assertEquals(2, dubstepMusic.size);

        everySong.add(heavyMetalMusic);
        assertEquals(3, crazyLarry.songList.size);

        heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));
        assertEquals(2, heavyMetalMusic.size);

        crazyLarry.getSongList();
    }
}
