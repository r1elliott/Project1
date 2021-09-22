import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) throws IOException {
        var fileName = "products.txt";
        var productsproject = Paths.get(fileName);
        var products = new ArrayList<String>();
        var productNumbers = new ArrayList<Integer>();
        var productprices = new ArrayList<Float>();
        var productss = Files.readAllLines(productsproject);
        for (var line : productss) {
            var splitLine = line.split(",");
            products.add(splitLine[0]);
            var ProductNum = Integer.parseInt(splitLine[2]);
            productNumbers.add(Integer.parseInt(splitLine[2]));
            var productPri = Float.parseFloat(splitLine[1]);
            productprices.add(productPri);
        }
        var inputReader = new Scanner(System.in);
        System.out.print("Would you like to continue?");
        var contin = "";
        contin = inputReader.nextLine();
        var userProduct = "";
        while (contin.equals("Yes")) {
            if (contin.equals("Yes"))
                System.out.print("Pick a product name: ");
            userProduct = inputReader.nextLine();
            System.out.print("Yes, we have " + userProduct + "! Currently we have " + productNumbers + " available at " + productprices + " per pound!\n");
        }
        if (contin.equals("No"))
        {
            System.out.print("Thank you for looking at our inventory!");
                }
        else if (!products.contains(userProduct));
            System.out.print("\tI'm sorry, we do not sell that product. Please try again.");
            }
        }