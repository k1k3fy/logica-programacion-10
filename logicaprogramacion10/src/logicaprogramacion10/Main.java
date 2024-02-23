package logicaprogramacion10;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String, String> diccionario = new HashMap<>();
	        diccionario.put("casa", "house");
	        diccionario.put("perro", "dog");
	        diccionario.put("gato", "cat");
	        diccionario.put("árbol", "tree");
	        diccionario.put("coche", "car");
	        diccionario.put("libro", "book");
	        diccionario.put("computadora", "computer");
	        diccionario.put("escuela", "school");
	        diccionario.put("sol", "sun");
	        diccionario.put("luna", "moon");
	        diccionario.put("agua", "water");
	        diccionario.put("cielo", "sky");
	        diccionario.put("manzana", "apple");
	        diccionario.put("naranja", "orange");
	        diccionario.put("mesa", "table");
	        diccionario.put("silla", "chair");
	        diccionario.put("televisión", "television");
	        diccionario.put("teléfono", "phone");
	        diccionario.put("playa", "beach");

	        String[] palabrasEspañol = seleccionarPalabras(diccionario);

	        int respuestasCorrectas = 0;
	        int respuestasIncorrectas = 0;
	        Scanner scanner = new Scanner(System.in);
	        for (String palabraEspañol : palabrasEspañol) {
	            System.out.print("Traduce la palabra \"" + palabraEspañol + "\": ");
	            String traduccionUsuario = scanner.nextLine();
	            String traduccionCorrecta = diccionario.get(palabraEspañol);
	            if (traduccionUsuario.equalsIgnoreCase(traduccionCorrecta)) {
	                System.out.println("¡Correcto!");
	                respuestasCorrectas++;
	            } else {
	                System.out.println("Incorrecto. La traducción correcta es: " + traduccionCorrecta);
	                respuestasIncorrectas++;
	            }
	        }

	       
	        System.out.println("Respuestas correctas: " + respuestasCorrectas);
	        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
	    }

	    public static String[] seleccionarPalabras(Map<String, String> diccionario) {
	        String[] palabrasEspañol = new String[5];
	        Random random = new Random();
	        Object[] palabras = diccionario.keySet().toArray();
	        for (int i = 0; i < 5; i++) {
	            palabrasEspañol[i] = (String) palabras[random.nextInt(palabras.length)];
	        }
	        return palabrasEspañol;
	    }
	}


