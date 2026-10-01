void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Add meg mekkora legyen a tömb: ");
    int lengthin = scanner.nextInt();
    System.out.println("Add meg mekkora legyen a tömb: ");
    int lengthin2 = scanner.nextInt();

    int[][] arr = new int[lengthin][lengthin2];

    for (int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr.length; j++){
            System.out.println("Add meg a tömb elemeit: ");
            arr[i][j] = scanner.nextInt();
        }
    }

    for (int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr.length; j++) {
            System.out.println(arr[i][j]);
        }
    }
}
