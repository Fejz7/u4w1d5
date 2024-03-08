package multimedia;


public interface RegistrazioneAudio extends Riproducibile {
    int getVolume();
    void setVolume(int volume);
    void abbassaVolume();
    void alzaVolume();
}
