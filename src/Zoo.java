public class Zoo {
    public Animal[] animals;
    public String name;
    public String city;
    public int nbrCages;

    public Zoo(int nbrAnimals,String name, String city, int nbrCages) {
        this.animals=new Animal[nbrAnimals];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public boolean addAnimal(Animal animal){
        if (searchAnimal(animal)!=-1)
        {
         return false;
        }
        for (int i = 0; i < this.animals.length; i++) {
            if(this.animals[i]==null) {
                this.animals[i] = animal;
                return true;
            }
        }
        return false;
    }
    public void displayAnimals()
    {
        int i = 0;
        for (Animal animal : this.animals) {
            i++;
            if (animal == null) {
                break;
            }
            System.out.println("Animal["+i+"]= family="+animal.family+" | name = "+animal.name+" | age ="+animal.age+"| Mammal = "+((animal.isMammal) ? "yes" :  "no"));

        }
    }
    public int searchAnimal(Animal animal)
    {
        for (int i = 0; i < animals.length; i++) {
            if (this.animals[i]!=null) {
                if (animals[i].equals(animal)) {
                    return i;
                }
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal an){
        int pos=searchAnimal(an);
        Animal[] proxyAnimals=new Animal[this.animals.length-1];
        System.out.println("name :" + animals[pos].name);
        if(pos==-1)
            return false;
        int j = 0;
        for(int i = pos;i<animals.length-1;i++)
        {

            if(animals[i+1]!=null) {
                animals[i] = animals[i + 1];
            }
        }
        return true;
        // needs modif
    }
}
