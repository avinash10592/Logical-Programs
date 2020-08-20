package Day20_logicalprograms;

import java.util.*;
import java.util.stream.Collectors;

class Product2 {
    String name;
    double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Product2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products List [name=" + name + ", price=" + price + "]";
    }
}

public class Java8Streams {
    public static void main(String[] args) {
        List<Product2> productList = new ArrayList<Product2>();
        productList.add(new Product2("Redmi Mobile", 30000));
        productList.add(new Product2("Vivo Mobile", 30000));
        productList.add(new Product2("iPhone", 60000));
        productList.add(new Product2("Samsung Note10", 70001));
        productList.add(new Product2("OnePlus 6T", 38000));

        System.out.println(productList);

        /**
         * Getting the MAX price from the product's prices
         */
        Comparator<Product2> numComp = Comparator.comparingDouble(p -> p.getPrice());
        Optional<Product2> maxPrice = productList.stream().collect(Collectors.maxBy(numComp));
        System.out.println("MAX price from the product's list: " + maxPrice);
        /**
         * Getting the MIN price from the product's prices
         */
        Optional<Product2> minPrice = productList.stream().collect(Collectors.minBy(numComp));
        System.out.println("MIN price from the product's list: " + minPrice);

        // printing the list in descending order based on the price
        List<Product2> newList = productList.stream().sorted(
                (num1, num2) -> (num1.getPrice() < num2.getPrice()) ? 1 : (num1.getPrice() > num2.getPrice()) ? -1 : 0)
                .collect(Collectors.toList());
        System.out.println("List in descending order based on the price " + newList);

        // Get the second highest (already sorted above)
        System.out.println("Product with second highest price " + newList.get(1));

        // Get the product with second lowest price
        System.out.println("Product with second lowest price " + newList.get(newList.size() - 2));

        // Get the highest (already sorted above)
        System.out.println("Product with highest price " + newList.get(0));

        // Get the product with lowest price
        System.out.println("Product with lowest price " + newList.get(newList.size() - 1));

        // GROUP BY
        // Count of similar prices:
        Map<Object, Long> typeMapCount = productList.stream()
                .collect(Collectors.groupingBy(p -> p.getName(), Collectors.counting()));
        System.out.println("Count of similar objects: " + typeMapCount);

        // Getting the List of objects whose price is more than 40000
        List<Product2> newList1 = productList.stream().filter(p -> p.getPrice() > 40000).collect(Collectors.toList());
        System.out.println(newList1);

        // Adding 4% tax to all the products
        List<Product2> newList2 = productList.stream().map(p -> {
            Double tax = p.getPrice() * 4 / 100;
            p.setPrice(p.getPrice() + tax);
            return p;
        }).collect(Collectors.toList());
        System.out.println(newList2);


    }
}
