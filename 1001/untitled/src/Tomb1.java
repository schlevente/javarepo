void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Add meg mekkora legyen a tömb: ");
    int lengthin = scanner.nextInt();
    int[] arr = new int[lengthin];

    for (int i = 0; i < lengthin; i++){
        System.out.println("Add meg a tömb elemeit: ");
        int beszam = scanner.nextInt();
        arr[i] = beszam;
    }

    for (int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
    }
}
