package students;

public class Ravenclaw extends HogwartsStudent {

    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int powerOfWitchcraft, int transgression, int wise, int witty, int creativity) {
        super(name, powerOfWitchcraft, transgression);
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    private int calculateSumOfAttributes() {
        return wise + witty + creativity;
    }

    public void compareRavenclaw(Ravenclaw ravenclaw){
        if (calculateSumOfAttributes() > ravenclaw.calculateSumOfAttributes()){
            System.out.println(getName()+" лутший из Когтевран ");
        } else if (calculateSumOfAttributes() < ravenclaw.calculateSumOfAttributes()) {
            System.out.println(getName()+" лутший из Когтевран ");
        }else {
            System.out.println("студенты Когтевран равны ");
        }
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                '}';
    }
}
