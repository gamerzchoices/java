class MainMul {
    // Properties

    private int num1;
    private int num2;
    int mul;

    // Using getter and Setter
    int getNum1() {
        return num1;
    }

    int getNum2() {
        return num2;
    }

    void setNum1(int num1) {
        this.num1 = num1;
    }

    void setNum2(int num2) {
        this.num2 = num2;
    }

    void printMul() {
        this.mul = getNum1() * getNum2();
        System.out.println("Mul is " + this.mul);
    }

}
