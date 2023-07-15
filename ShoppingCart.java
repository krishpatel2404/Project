import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
    private List<Item> cart;
    private List<Item> favorites;
    private List<Item> recommendations;

    public ShoppingCart() {
        cart = new ArrayList<>();
        favorites = new ArrayList<>();
        recommendations = new ArrayList<>();
    }

    public void addToCart(Item item) {
        cart.add(item);
        generateRecommendations();
    }

    public void addToFavorites(Item item) {
        favorites.add(item);
    }

    public void viewItemSpecs(Item item) {
        System.out.println(item.getSpecs());
    }

    public void generateRecommendations() {
        // logic to generate recommendations based on items in the cart
        // for example, if the cart contains a mobile, recommand mobile case
        // this is just a example, we can implement more
        recommendations.clear();
        for(Item item : cart) {
            if (item.getName().equals("mobile")) {
                recommendations.add(new Item("Phone Case", "Protective phone case", 40000));
            } else if(item.getName().equals("TV")) {
                 recommendations.add(new Item("HDMI cable", "High-quality HDMI cable", 60000));
            } else if(item.getName().equals("washing machine")) {
                 recommendations.add(new Item("detergent", "High-efficiency detergent", 200));
            } else if(item.getName().equals("table cloth")) {
                 recommendations.add(new Item("placemats", "Matching placemats", 100));
            } else if(item.getName().equals("bottle")) {
                 recommendations.add(new Item("bottle", "Cleaning brush for bottles", 1000));
            } else if(item.getName().equals("mirror")) {
                 recommendations.add(new Item("cleaning spray", "Streak-free cleaning spray for mirrors", 400));
            } else if(item.getName().equals("bed sheet")) {
                 recommendations.add(new Item("pillow cover", "matching pillow cover", 400));
            } else if(item.getName().equals("bag")) {
                 recommendations.add(new Item("luggage tag", "personalized luggage tag", 3000));
            } else if(item.getName().equals("laptop")) {
                 recommendations.add(new Item("laptop sleeve", "protective laptop sleeve", 70000));
            } else if(item.getName().equals("earphones")) {
                 recommendations.add(new Item("earphone case", "protective earphone case", 5000));
            } else if(item.getName().equals("fan")) {
                 recommendations.add(new Item("air filter", "cool refreshment air filter", 600));
            } else if(item.getName().equals("soap")) {
                 recommendations.add(new Item("soap dish", "plastic soap dish with cap", 30));
            }
        }
    }

    public void viewRecommendations() {
        for(Item item : recommendations) {
            System.out.println(item.getName() + ": Rs + item.getPrice();
        }
    }

    public void viewCart() {
        double total = 0;
        for(Item item : cart) {
            System.out.println(item.getName() + ": Rs" + item.getPrice() + "(" + item.getSpecs() + ")");
            total += item.getPrice();
        }
        System.out.println("Total: Rs" + total);
    }
    
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter items to add to cart (type 'done' when finished): ");
        String input = scanner.nextLine();

        while(!input.equals("buy")) {
             // add logic to get price and specs of the items from the user or from a database
            double price = 0;
            String specs = "";
            cart.addToCart(new Item(input, specs, price));
            input = scanner.nextLine();
        }
        scanner.close();
        cart.viewCart();
    }
}

class Item {
    private String name;
    private String specs;
    private double price;

    public Item(String name, String specs, double price) {
        this.name = name;
        this.specs = specs;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSpecs() {
        return specs;
    }

    public double getPrice() {
        return price;
    }
}
