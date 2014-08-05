/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.dainf.if62c.pratica;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 *
 * @author jessica
 */
public class Jogador implements Comparable<Jogador> {

    Integer numero;
    String nome;
   public Jogador(String nome, int numero)
   {
       this.nome=nome;
       this.numero=numero;
       
   }
   public int getNumero()
   {
       return this.numero;
   }
   public String getNome()
   {
       return this.nome;
   }
    @Override
   public String toString()
   {
       return numero + " - " + nome;
   }
   @Override
    public int compareTo(Jogador o) {
         int tam=nome.length();
           
           if(tam>o.nome.length())
               tam=o.nome.length();
           
           for(int i=0;i<tam;i++)
           {
               if(nome.charAt(i)>o.nome.charAt(i))
               {
                   return 1;
               }if(nome.charAt(i)<o.nome.charAt(i))
               {
                   return -1;
               }
           }
           if(nome.length()>o.nome.length())
           {
               return 1;
           }
           if(nome.length()<o.nome.length())
           {
               return -1;
           }
           
           if(getNumero() != o.getNumero())
           {
               return getNumero()-o.getNumero();
           }
            return 0;
    }
    
    
}
