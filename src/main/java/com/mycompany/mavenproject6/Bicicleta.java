public class Bicicleta implements ImpactoEcologico {
    private boolean esElectrica;
    private double emisionesFabricacion;
    private double consumoEnergetico;

    public Bicicleta(boolean esElectrica, double emisionesFabricacion, double consumoEnergetico) {
        this.esElectrica = esElectrica;
        this.emisionesFabricacion = emisionesFabricacion;
        this.consumoEnergetico = consumoEnergetico;
    }

    public boolean isEsElectrica() {
        return esElectrica;
    }

    public double getEmisionesFabricacion() {
        return emisionesFabricacion;
    }

    public double getConsumoEnergetico() {
        return consumoEnergetico;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double factorEmision = esElectrica ? consumoEnergetico : 0;
        return emisionesFabricacion + factorEmision;
    }
}
