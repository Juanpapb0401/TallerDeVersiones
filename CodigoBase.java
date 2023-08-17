import java.util.Scanner;


public class Main {

    private Scanner reader;

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
        
    }

    private void menu(){

        System.out.println("Welcome");
        System.out.println("******************************************************************");

        boolean flag=false;

        while (!flag){


            System.out.println("1. Multi");
            System.out.println("2. Suma");
            System.out.println("3. Divi");
            System.out.println("4. Resta");
            System.out.println("5. Salir");


            int optionMenu = reader.nextInt();


            switch (optionMenu){
                case 1:
<<<<<<< HEAD
                   multiplicacion();
=======
                   
>>>>>>> origin/feature#3
                    break;
                case 2:
                    
                    break;
                case 3:
<<<<<<< HEAD
                    break;
                case 4:
                    public static int resta(int a, int b) {
                     return a - b;
                }
=======
                    Division(a,b);
                    break;
                case 4:
                    
>>>>>>> origin/feature#3
                    break;
                case 5:
                    flag= true;
                    break;



            }

        }
    }

<<<<<<< HEAD
    private int multiplicacion(){
        return 2*5;
=======
    public double Division(int a, int b) {
        if (b == 0) {
            b = 1;
        }
        return a/b;
>>>>>>> origin/feature#3
    }
    
}
