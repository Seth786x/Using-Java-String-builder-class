public class Meow {
    public static void main(String[] args) {
        char[] mmeow = {'m', 'e', 'o', 'w'};
        
        for (int i = 0; i < mmeow.length; i++) {
            StringBuilder x = new StringBuilder();
            if (i < mmeow.length - 1) {
                x.append(mmeow[i]).append(mmeow[i + 1]);
            } else {
                x.append(mmeow[i]);
            }
            System.out.println(x);
        }
    }
}
