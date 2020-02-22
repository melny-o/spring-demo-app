package olya.spring.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rockMusic") Music rockMusic){
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    private int indexOfRandomSong(){
            Random random = new Random();
            int amountOfSongs = classicalMusic.getSong().size();
            return random.nextInt(amountOfSongs);
    }

    public String playMusic(GenreOfMusic musicGenre) {
        switch (musicGenre) {
            case ClassicalMusic: {
                return "Playing:" + classicalMusic.getSong().get(indexOfRandomSong());
            }
            case RockMusic: {
                return "Playing:" + rockMusic.getSong().get(indexOfRandomSong());
            }
            default: {
                return "Nothing is selected!";
            }
        }

    }
}
