package uk.co.bernardmcgeever;

public class Main {

    public static void main(String[] args) {
        Language english = new Language("english", "1000", "the UK and America", "subject-verb-object");
        english.getInfo();
        Mayan kiche = new Mayan("Kiche", "2330000");
        kiche.getInfo();
        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", "1110000000");
        mandarin.getInfo();
        SinoTibetan burmese = new SinoTibetan("Burmese", "43000000");
        burmese.getInfo();
    }
}
