public class Main {
    public static void main(String[] args) throws Exception {
        Bag<String> bag = new Bag<String>();
        bag.add("Joey");
        bag.add("Katherine");
        bag.add("Thomas");
        bag.add("Katherine");
        bag.add("Steven");
        
        // Print bag items
        System.out.print("People list: ");

        // Iterate over people
        for(String item: bag) {
            System.out.println(item);
        }

        // Print contains method
        System.out.println("\n" + "Contains Joey: " + bag.contains("Joey"));
        System.out.println("Contains Bob: " + bag.contains("Bob"));
        System.out.println("Contains Katherine: " + bag.contains("Katherine") + "\n");

        // Print Count method
        System.out.println("\n" + "Count Joey: " + bag.count("Joey"));
        System.out.println("Count Bob: " + bag.count("Bob"));
        System.out.println("Count Katherine: " + bag.count("Katherine") + "\n");

        // Pint bag size
        System.out.println("Bag size: " + bag.getCurrentSize() + "\n");

        // Remove person
        bag.remove("Thomas");

        // Print new bag
        System.out.println("People list: ");
        for(String item: bag) {
            System.out.println(item);
        }

        // Validate bag changes
        System.out.println("\n" + "Contains Thomas: " + bag.contains("Thomas"));
        System.out.println("Count Thomas: " + bag.count("Thomas") + "\n");

        System.out.println("\n"+ "Bag size: " + bag.getCurrentSize() + "\n");


    }
}
