public class Main {
  public static void main(String[] args) {
    Circulo circulo = new Circulo();
    Esfera esfera = new Esfera();

    circulo.raio = 3.0;
    esfera.raio = 5.0;

    System.out.println("Área do círculo: "+circulo.calcularArea());
    System.out.println("Volume da esfera: "+esfera.calcularVolume());
  }
}
