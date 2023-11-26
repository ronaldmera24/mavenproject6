public class Edificio implements ImpactoEcologico {
    private double consumoEnergia;
    private double emisionesMateriales;
    private double residuosGenerados;
    private boolean esEficienteEnergeticamente;

    public Edificio(double consumoEnergia, double emisionesMateriales, double residuosGenerados, boolean esEficienteEnergeticamente) {
        this.consumoEnergia = consumoEnergia;
        this.emisionesMateriales = emisionesMateriales;
        this.residuosGenerados = residuosGenerados;
        this.esEficienteEnergeticamente = esEficienteEnergeticamente;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public double getEmisionesMateriales() {
        return emisionesMateriales;
    }

    public double getResiduosGenerados() {
        return residuosGenerados;
    }

    public boolean isEsEficienteEnergeticamente() {
        return esEficienteEnergeticamente;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double factorEficiencia = esEficienteEnergeticamente ? 0.75 : 1;
        return (consumoEnergia + emisionesMateriales + residuosGenerados) * factorEficiencia;
    }
}
