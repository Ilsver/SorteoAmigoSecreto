

import java.time.LocalDate;
import java.util.Scanner;
public class TareaIntegradora{

    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int option;
        String menu []={
            "Select...",
            "1. Register raffle",
            "2. Register participants",
            "3. Show participants",
            "4. Generate draw",
            "5. Show raffle summary",
            "6. Exit"
        };
        for(int i = 0; i < menu.length; i++){
            System.out.println(menu[i]);
            System.out.println("Ingrese un número del menú: ");
            int menus = lector.nextInt();
            if(menus == 1){
                System.out.println("Hola");
            }
        }
    }
}