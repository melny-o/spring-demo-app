package olya.spring.first;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    public List<String> getSong() {
        List<String> rockMusicSongs = new ArrayList<String>();
        rockMusicSongs.add("Rock Music song 1!");
        rockMusicSongs.add("Rock Music song 2!");
        rockMusicSongs.add("Rock Music song 3!");
        return rockMusicSongs;
    }
}
