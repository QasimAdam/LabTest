public class Product {
    // Attiributes
    private String id ;
    private String name ;
    private double price ;
    private double discount ;


    // Constractor method !!
    public Product(String id ,String name , double price , double discount ){
        this.id=id ;
        this.name=name ;
        this.price=price ;
        this.discount=discount;
    }

    // Getter methods !!
    public String getId() {
        return id ;
    }
    public String getName() {
        return name ;
    }
    public double getPrice() {
        return  price ;
    }
    public  double  getDiscount() {
        return discount ;
    }

    // Method calculates price after discount !!!
    public double priceAfterDiscount() {
        return price -(price* (discount /100)) ;
    }
    // Method calculates Final price after VAT(5%) !!
    public double finalPrice() {
        double discountedPrice = priceAfterDiscount() ;
        return discountedPrice + (discountedPrice*0.05);
    }
    // main method !!
    public static void main(String[] args) {
        Product p1 = new Product("p001" , "laptop" , 1200 ,14);
        System.out.println("Detailed Calculation : ");
        System.out.println("Laptop original : " + p1.getPrice());
        System.out.println("After Discount : " + p1.priceAfterDiscount());
        System.out.println("Final with VAT :" + p1.finalPrice());

        // TV
        Product tv =new Product("TV1" ,"TV" ,380 ,18);
        System.out.println("Detailled Calculation : ");
        System.out.println("TV Original Price : " + tv.getPrice());
        System.out.println("TV price After Discount : "+ tv.priceAfterDiscount());
        System.out.println("TV price with VAT : " + tv.finalPrice());
    }
}
