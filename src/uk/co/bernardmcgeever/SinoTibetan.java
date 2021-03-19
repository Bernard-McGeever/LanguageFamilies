package uk.co.bernardmcgeever;

public class SinoTibetan extends Language
{
    SinoTibetan(String name, String numSpeakers) {
        super(name, numSpeakers, "Asia", "subject-object-verb");
        if (name.contains("Chinese")){
            this.wordOrder = "subject-verb-object";
        }
    }
}
