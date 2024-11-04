package assignment4;

public class Sumofnumbers {
    public static void main(String[] args) {
        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){     //Cộng vào chẵn
                sumEven += i;    
            }else{
                sumOdd += i;   
            }
        }
        System.out.println("Sum of odd numbers from 1 to 100: " +sumOdd);
        System.out.println("Sum of even numbers from 1 to 100: " +sumEven);
    }
}
