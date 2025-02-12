import java.util.Scanner;

public class conteggio_numeri
{
    
    public static void main(String[] args) {
        
        System.out.println("scrivi un numero");
        Scanner input_1 = new Scanner(System.in);
        int  numero = input_1.nextInt();
        
        System.out.println(numero+" "+scritta(numero));

        }
        public static String scritta(int numero){

            String scritta_3= "";
            if(numero%2==0){

                for(int i = 0; i < numero; i++){
                   scritta_3+="*";
                }
                return scritta_3;
            }
            else{
                for(int i = 0; i < numero; i++){
                   scritta_3+="#";
                }
               return scritta_3+="#";

            }
                
}}