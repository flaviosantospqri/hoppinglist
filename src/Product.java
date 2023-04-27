public class Product {
    private String nameProduct;
    private Double value;
    private Integer quantity;

    public Product(String nameProduct, Double value, Integer quantity) {
        this.nameProduct = nameProduct;
        this.value = value;
        this.quantity = quantity;
    }

    public Product() {
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double totalValue(){
        return value * quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                ", Total=" + totalValue() +
                '}';
    }
}
