package olya.spring.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer mp = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(mp.playMusic(GenreOfMusic.ClassicalMusic));
        context.close();
    }
}
