public class Auto implements ImpactoEcologico {
    private double kilometrosRecorridos;
    private double emisionesPorKilometro;
    private boolean esElectrico;

    public Auto(double kilometrosRecorridos, double emisionesPorKilometro, boolean esElectrico) {
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.emisionesPorKilometro = emisionesPorKilometro;
        this.esElectrico = esElectrico;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public double getEmisionesPorKilometro() {
        return emisionesPorKilometro;
    }

    public boolean isEsElectrico() {
        return esElectrico;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double factorEmision = esElectrico ? 0.5 : 1;
        return kilometrosRecorridos * emisionesPorKilometro * factorEmision;
    }
}
