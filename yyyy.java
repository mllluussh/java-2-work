public static double calculate(double num1, double num2, char operator) {
    switch (operator) {
        case '+':
            return num1 + num2;
        
        case '-':
            return num1 - num2;
        
        case '*':
            return num1 * num2;
        
        case '/':
            if (num2 == 0) {
                System.out.println("Ошибка: деление на ноль невозможно!");
                return 0;
            }
            return num1 / num2;
        
        default:
            System.out.println("Ошибка: неверный оператор '" + operator + "'!");
            return 0;
    }
}
