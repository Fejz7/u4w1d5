package multimedia;


public class VideoImpl extends RegistrazioneAudioImpl implements Video {
    private int luminosita;

    public VideoImpl(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }


}
