package exercicios;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("Elefante",2000);
        Cachorro cachorro = new Cachorro("Bidu",28,"Vira lata");

        System.out.println(animal);
        System.out.println(cachorro);

        Animal animal1 = new Cachorro("Heros",35,"Pastor alemão");
        if(animal1 instanceof Cachorro cachorro1){

            System.out.println("Dados do casting " + cachorro1.getRaca());
        }




    }
}
