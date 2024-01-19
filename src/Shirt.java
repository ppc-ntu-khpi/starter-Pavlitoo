public class Shirt {
    public int shirtID = 1;
    public String description = "firstDeveloper";
    // Кольори: red, blue, green, unset
    public String colorCode = "R";
    public double price = 15.0;
    public int quantityInStock = 150;

    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description: " + description);
        System.out.println("Color Code: " + getColorString());
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }

    private String getColorString() {
        // Перевіряємо значення colorCode і повертаємо відповідний рядок
        switch (colorCode) {
            case "R":
                return "red";
            case "B":
                return "blue";
            case "G":
                return "green";
            default:
                return "unset";
        }
    }
}