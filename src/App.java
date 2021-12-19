import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner numero = new Scanner(System.in);
        int v1,v2;
		
		System.out.println("Escolha entre 1, 2 e 3, sendo : ");
        System.out.println(" ");
		System.out.println("Pedra = 1 ");
		System.out.println("Papel = 2  ");
		System.out.println("Tesoura = 3");
        System.out.println(" ");
		

        System.out.println("Escolha sua opção:");

        v1 = numero.nextInt();

        switch (v1){
			case 1: 
				System.out.println("Você selecionou PEDRA");
                break;
            case 2: 
				System.out.println("Você selecionou PAPEL");
                break;
            case 3: 
				System.out.println("Você selecionou TESOURA");
			    break;
            case 4:
                System.out.println("Esta opção não existe, escolha outro numero");
                break;

        }

        System.out.println(" ");
        System.out.println("Computador: ");
        
        v2 = (int)(Math.random()*3 + 1);
        numero.close();

        switch (v2){
			case 1: 
				System.out.println("Seleciou PEDRA");
                break;
            case 2: 
				System.out.println("Selecionou PAPEL");
                break;
            case 3: 
				System.out.println("Selecionou TESOURA");
			    break;

        }

        if (v1 == v2){
            System.out.println(" ");
            System.out.println("EMPATE");
         } else {
             
            if (v1 == 1 && v2 == 3) {
                System.out.println(" ");
                System.out.println("Você venceu");
            } else if (v1 == 2 && v2 == 1){
                System.out.println(" ");
                System.out.println("Você venceu");
            } else if (v1 == 3 && v2 == 2){
                System.out.println(" ");
                System.out.println("Você venceu");
            } else {
                System.out.println(" ");
                System.out.println("O computador venceu");
            }
        }
    }
   
}