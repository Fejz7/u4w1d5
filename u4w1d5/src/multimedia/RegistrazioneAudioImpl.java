package multimedia;


public class RegistrazioneAudioImpl extends ElementoMultimediale implements RegistrazioneAudio {
    private int durata;
    private int volume;

    public RegistrazioneAudioImpl(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void alzaVolume() {
        volume++;
    }

    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + " " + "!".repeat(volume));
        }
    }
}
