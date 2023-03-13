package students;

public class Slytherin extends HogwartsStudent {

    private int cunning;
    private int determination;
    private int ambition;

    public Slytherin(String name, int powerOfWitchcraft, int transgression, int cunning, int determination, int ambition) {
        super(name, powerOfWitchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    private int calculateSumOfAttributes() {
        return cunning + determination + ambition;
    }

    public void compareSlytherin(Slytherin slytherin){
        if (calculateSumOfAttributes() > slytherin.calculateSumOfAttributes()){
            System.out.println("This больше S ");
        } else if (calculateSumOfAttributes() < slytherin.calculateSumOfAttributes()) {
            System.out.println("This меньше S ");
        }else {
            System.out.println("студенты Слизерин равны ");
        }
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                '}';
    }
}
