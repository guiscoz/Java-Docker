import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Float total = 0f;
        System.out.println("Digite a quantidade de notas da sua lista: ");
        try {
            Integer quantidade = scanner.nextInt();
            List<Float> notas = new ArrayList<>();

            for(int n = 1; n <= quantidade; n++) {
                while(true) {
                    try {
                        System.out.println("Digite a " + n + "ª nota: ");
                        Float nota = scanner.nextFloat();
                        if(nota > 10 || nota < 0) {
                            throw new InputMismatchException();
                        }
                        total += nota;
                        notas.add(nota);
                        break;
                    } catch(InputMismatchException ex) {
                        System.out.printf("Você precisa digitar um valor válido para a %dª nota\n", n);
                        scanner.next(); 
                    }
                }
            }

            String resultado = "As notas digitadas são: ";
            for(Float nota:notas) {
                resultado +=  nota.toString() + " ";
            }

            resultado += "\nA média é " + (total/quantidade);
            System.out.println(resultado);
        } catch(InputMismatchException ex) {
            scanner.next(); 
            System.out.println("Você precisa digitar um número inteiro para a quantidade de provas.");
        }
        
        scanner.close();
    }
}
