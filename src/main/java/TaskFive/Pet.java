package TaskFive;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    // fields for pet
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    //constructors
    public Pet() {
    }

    public Pet(String nickname, String species) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String nickname, String species,int age, int trickLevel, String[] habits) {
        this.nickname = nickname;
        this.species = species;
        this.age =age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    static{
        System.out.println("a new class is being loaded "+ Pet.class.getName());
    }
    {
        System.out.println("a new object is created" + this.getClass());
    }
    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.printf("Hello, owner. I am, %s. I miss you!\n", this.nickname);

    }
    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age
                && trickLevel == pet.trickLevel
                && Objects.equals(species, pet.species)
                && Objects.equals(nickname, pet.nickname)
                && Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }

    @Override
    public String toString() {
        return  species +"{" +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
