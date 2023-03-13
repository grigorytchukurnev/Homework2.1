package students;

abstract public class HogwartsStudent {
    private final String name;
    private final int powerOfWitchcraft;
    private final int transgression;

    public HogwartsStudent(String name, int powerOfWitchcraft, int transgression) {
        this.name = name;
        this.powerOfWitchcraft = powerOfWitchcraft;
        this.transgression = transgression;
    }
    public  String getName() {
        return name;
    }

    public int getPowerOfWitchcraft() {
        return powerOfWitchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    private int calculateBasicAttributesSum(){
        return powerOfWitchcraft + transgression;
    }

    public void compareByBasicAttributes(HogwartsStudent hogwartsStudent){
        if (calculateBasicAttributesSum() > hogwartsStudent.calculateBasicAttributesSum()){
            System.out.println(this.getName() + "This больше ОБЩЕЕ " + name);
        } else if (calculateBasicAttributesSum() < hogwartsStudent.calculateBasicAttributesSum()) {
            System.out.println(this.getName() +" обладает  мощностью магии, чем "  );
        }else {
            System.out.println("студенты равны ");
        }
    }
    public static void compareByBasicAttributes(HogwartsStudent hogwartsStudent1,HogwartsStudent hogwartsStudent2){
        if (hogwartsStudent1.calculateBasicAttributesSum() > hogwartsStudent2.calculateBasicAttributesSum()){
            System.out.println(hogwartsStudent1.getName() + " большей мощностью магии, чем " + hogwartsStudent2.getName());
        } else if (hogwartsStudent1.calculateBasicAttributesSum() < hogwartsStudent2.calculateBasicAttributesSum()) {
            System.out.println(hogwartsStudent2.getName() + " большей мощностью магии, чем " + hogwartsStudent1.getName());
        }else {
            System.out.println(hogwartsStudent2.getName() + " студенты равны " + hogwartsStudent1.getName());
        }
    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "name='" + name + '\'' +
                ", powerOfWitchcraft=" + powerOfWitchcraft +
                ", transgression=" + transgression +
                '}';
    }


}
