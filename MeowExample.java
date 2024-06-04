public class MeowExample {
    public static void main(String[] args) {
        char[] Meow = {'M', 'e', 'o', 'w'};
        printAdjacentCharacters(Meow);
    }

    public static void printAdjacentCharacters(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.println(array[i] + "" + array[i + 1]);
            } else {
                System.out.println(array[i]);
            }
        }
    }
}

