package br.com.bytebank.banco.test;

public class TesteArrayString {

        public static void main(String[] args) {

                System.out.println("Funcionou!!");

                for(int i = 0; i < args.length; i++) {
                    System.out.println(args[i]);
                }
        }
        
        // transformar um array para uma lista:
        // public class Teste {

        //		public static void main(String[] args) {
        //			List<String> argumentos = Arrays.asList(args);
        //		}
        // }

}