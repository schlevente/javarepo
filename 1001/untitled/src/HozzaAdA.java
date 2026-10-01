void main() {

    String[] arr = {"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "piranh"};

    for (int i = 0; i < arr.length; i++){
        arr[i] += "a";
    }

    for (int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
    }
}
