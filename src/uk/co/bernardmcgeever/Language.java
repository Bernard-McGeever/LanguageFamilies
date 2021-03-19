package uk.co.bernardmcgeever;

public class Language
{
    protected String name;
    protected String numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String name, String numSpeakers, String regionsSpoken, String wordOrder){
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    // Get info
    public void getInfo(){
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder + ".");
    }
}
