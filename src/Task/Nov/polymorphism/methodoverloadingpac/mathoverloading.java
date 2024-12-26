package Task.Nov.polymorphism.methodoverloadingpac;

class mathoverloading {

    void addition() {
        System.out.println("Addition");
    }

    int addition(int a, int b) {
        int temp = a + b;
        return temp;
    }

    float addition(float a, float b) {
        float temp = a + b;
        return temp;
    }

    double addition(double a, double b) {
        double temp = a + b;
        return temp;
    }

    String addition(String a, String b) {
        String temp = a + b;
        return temp;
    }
}
