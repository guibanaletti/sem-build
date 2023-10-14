package br.com.dio.collection.list;

import java.util.*;

public class CoresArcoiris {

    /*
    Crie uma conjunto contendo as cores do arco-íris e:
    a) Exiba todas as cores o arco-íris uma abaixo da outra;
    b) A quantidade de cores que o arco-íris tem;
    c) Exiba as cores em ordem alfabética;
    d) Exiba as cores na ordem inversa da que foi informada;
    e) Exiba todas as cores que começam com a letra ”v”;
    f) Remova todas as cores que não começam com a letra “v”;
    g) Limpe o conjunto;
    h) Confira se o conjunto está vazio;
    */
    private String cor;


    public static void main (String[] args){
        Set<String> coresArcoiris = new HashSet<>();
        coresArcoiris.add("vermelho");
        coresArcoiris.add("laranja");
        coresArcoiris.add("amarelo");
        coresArcoiris.add("verde");
        coresArcoiris.add("azul");
        coresArcoiris.add("anil");
        coresArcoiris.add("violeta");

        System.out.println("a) Exiba todas as cores o arco-íris uma abaixo da outra:");
        for (String cor : coresArcoiris){
            System.out.println(cor);
        }

        System.out.println("b) A quantidade de cores que o arco-íris tem: " + coresArcoiris.size());

        System.out.println("c) Exiba as cores em ordem alfabética:");
        Set<String> coresArcoiris2 = new TreeSet<>(coresArcoiris);
        System.out.println(coresArcoiris2);

        System.out.println("d) Exiba as cores na ordem inversa da que foi informada:");
        Set<String> coresArcoiris3 = new LinkedHashSet<>(Arrays.asList("amarelo", "anil", "azul", "laranja", "verde", "vermelho", "violeta"));
        System.out.println("Ordem normal: " + coresArcoiris3);
        List<String> coresArcoirisLista = new ArrayList<>(coresArcoiris3);
        Collections.reverse(coresArcoirisLista);
        System.out.println("Ordem Inversa: " + coresArcoirisLista);

        System.out.println("e) Exiba todas as cores que começam com a letra ”v”:");
        for (String cor : coresArcoiris){
            if (cor.startsWith("v"))
                System.out.println(cor);
        }

        System.out.println("f) Remova todas as cores que não começam com a letra “v”");
//        coresArcoiris.removeIf(cor -> cor.startsWith("v"));
        Iterator<String> iterator = coresArcoiris.iterator();
        while (iterator.hasNext())
            if (iterator.next().startsWith("v")) iterator.remove();
        System.out.println("As cores que sobraram foram: " + coresArcoiris);

        System.out.println("g) Limpe o conjunto:");
        coresArcoiris.clear();

        System.out.println("h) Confira se o conjunto está vazio:");
        System.out.println("Conjunto atual: " + coresArcoiris);




    }
}
