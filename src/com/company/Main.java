//2YY9Z6Z4
//A.A.

//a)
private Animal createNewAnimal(String name, String type, double age){
    int cost = 0;
    if(age > 1){
        cost=15;
        }
    for(int i = 0; i<Animal.size(); i++){}
        if(age < 1 && type.equals(Animal.get(i).type) < 5){
            cost=25;
            }
        if(age < 1 && type.equals(Animal.get(i).type) > 5){
            cost=20;
            }
    Animal(name, type, age, cost);
    return Animal;
}


//b)
public void addAnimal(String name, String type, double age){
    for(int i = Animal.size(); i>0; i--){
        if(age>Animal.get(i).getAge){
            Animal.add(i+1,createNewAnimal(name, type, age));
        }
    }
}

//c)
public getAnimalWithMostInterest(String name, String type, double age)
We would need a publc int variable that would hold the number of times someone asked about the animal in the AnimalShelter class
We would need an accessor method to give us the value of this public int variable (also located in the AnimalShelter class)
We would also add this variable to the constructor in the Animal class:
it would look like this - public Animal(String n, String t, double a, int c, int asked)
All the methods in the AnimalShelter class would have to altered to add the number of times someone asked about the animal to be in its parameter