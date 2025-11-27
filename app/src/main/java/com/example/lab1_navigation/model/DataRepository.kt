class DataRepository {

    private val users = listOf(
        User(1, "Чарлі", 21),
        User(2, "Боб", 25),
        User(3, "Миколай", 19),
        User(4, "Оскар", 22),
        User(5, "Потап", 27),
    )

    private val products = listOf(
        Product(1, "Laptop", 1499.0),
        Product(2, "Gaming Mouse", 39.9),
        Product(3, "Mechanical Keyboard", 89.5),
        Product(4, "Headphones", 129.0),
        Product(5, "Monitor 27\"", 249.99),
        Product(6, "USB-C Cable", 9.99),
        Product(7, "Webcam", 59.99),
        Product(8, "Microphone", 79.0),
        Product(9, "Smartphone", 999.0),
        Product(10, "Tablet", 699.0),
        Product(11, "Powerbank 20000mAh", 45.0),
        Product(12, "Bluetooth Speaker", 39.0),
        Product(13, "Smartwatch", 199.0),
        Product(14, "External SSD 1TB", 109.0),
        Product(15, "Graphics Card RTX 4060", 499.0),
        Product(16, "Router WiFi 6", 79.9),
        Product(17, "VR Headset", 349.0),
        Product(18, "Portable Projector", 229.0),
        Product(19, "Drone Mini", 299.0),
        Product(20, "LED Desk Lamp", 25.0)
    )

    fun getUsers(): List<User> = users
    fun getProducts(): List<Product> = products
}
