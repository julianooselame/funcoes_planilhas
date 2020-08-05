package senai;

import javax.swing.*;
import java.util.ArrayList;

public class funcoesPlanilha {

    static ArrayList<Double> valores = new ArrayList<Double>();


    public static void main(String[] args) {

        int opcao = -1;
        double novoValor = 0.0;

        StringBuffer menu = new StringBuffer();
        menu.append("1 para para incluir Valores");
        menu.append("\n");
        menu.append("2 para Somar");
        menu.append("\n");
        menu.append("3 para Mostrar o Mínimo");
        menu.append("\n");
        menu.append("4 para Mostrar o Máximo");
        menu.append("\n");
        menu.append("5 para Mostrar a Média");
        menu.append("\n");
        menu.append("0 para Sair");
        menu.append("\n");

        while (opcao != 0) {

            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {

                case 1: //INCLUIR VALOR NA LISTA

                    novoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para incluir na Lista:"));

                    valores.add(novoValor);

                    JOptionPane.showMessageDialog(null, "Valor incluído com sucesso!!");

                    System.out.println(valores);

                    break;

                case 2: //SOMAR

                    double soma = 0.0;

                    for (int i = 0; i < valores.size();i++){
                    soma = soma + valores.get(i); }

                    System.out.println(soma);


                    break;

                case 3: //MINIMO

                    double min = valores.get(0);
                    double max = valores.get(0);

                    double minIndex = 0, maxIndex = 0;

                    for(int i = 1; i < valores.size(); i++ ){

                        if( valores.get(i) < min ){
                            min = valores.get(i);
                            minIndex = i;
                        }

                    }

                    System.out.println("O Valor Minimo é: " + min);

                    break;

                case 4: //MAXIMO

                    double min2 = valores.get(0);
                    double max2 = valores.get(0);

                    double minIndex2 = 0, maxIndex2 = 0;

                    for(int i = 1; i < valores.size(); i++ ){

                        if( valores.get(i) > max2 ){
                            max2 =valores.get(i);
                            maxIndex2 = i;
                        }

                    }

                    System.out.println("O Valor Máximo é " + max2);


                    break;

                case 5: //MEDIA
                    double soma2 = 0.0;
                    double media = 0.0;

                    for (int i = 0; i < valores.size();i++){
                        soma2 = soma2 + valores.get(i); }

                    media = soma2 / valores.size();

                    System.out.println(media);

                    break;


                case 0: //SAIR

                    JOptionPane.showMessageDialog(null, "Fechando o Programa...");

                    break;




            }
        }

        //public static String listarValores () {
           // StringBuffer lista = new StringBuffer();
            //lista.append("Lista de Produtos");
            //lista.append("\n");
            //lista.append("========================");
            //lista.append("\n");
            //for (int i = 0; i < valores.size(); i++) {
              //  lista.append("Lista de Valores: " + valores.get(i));
                //lista.append("\n");
                //lista.append("========================");
                //lista.append("\n");
            //}
            //return lista.toString();
        //
        // }

    }


}
