package olya.spring.first;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    public List<String> getSong() {
        List<String> classicalMusicSongs= new ArrayList<String>();
        classicalMusicSongs.add("Classical music song 1!");
        classicalMusicSongs.add("Classical music song 2!");
        classicalMusicSongs.add("Classical music song 3!");
        return classicalMusicSongs;
    }
}
