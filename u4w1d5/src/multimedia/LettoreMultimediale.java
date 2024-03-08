package multimedia;

import java.util.Scanner;


public class LettoreMultimediale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];


        for (int i = 0; i < elementi.length; i++) {
            System.out.println("Inserisci il tipo di elemento (1=Immagine, 2=Registrazione Audio, 3=Video):");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il titolo:");
            String titolo = scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.println("Inserisci la luminosità:");
                    int luminosita = scanner.nextInt();
                    elementi[i] = new Immagine(titolo, luminosita);
                    break;
                case 2:
                    System.out.println("Inserisci la durata:");
                    int durataRA = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volume = scanner.nextInt();
                    elementi[i] = new RegistrazioneAudioImpl(titolo, durataRA, volume);
                    break;
                case 3:
                    System.out.println("Inserisci la durata:");
                    int durataV = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volumeV = scanner.nextInt();
                    System.out.println("Inserisci la luminosità:");
                    int luminositaV = scanner.nextInt();
                    elementi[i] = new VideoImpl(titolo, durataV, volumeV, luminositaV);
                    break;
                default:
                    System.out.println("Tipo non valido. Inserisci nuovamente.");
                    i--;
                    break;
            }
        }


        int scelta;
        do {
            System.out.println("Quale elemento eseguire? (1-5, 0 per terminare):");
            scelta = scanner.nextInt();
            if (scelta >= 1 && scelta <= 5) {
                if (elementi[scelta - 1] instanceof Riproducibile) {
                    ((Riproducibile) elementi[scelta - 1]).play();
                } else if (elementi[scelta - 1] instanceof Immagine) {
                    ((Immagine) elementi[scelta - 1]).show();
                }
            } else if (scelta != 0) {
                System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 0);


        scanner.close();
    }
}

