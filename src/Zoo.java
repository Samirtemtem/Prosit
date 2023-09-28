public class Zoo {
    public Animal[] animals;
    public String name;
    public String city;
    public int nbrCages;
    public static int nbrAnimaux = 0;
    public Zoo(int nbrAnimals,String name, String city, int nbrCages) {
        nbrAnimaux++;
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
        System.out.println(nbrAnimaux);

        this.animals[nbrAnimaux]=animal;
        System.out.println(this.animals[nbrAnimaux++].name);
        /*
        for (int i = 0; i < this.animals.length; i++) {
            if(this.animals[i]==null) {
                this.animals[i] = animal;
                return true;
            }
        }*/
        return false;
    }
    public void displayAnimals()
    {
        int i = 0;
        /*
        for (Animal animal : this.animals) {
            i++;
            if (animal == null) {
                break;
            }
            System.out.println("Animal["+i+"] = family="+animal.family+" | name = "+animal.name+" | age ="+animal.age+"| Mammal = "+((animal.isMammal) ? "yes" :  "no"));

        }*/
        if (this.animals[1]!=null)
        {
            for (i = 1; i < nbrAnimaux; i++) {
                System.out.println("Animal[" + i + "] = family=" + animals[i].family + " | name = " + animals[i].name + " | age =" + animals[i].age + "| Mammal = " + ((animals[i].isMammal) ? "yes" : "no"));
            }
        }
    }
    public int searchAnimal(Animal animal)
    {
        for (int i = 1; i < nbrAnimaux; i++) {
            if (this.animals[i]!=null) {
                if (animals[i].name.equals(animal.name)) {
                    return i;
                }
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal an){
        int pos = searchAnimal(an);
        System.out.println(pos);
        if (pos == -1)
            return false;

        for (int i = pos; i < nbrAnimaux - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimaux - 1] = null;
        nbrAnimaux--;
        return true;
        // needs modif
    }
}
