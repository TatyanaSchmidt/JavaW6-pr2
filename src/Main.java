public class Main {
    public static void main(String args[]){
        int i = 0;
        while(i++ < 50){
            if (i == 5)
                continue;
            if (i == 25)
                continue;
            System.out.println(i);
            if (i == 49) {
                break;
            }
        }
    }
}
