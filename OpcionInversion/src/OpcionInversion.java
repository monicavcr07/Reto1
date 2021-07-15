public class OpcionInversion {
    // Atributos
    double iCompuesto = 0;
    double iSimple = 0;
    double diferencia = 0;

    //metodo interes compuesto
    public void interesCompuesto(int pTiempo, double pCapital, double pTasaInteres) {
        double iCompuesto = (1 + (pTasaInteres / 100));
        iCompuesto = pCapital * ((Math.pow(iCompuesto,pTiempo)) - 1);
        this.iCompuesto = iCompuesto;
    }

      //metodo interes simple
    public void interesSimple(int pTiempo, double pCapital, double pTasaInteres) {
        double iSimple = pCapital * (pTasaInteres / 100) * pTiempo;
        this.iSimple = iSimple;
    }

      //Metodos comparar ganancias
    public void compararGanancia () {
        this.diferencia = this.iCompuesto - this.iSimple;
    }

}
