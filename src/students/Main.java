package students;

import students.*;

public class Main {
    public static void main(String[] args) {

        Griffindor harryPotter = new Griffindor( "Harry Potter",400,8,9,6,5);
        Griffindor hermioneGranger = new Griffindor( "Hermione Granger",46,89,80,69,80);
        Griffindor ronWeasley = new Griffindor( "Ron Weasley",57,59,33,70,85);

        hermioneGranger.compareGriffindor(harryPotter);

        Hufflepuff ZachariahSmith = new  Hufflepuff("Zachariah Smith",22,67,65,45,65);
        Hufflepuff cedricDiggory = new  Hufflepuff("Cedric Diggory",67,5,14,54,48);
        Hufflepuff JustinFinchFletchley = new  Hufflepuff("Justin Finch-Fletchley",20,62,5,60,4);

        cedricDiggory.compareHufflepuff(JustinFinchFletchley);

        Ravenclaw zhouChang = new Ravenclaw( "Zhou Chang",11,36,33,75,25);
        Ravenclaw padmaPatil = new Ravenclaw( "Padma Patil",57,59,33,70,85);
        Ravenclaw marcusBelby = new Ravenclaw( "Marcus Belby",57,59,33,70,85);

        padmaPatil.compareRavenclaw(zhouChang);

        Slytherin dracoMalfoy = new Slytherin( "Draco Malfoy",57,59,33,70,85);
        Slytherin grahamMontague = new Slytherin( "Graham Montague",57,59,33,70,85);
        Slytherin gregoryGoyle = new Slytherin( "Gregory Goyle",57,59,33,70,85);

        grahamMontague.compareSlytherin(dracoMalfoy);

        System.out.println("------------------------------------------------------------------------------------");

        HogwartsStudent.compareByBasicAttributes(harryPotter,ZachariahSmith);
        HogwartsStudent.compareByBasicAttributes(harryPotter,gregoryGoyle);



    }
}