public class Program {
    public static void main(String[] args) 
    {
        Animal dog = new Animal("Pikachu","Dog",10,true);
        
        
        Penguin pete = new Penguin("Pete", "penguin", 20, true);
        // pete.setName(name: "Pete");
        // pete.setAge(age: 20);
        // pete.setSpecies("penguin");
        // pete.setIsmammal(ismammal: true);

        Deer bambi = new Deer();
        bambi.setAge(40);
        bambi.setName("Bambi");
        bambi.setSpecies("Deer");
        bambi.setIsmammal(true);

    }
};