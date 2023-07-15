import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<String>();
        ArrayList<String> recommendations = new ArrayList<String>();
        HashMap<String, Double> prices = new HashMap<String, Double>();
        HashMap<String, String> specs = new HashMap<String, String>();
        
        // Pre-defined items and their prices and specs
        prices.put("mobile", 39999.00);
        specs.put("mobile", "6.7-inch display, 256GB storage, 108MP+50MP+50MP camera");
        
        prices.put("tv", 59999.00);
        specs.put("tv", "55-inch 4K Ultra HD Smart LED TV");
        
        prices.put("washing machine", 15999.00);
        specs.put("washing machine", "5.2 cu. ft. High-Efficiency Front Load Washer with Steam");
        
        prices.put("table cloth", 40.00);
        specs.put("table cloth", "60 x 84 inches, 100% cotton, Machine washable");
        
        prices.put("bottle", 1000.00);
        specs.put("bottle", "32 oz, Stainless steel, Vacuum insulated");
        
        prices.put("mirror", 49.99);
        specs.put("mirror", "24 x 36 inches, Wall-mounted, Beveled edge");
        
        prices.put("bed sheet", 400.00);
        specs.put("bed sheet", "Queen size, 100% cotton, 400 thread count");
        
        prices.put("bag", 3000.00);
        specs.put("bag", "Leather, Shoulder bag, Zip closure");
        
        prices.put("laptop", 99000.00);
        specs.put("laptop", "15.6-inch display, Intel Core i7, 16GB RAM, 1TB SSD");
        
        prices.put("earphones", 5000.00);
        specs.put("earphones", "In-ear, Noise-cancelling, Wireless");
        
        prices.put("fan", 1500.00);
        specs.put("fan", "16-inch pedestal fan, Adjustable height, Remote control");
        
        prices.put("soap", 30.00);
        specs.put("soap", "4 oz bar, Natural ingredients, Lavender scent");
        
        // Pre-defined recommendations for certain items
        recommendations.add("mobile: Case, Screen protector, Earphones");
        recommendations.add("tv: Wall mount, HDMI cable, Home theatre");
        recommendations.add("washing machine: Detergent, Fabric softener");
        recommendations.add("table cloth: Placemats, Napkins");
        recommendations.add("bottle: Cleaning brush, Bag, Compass box, Pencil");
        recommendations.add("mirror: Cleaning spray");
        recommendations.add("bed sheet: Comforter, Pillow covers");
        recommendations.add("bag: Wallet, Keychain");
        recommendations.add("laptop: Mouse, Keyboard, Pendrive, Sleeve");
        recommendations.add("earphones: Protective case");
        recommendations.add("fan: Extension cord");
        recommendations.add("soap: Container");
        
        System.out.println("\nEnter item names for shopping (type 'done' when finished): ");
        String input = scanner.nextLine();
        
        while (!input.equals("done")) {
            if (prices.containsKey(input)) {
                shoppingList.add(input);
            } else {
                System.out.println(input + ": Item not available");
            }
            
            input = scanner.nextLine();
        }
        
        System.out.println("\nYour cart: ");
        
        for (String item : shoppingList) {
            System.out.println(item + ": ");
            System.out.println("\tPrice: Rs." + prices.get(item));
            System.out.println("\tSpecs: " + specs.get(item));
            
            // Print out pre-defined recommendations for the item
            for (String recommendation : recommendations) {
                if (recommendation.startsWith(item + ":")) {
                    System.out.println("\tRecommendations: " + recommendation.substring(recommendation.indexOf(":") + 1).trim());
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Call 9876543210 for customer support.");
        System.out.println("Thank you!");
    }
}
