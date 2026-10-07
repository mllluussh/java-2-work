public class GradeSystem {
    public static char getGrade(int score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score < 90) {
            return 'B';
        } else if (score >= 70 && score < 80) {
            return 'C';
        } else if (score >= 60 && score < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public static String getFeedback(char grade) {
        switch (grade) {
            case 'A':
                return "Отличная работа!";
            case 'B':
                return "Хорошо, но есть куда расти.";
            case 'C':
                return "Удовлетворительно.";
            case 'D':
                return "На грани провала.";
            case 'F':
                return "Тест не сдан, нужна пересдача.";
            default:
                return "Неизвестная оценка.";
        }
    

    public static void main(String[] args)
    {
        int testScore = 85;
        char myGrade = getGrade(testScore);
        String feedback = getFeedback(myGrade);
        System.out.println("Баллы: " + testScore);
        System.out.println("Оценка: " + myGrade);
        System.out.println("Отзыв: " + feedback);
    }
}
