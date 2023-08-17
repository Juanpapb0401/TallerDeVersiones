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
                   
                    break;
                case 2:
                    
                    break;
                case 3:
                    Division(a,b);
                    break;
                case 4:
                    
                    break;
                case 5:
                    flag= true;
                    break;



            }

        }
    }

    public double Division(int a, int b) {
        if (b == 0) {
            b = 1;
        }
        return a/b;
    }
    
}
