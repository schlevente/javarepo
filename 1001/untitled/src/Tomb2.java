void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Add meg mekkora legyen a tömb: ");
    int lengthin = scanner.nextInt();
    double[] arr = new double[lengthin];

    for (int i = 0; i < lengthin; i++){
        System.out.println("Add meg a tömb elemeit: ");
        double beszam = scanner.nextDouble();
        arr[i] = beszam;
    }

    for (int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
    }
}
