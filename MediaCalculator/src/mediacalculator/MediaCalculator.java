/**
 *
 * @author 082170010
 */
package mediacalculator;
import java.util.Scanner;
/**
 *
 * @author 082170010
 */
public class MediaCalculator {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int nota1, nota2, nota3;
        int media;
        String nome;        
        
        Aluno a = new Aluno();
        
        
        System.out.print("Aluno: ");
        nome = ent.next();
        a.setNome(nome);        
            
        System.out.print(nome + ", digite sua 1ª nota: ");
        nota1 = ent.nextInt();

        System.out.print(nome + ", digite sua 2ª nota: ");
        nota2 = ent.nextInt();

        System.out.print(nome + ", digite sua 3ª nota: ");
        nota3 = ent.nextInt();

        // calcula a média
        media = calcularMedia(nota1, nota2, nota3);
        
        a.setNota(media);
        
        System.out.println("A média do(a) aluno(a) " + a.getNome() + " é " + a.getNota());
        // mostra a nota do aluno
        retornaNota(media);
    }
    
    public static int calcularMedia(int n1, int n2, int n3) {
        int media = (n1 + n2 + n3)/3;
        return media;
    } 
    
    public static void retornaNota(int media){
        if( (media >= 0) && (media <4) ){
            System.out.println("Nota E");
        } else if(media < 5){
            System.out.println("Nota D");
        } else if(media < 7){
            System.out.println("Nota C");
        } else if(media < 8){
            System.out.println("Nota B");
        } else if(media <= 10){
            System.out.println("Nota A");
        }
    }
    
    
    
}


