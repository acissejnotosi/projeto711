
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utfpr.dainf.if62c.pratica.Jogador;
import utfpr.dainf.if62c.pratica.JogadorComparator;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 * Template de projeto de programa Java usando Maven.
 *
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Projeto71 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Jogador> time = new ArrayList<>();
        Integer numero = 0, num=0;
        boolean laco;
        Jogador pesquisa;
        String nome=null, res=null;

        laco = true;
        while (laco) {
            System.out.println("numero de jogadores:");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                laco = false;
            } else {
                System.out.println("Precisa digitar o numero de jogadores:(!)");
            }
        }

        laco = true;
        for (int i = 0; i < numero; i++) {
            while (laco) {
                System.out.println("Digite o numero para o jogador" + (i + 1) + ":");
                if (sc.hasNextInt()) {
                    num = sc.nextInt();
                    laco = false;
                } else {
                    System.out.println("Digite o numero!");
                }
            }
            laco = true;
            while (laco) {
                System.out.println("Digite o nome para o jgador" + (i + 1) + ":");
                if (sc.hasNext()) {
                    nome = sc.next();
                    laco = false;
                } else {
                    System.out.println("Digite o nome!");
                }

            }
            if (nome != null && num > 0) {
                time.add(new Jogador(nome, num));
                System.out.println("O jogador" + (i+1)+ " " + nome + " " + num + " foi criado");
            }
            laco=true;

        }
        

        for (Jogador j : time) {
            System.out.println(j);
        }
        System.out.println();
        Collections.sort(time, new JogadorComparator(true, false));

        for (Jogador j : time) {
            System.out.println(j);
        }
        
        System.out.println("Deseja inserir mais jogadores?");
        if(sc.hasNext())
            res = sc.next();
        
        if("sim".equals(res)){
        laco = true;
        while (laco) {
            System.out.println("numero de jogadores:");
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                laco = false;
            } else {
                System.out.println("Precisa digitar o numero de jogadores:(!)");
            }
        }
        }
        
        laco = true;
        while(num!=0) {
                System.out.println("Digite o numero para o jogador:");
                if (sc.hasNextInt()) {
                    num = sc.nextInt();
                } 
               
            
            laco = true;
            while (laco) {
                System.out.println("Digite o nome para o jgador:");
                if (sc.hasNext()) {
                    nome = sc.next();
                    laco = false;
                } else {
                    System.out.println("Digite o nome!");
                }

            }
            if (nome != null && num > 0 && time.get(Collections.binarySearch(time, new Jogador(nome, numero), new JogadorComparator(true, false)))) {
                time.add(new Jogador(nome, num));
                System.out.println("O jogador" + (i+1)+ " " + nome + " " + num + " foi criado");
            }
            laco=true;

        }

      
    }

}
