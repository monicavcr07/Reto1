public class App {
    public static void main(String[] args) throws Exception {

        OpcionInversion alternativa1 = new OpcionInversion();

        alternativa1.interesCompuesto(12,1900000,4.7);
        alternativa1.interesSimple(12,1900000,4.7);
        alternativa1.compararGanancia();

        System.out.println("Bienvenido a su sistema de Calculo de Interes");
        System.out.println("Interes Compuesto: " + alternativa1.iCompuesto + "\nInteres Simple: " + alternativa1.iSimple + "\nDiferencial: " + alternativa1.diferencia);
        
    }
}
