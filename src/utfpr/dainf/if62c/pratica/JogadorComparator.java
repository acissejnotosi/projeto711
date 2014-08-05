/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.dainf.if62c.pratica;

import java.util.Comparator;

/**
 *
 * @author jessica
 */
public class JogadorComparator implements Comparator<Jogador> {

    private final boolean pesAlf, pesCres;

    public JogadorComparator() {
        pesAlf = false;
        pesCres = true;
    }

    public JogadorComparator(boolean pesAlf, boolean pesCres) {
        this.pesAlf = pesAlf;
        this.pesCres = pesCres;
    }

    @Override
    public int compare(Jogador o1, Jogador o2) {
       if(pesAlf)
            return (pesCres?1:-1)*compareNome(o1,o2);
        return (pesCres?1:-1)*compareNum(o1,o2);
    }

    
    public int compareNum(Jogador o1, Jogador o2)
    {
        if(o1.getNumero()==o2.getNumero())
        {
           int tam=o1.nome.length();
           
           if(tam>o2.nome.length())
               tam=o2.nome.length();
           
           for(int i=0;i<tam;i++)
           {
               if(o1.nome.charAt(i)>o2.nome.charAt(i))
               {
                   return 1;
               }if(o1.nome.charAt(i)<o2.nome.charAt(i))
               {
                   return -1;
               }
           }
           if(o1.nome.length()>o2.nome.length())
           {
               return 1;
           }
           if(o1.nome.length()<o2.nome.length())
           {
               return -1;
           }
           
           return 0;
        }
        return o1.getNumero()-o2.getNumero();
    }
    
    public int compareNome(Jogador o1, Jogador o2)
    {
         int tam=o1.nome.length();
           
           if(tam>o2.nome.length())
               tam=o2.nome.length();
           
           for(int i=0;i<tam;i++)
           {
               if(o1.nome.charAt(i)>o2.nome.charAt(i))
               {
                   return 1;
               }if(o1.nome.charAt(i)<o2.nome.charAt(i))
               {
                   return -1;
               }
           }
           if(o1.nome.length()>o2.nome.length())
           {
               return 1;
           }
           if(o1.nome.length()<o2.nome.length())
           {
               return -1;
           }
           
           if(o1.getNumero() != o2.getNumero())
           {
               return o1.getNumero()-o2.getNumero();
           }
            return 0;
    }
}
