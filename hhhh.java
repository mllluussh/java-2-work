public static double calculateTicketPrice(int age, double basePrice) {
    if (age <= 7) {
        return 0.0; 
    } else if (age <= 17) {
        return basePrice * 0.5; 
    } else if (age <= 64) {
        return basePrice; 
    } else {
        return basePrice * 0.7; 
    }
}
