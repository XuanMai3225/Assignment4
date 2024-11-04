package assignment4;

public class Findprimenumbers {
    public static void main(String[] args) {
        System.out.println("The prime numbers from 1 to 100: ");
        for(int i = 2; i <= 100; i++){
            if(Prime(i)){
                System.out.print(i + " ");
            }
        }
    }
    //Hàm kiểm tra số nguyên tố
    public static boolean Prime(int n){     //Nếu n <= 1 ko phải SNT
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
