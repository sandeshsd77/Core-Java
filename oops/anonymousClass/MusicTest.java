package oops.anonymousClass;

public class MusicTest {
    public static void main(String[] args) {
        //1. using subclass separately
        MusicService musicService = new MusicServiceImpl();
        musicService.play();

        //2, anonymous class way
        MusicService musicService1 = new MusicServiceImpl(){
            @Override
            void play() {
                System.out.println("Playing using anonymous class ");
            }
        };
        musicService1.play();
    }
}
