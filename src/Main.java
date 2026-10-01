//TODO: musimy dodać brakujące klasy!

//OK, ja dodam "Adder", a s35343 doda "Substractor".

public class Main {
    public static void main(String[] args) {
        Adder adder = new adder();
        System.out.println(adder.add(1, 2));

        Substractor substractor = new Substractor();

        System.out.println(Substractor.substract(6, 3));
    }
}
