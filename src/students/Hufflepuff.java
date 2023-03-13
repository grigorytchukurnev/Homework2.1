package students;

public class Hufflepuff extends HogwartsStudent {

    private int hardworking;
    private int loyal;
    private int honest;


    public Hufflepuff(String name, int powerOfWitchcraft, int transgression, int hardworking, int loyal, int honest) {
        super(name, powerOfWitchcraft, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }


    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    private int calculateSumOfAttributes() {
        return hardworking + loyal + honest;
    }

    public void compareHufflepuff(Hufflepuff hufflepuff){
        if (calculateSumOfAttributes() > hufflepuff.calculateSumOfAttributes()){
            System.out.println(getName()+" лутший из Пуффендуя");
        } else if (calculateSumOfAttributes() < hufflepuff.calculateSumOfAttributes()) {
            System.out.println( getName()+" лутший из Пуффендуя");
        }else {
            System.out.println("студенты Пуффендуя равны ");
        }
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }
}
