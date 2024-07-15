import java.util.*;

public class Traductor {
  public static void main(String[] args) {
    Traductor traductor = new Traductor();
    traductor.palabrasAleatorias();
  }

  public void palabrasAleatorias(){

    System.out.println("Bienvenid@ a su traductor de confianza");
    System.out.println("---------------------------------------");

    Scanner scanner = new Scanner(System.in);

    Map<String, String> traductor = new HashMap<>();

    traductor.put("Casa", "House");
    traductor.put("Gato", "Cat");
    traductor.put("Perro", "Dog");
    traductor.put("Libro", "Book");
    traductor.put("Manzana", "Apple");
    traductor.put("Sol", "Sun");
    traductor.put("Luna", "Moon");
    traductor.put("Estrella", "Star");
    traductor.put("Agua", "Water");
    traductor.put("Fuego", "Fire");
    traductor.put("Tierra", "Earth");
    traductor.put("Viento", "Wind");
    traductor.put("Cielo", "Sky");
    traductor.put("Arbol", "Tree");
    traductor.put("Flor", "Flower");
    traductor.put("Niño", "Child");
    traductor.put("Amigo", "Friend");
    traductor.put("Escuela", "School");
    traductor.put("Trabajo", "Job");
    traductor.put("Familia", "Family");

    Random aleatorio = new Random();
    ArrayList<String> palabras = new ArrayList<>(traductor.keySet());
    ArrayList<String> palabrasElegidas = new ArrayList<>();
    Map<String, String> respuestas = new HashMap<>();

    for (int i = 0; i < 5; i++) {
      palabrasElegidas.add(palabras.get(aleatorio.nextInt(palabras.size())));
    }

    for (String palabra : palabrasElegidas){
      System.out.println("Escriba en ingles la siguiente palabra: " + palabra);
      String palabraIngles = scanner.nextLine();
      
      if (traductor.containsValue(palabraIngles.toLowerCase())){
        respuestas.put(palabra, traductor.get(palabra));
      }
    }
    
    System.out.println("Tus respuestas correctas fueron: ");
    respuestas.forEach((palabraEsp, palabraIng) -> System.out.println(palabraEsp + " : " + palabraIng));

    scanner.close();
  }
}