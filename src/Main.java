import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String nameProduct;
        double value;
        int quantity;
        ArrayList<Product> productArrays = new ArrayList<>();

        String path = "C:\\Users\\Flavio\\Documents\\hoppinglist\\src\\Utils\\list.csv";
        String destinyPath = "C:\\Users\\Flavio\\Documents\\hoppinglist\\src\\Utils\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] arr = line.split(",");

                nameProduct = arr[0];
                value = Double.parseDouble(arr[1]);
                quantity = Integer.parseInt(arr[2]);

                Product referenceProduct = new Product(nameProduct, value, quantity);
                productArrays.add(referenceProduct);

                line = br.readLine();
            }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(destinyPath, false))) {
                for(Product prod: productArrays){
                    bw.write(prod.toString());
                    bw.newLine();
                }
            }
            System.out.println(productArrays.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}