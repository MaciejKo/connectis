public class Main {
    public static void main(String[] args) {
        int [] integers = new int [] {1,2,3,4,5,6,7,8,9,10};
        int suma = 0;//suma l. w tablicy
        for(int i=0; i<integers.length; i++){
            suma = suma + integers[i];
        }
        System.out.println(suma);
        System.out.println((double)suma/integers.length);

    }

}
