package Main;

import java.util.Scanner;

public class GetName {
	public static void getName() {

//    Making object from food
        Bean bean = new Bean("Bean", 3.25, 30);
        Ketchup ketchup = new Ketchup("Ketchup", 4.35, 45);
        Meat meat = new Meat("Meat", 4.70, 60);
        Oil oil = new Oil("Oil", 2.70, 56);
        Potato potato = new Potato("Potato", 1.24, 30.50);
        Rice rice = new Rice("Rice", 4.37, 120.80);
        Tomato tomato = new Tomato("Tomato", 3.65, 18.00);

//    Making object from supply
        DishWashingLiquid dishWashingLiquid = new DishWashingLiquid("Dishwashing Liquid", 8.99, 25);
        FacialTissue facialTissue = new FacialTissue("Facial Tissue", 3.45, 67);
        HandSanitizer handSanitizer = new HandSanitizer("Hand Sanitizer", 5.60, 35);
        PlasticBag plasticBag = new PlasticBag("Plastic Bag", 0.10, 1200);
        ScrubbingSponge scrubbingSponge = new ScrubbingSponge("Scrubbing Sponge", 0.45, 87);
        Soap soap = new Soap("Soap", 3.89, 50);
        ToiletTowel toiletTowel = new ToiletTowel("Toilet Towel", 6.30, 110);
        
// Enter the name of items by user
        Scanner item = new Scanner(System.in);
        System.out.println("Enter your item name:");
        String itemName = item.nextLine();
        
        if (itemName.equals("Bean")) {
            System.out.println("Enter the weight of bean:");
            double weightOfBean = item.nextDouble();
            System.out.println("Enter the cost of bean per kilogram:");
            double costOfBean = item.nextDouble();
            System.out.println("Total bean in stock: " + (weightOfBean + bean.weight) + " kilograms.");
            System.out.println("Payment for beans: " + (weightOfBean * costOfBean));

        } else if (itemName.equals("Ketchup")) {
            System.out.println("Enter the amount of ketchup:");
            int amountOfKetchup = item.nextInt();
            System.out.println("Enter the cost of each ketchup:");
            double costOfKetchup = item.nextDouble();
            System.out.println("Total ketchup in stock: " + (amountOfKetchup + ketchup.amount) + " tubes.");
            System.out.printf("Payment for ketchup: " + (amountOfKetchup * costOfKetchup));

        }  else if (itemName.equals("Meat")) {
            System.out.println("Enter the weight of meat:");
            double weightOfMeat = item.nextDouble();
            System.out.println("Enter the cost of meat per kilogram:");
            double costOfMeat = item.nextDouble();
            System.out.println("Total meat in stock: " + (weightOfMeat + meat.weight) + " kilograms.");
            System.out.println("Payment for meat: " + (weightOfMeat * costOfMeat));
            
        }else if (itemName.equals("Oil")) {
            System.out.println("Enter the amount of oil:");
            int amountOfOil = item.nextInt();
            System.out.println("Enter the cost of each oil:");
            double costOfOil = item.nextDouble();
            System.out.println("Total oil in stock: " + (amountOfOil + oil.amount) + " bottles.");
            System.out.printf("Payment for oil: " + (amountOfOil * costOfOil));

        } else if (itemName.equals("Potato")) {
            System.out.println("Enter the weight of potato:");
            double weightOfPotato = item.nextDouble();
            System.out.println("Enter the cost of potato per kilogram:");
            double costOfPotato = item.nextDouble();
            System.out.println("Total potato in stock: " + (weightOfPotato + potato.weight) + " kilograms.");
            System.out.println("Payment for potato: " + (weightOfPotato * costOfPotato));
            
        } else if (itemName.equals("Rice")) {
            System.out.println("Enter the weight of rice:");
            double weightOfRice = item.nextDouble();
            System.out.println("Enter the cost of rice per kilogram:");
            double costOfRice = item.nextDouble();
            System.out.println("Total rice in stock: " + (weightOfRice + rice.weight) + " kilograms.");
            System.out.println("Payment for rice: " + (weightOfRice * costOfRice));
            
        } else if (itemName.equals("Tomato")) {
            System.out.println("Enter the weight of tomato:");
            double weightOfTomato = item.nextDouble();
            System.out.println("Enter the cost of tomato per kilogram:");
            double costOfTomato = item.nextDouble();
            System.out.println("Total tomato in stock: " + (weightOfTomato + tomato.weight) + " kilograms.");
            System.out.println("Payment for tomato: " + (weightOfTomato * costOfTomato));
            
        } else if (itemName.equals("Dishwashing Liquid")) {
            System.out.println("Enter the amount of dishwashing liquid:");
            int amountOfDish = item.nextInt();
            System.out.println("Enter the cost of each dishwashing liquid:");
            double costOfDish = item.nextDouble();
            System.out.println("Total dishwashing liquid in stock: " + (amountOfDish + dishWashingLiquid.amount) + " boxes.");
            System.out.printf("Payment for dishwashing liquid: " + (amountOfDish * costOfDish));

        } else if (itemName.equals("Facial Tissue")) {
            System.out.println("Enter the amount of facial tissue:");
            int amountOfTissue = item.nextInt();
            System.out.println("Enter the cost of each facial tissue:");
            double costOfTissue = item.nextDouble();
            System.out.println("Total facial tissue in stock: " + (amountOfTissue + facialTissue.amount) + " boxes.");
            System.out.printf("Payment for facial tissue: " + (amountOfTissue * costOfTissue));

        } else if (itemName.equals("Hand Sanitizer")) {
            System.out.println("Enter the amount of hand sanitizer:");
            int amountOfHand = item.nextInt();
            System.out.println("Enter the cost of each hand sanitizer:");
            double costOfHand = item.nextDouble();
            System.out.println("Total hand sanitizer in stock: " + (amountOfHand + handSanitizer.amount) + " tubes.");
            System.out.printf("Payment for hand sanitizer: " + (amountOfHand * costOfHand));

        } else if (itemName.equals("Plastic Bag")) {
            System.out.println("Enter the amount of plastic bag:");
            int amountOfPlastic = item.nextInt();
            System.out.println("Enter the cost of each plastic bag:");
            double costOfPlastic = item.nextDouble();
            System.out.println("Total plastic bag in stock: " + (amountOfPlastic + plasticBag.amount) + " bags.");
            System.out.printf("Payment for plastic bag: " + (amountOfPlastic * costOfPlastic));

        } else if (itemName.equals("Scrubbing Sponge")) {
            System.out.println("Enter the amount of scrubbing sponge:");
            int amountOfSponge = item.nextInt();
            System.out.println("Enter the cost of each scrubbing sponge:");
            double costOfSponge = item.nextDouble();
            System.out.println("Total scrubbing sponge in stock: " + (amountOfSponge + scrubbingSponge.amount) + " packs.");
            System.out.printf("Payment for scrubbing sponge: " + (amountOfSponge * costOfSponge));

        } else if (itemName.equals("Soap")) {
            System.out.println("Enter the amount of soap:");
            int amountOfSoap = item.nextInt();
            System.out.println("Enter the cost of each soap:");
            double costOfSoap = item.nextDouble();
            System.out.println("Total soap in stock: " + (amountOfSoap + soap.amount) + " boxes.");
            System.out.printf("Payment for soap: " + (amountOfSoap * costOfSoap));

        } else if (itemName.equals("Toilet Towel")) {
            System.out.println("Enter the amount of toilet towel:");
            int amountOfTowel = item.nextInt();
            System.out.println("Enter the cost of each toilet towel:");
            double costOfTowel = item.nextDouble();
            System.out.println("Total toilet towel in stock: " + (amountOfTowel + toiletTowel.amount) + " boxes.");
            System.out.printf("Payment for toilet towel: " + (amountOfTowel * costOfTowel));

        } else {
        	System.out.println("Please enter the name of item correctly.");
        }

        

        System.out.println("\nThe items in inventory is as follow:\n\n" + "FOOD:");
        System.out.printf("%s %.2f kilograms, at the cost of: %.2f dollars.\n", bean.item, bean.weight, bean.costPerKilo * bean.weight);
        System.out.printf("%s %d tubes, at the cost of: %.2f dollars.\n", ketchup.item, ketchup.amount, ketchup.costPerUnit * ketchup.amount);
        System.out.printf("%s %.2f kilograms, at the cost of: %.2f dollars.\n", meat.item, meat.weight, meat.costPerKilo * meat.weight);
        System.out.printf("%s %d bottles, at the cost of: %.2f dollars.\n", oil.item, oil.amount, oil.costPerUnit * oil.amount);
        System.out.printf("%s %.2f kilograms, at the cost of: %.2f dollars.\n", potato.item, potato.weight, potato.costPerKilo * potato.weight);
        System.out.printf("%s %.2f kilograms, at the cost of: %.2f dollars.\n", rice.item, rice.weight, rice.costPerKilo * rice.weight);
        System.out.printf("%s %.2f kilograms, at the cost of: %.2f dollars.\n", tomato.item, tomato.weight, tomato.costPerKilo * tomato.weight);
       
        System.out.println("SUPPLY: \n");
        System.out.printf("%s %d boxes, at the cost of: %.2f dollars.\n", dishWashingLiquid.item, dishWashingLiquid.amount, dishWashingLiquid.costPerUnit * dishWashingLiquid.amount);
        System.out.printf("%s %d boxes, at the cost of: %.2f dollars.\n", facialTissue.item, facialTissue.amount, facialTissue.costPerUnit * facialTissue.amount);
        System.out.printf("%s %d tubes, at the cost of: %.2f dollars.\n", handSanitizer.item, handSanitizer.amount, handSanitizer.costPerUnit * handSanitizer.amount);
        System.out.printf("%s %d bags, at the cost of: %.2f dollars.\n", plasticBag.item, plasticBag.amount, plasticBag.costPerUnit * plasticBag.amount);
        System.out.printf("%s %d packs, at the cost of: %.2f dollars.\n", scrubbingSponge.item, scrubbingSponge.amount, scrubbingSponge.costPerUnit * scrubbingSponge.amount);
        System.out.printf("%s %d boxes, at the cost of: %.2f dollars.\n", soap.item, soap.amount, soap.costPerUnit * soap.amount);
        System.out.printf("%s %d boxes, at the cost of: %.2f dollars.\n", toiletTowel.item, toiletTowel.amount, toiletTowel.costPerUnit * toiletTowel.amount);
      }
}
