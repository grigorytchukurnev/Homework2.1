package students;

public class Griffindor extends HogwartsStudent {

    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String name, int powerOfWitchcraft, int transgression, int nobility, int honor, int courage) {
        super(name, powerOfWitchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    private int calculateSumOfAttributes() {
        return nobility + honor + courage;
    }

    public void compareGriffindor(Griffindor griffindor){
        if (calculateSumOfAttributes() > griffindor.calculateSumOfAttributes()){
            System.out.println(getName()+ " лучший Гриффиндорец");
        } else if (calculateSumOfAttributes() < griffindor.calculateSumOfAttributes()) {
            System.out.println(getName() + " лучший Гриффиндорец");
        }else {
            System.out.println("студенты Пуффендуя равны ");
        }
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }
}
