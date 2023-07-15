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
            if (item.getName().equals("Mobile")) {
                recommendations.add(new Item("Phone Case", "Protective phone case"));
            } else if(item.getName().equals("TV")) {
                 recommendations.add(new Item("HDMI cable", "High-quality HDMI cable"));
            } else if(item.getName().equals("Washing Machine")) {
                 recommendations.add(new Item("Detergent", "High-efficiency detergent"));
            } else if(item.getName().equals("Table Cloth")) {
                 recommendations.add(new Item("Placemats", "Matching placemats"));
            } else if(item.getName().equals("bottle")) {
                 recommendations.add(new Item("Bottle", "Cleaning brush for bottles"));
            } else if(item.getName().equals("Mirror")) {
                 recommendations.add(new Item("Cleaning spray", "Streak-free cleaning spray for mirrors"));
            }
        }
    }

    public void viewRecommendations() {
        for(Item item : recommendations) {
            System.out.println(item.getName());
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter items to add to cart (type 'done' when finished): ");
        String input = scanner.nextLine();
        
        while(!input.equals("done")) {
            cart.addToCart(new Item(input, ""));
            input = scanner.nextLine();
        }
        scanner.close();
        cart.viewRecommendations();
    }
}

class Item {
    private String name;
    private String specs;

    public Item(String name, String specs) {
        this.name = name;
        this.specs = specs;
    }

    public String getName() {
        return name;
    }

    public String geSpecs() {
        return specs;
    }
}
