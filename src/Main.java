import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Bir reader extension 'ı yazılması gerekiyor (NKReader mesela)
        dosyadaki bütün kelimeleri okuma yapabilmesi ve arraylist 'e atayabilmesi gerekiyor
        dosyadan istediğim satır numarasını okuyabilmesi gerekiyor

        String 'lerin Split fonksiyonu kullanılmayacak
        Files.readAllLines kullanılmayacak
        aşağıdaki gibi bir kod yazabilmeliyim

        NKReader myReader = new NKReader("C:/dosya.txt");
        ArrayList<String> kelimeler = myReader.readWords();
        String satir = myReader.readLineAt(4);
        */
        BgReader reader = new BgReader("C:\\Users\\dnzh2\\OneDrive\\Masaüstü\\not.txt");

        try {

            ArrayList<String> kelimeler = reader.readWords();
            System.out.println(kelimeler);

            System.out.println("***************************");

            String satir = reader.readLineAt(2);
            System.out.println(satir);

        } catch (IOException e) {
            System.out.println(e.toString());
        }


    }
}
