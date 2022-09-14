 class Calculator {
    int a;
    int b;

    boolean isRimNumbers;

    Calculator(String a, String b) {
        try {
            this.a = Integer.parseInt(a);
            this.b = Integer.parseInt(b);
            this.isRimNumbers = false;
        } catch (Exception e) {
            this.a = En.parseToInt(a);
            this.b = En.parseToInt(b);
            this.isRimNumbers = true;
        }
    }
    void checkNumbers() throws Exception {
        if (a > 10 || a < 1 || b > 10 || b < 1) {
            throw new Exception("Неподходящее число");
        }
    }
    int addition() {
        return a + b;
    }
    int deduction() {
        return a - b;
    }
    int multiplications() {
        return a * b;
    }
    int division() {
        return a / b;
    }
}