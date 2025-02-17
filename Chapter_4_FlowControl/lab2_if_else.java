class Demo {
    public void hasPassed(int marks) {

        if (marks >= 65 && marks <= 100) {
            System.out.println("passed Successfully!");
        } else {
            System.out.println("Failed! The range of the qualifying exam marks is between 65 and 100");
        }
    }
}

class lab2_if_else {
    public static void main(String args[]) {
        Demo obj = new Demo();
        obj.hasPassed(78);
    }
}