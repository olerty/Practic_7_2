package com.company;

public class DalmatianDog extends Dog {

    public DalmatianDog(String name, int dog_age, String gender){
        super(name, dog_age, gender);
        setPeopleAge();
    }

    @Override
    public void tell() {
        System.out.println("Я Далматинец\nМеня зовут " + getName() +
                "\nЯ " + getGender() +
                "\nМне " + getDog_age() +
                ", a на человеческие года, мне "+ getPeople_age() +
                "\nИ я " + (getDesireToWalk()?"":"не ") + "хочу гулять" );
    }

    @Override
    public void walkToDog() {
        System.out.println(getName() + " погулял, и теперь хочет домой");
        setDesireToWalk(false);
    }
}
