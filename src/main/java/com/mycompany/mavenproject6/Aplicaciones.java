import java.util.ArrayList;
public class Aplicaciones {
    public static void main(String[] args) {
        // Crear objetos con valores específicos
        Edificio edificio = new Edificio(500, 300, 100, true);
        Auto auto = new Auto(15000, 0.2, false);
        Bicicleta bicicleta = new Bicicleta(false, 10, 0);

        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();
        objetos.add(edificio);
        objetos.add(auto);
        objetos.add(bicicleta);

        for (ImpactoEcologico objeto : objetos) {
            if (objeto instanceof Edificio) {
                Edificio e = (Edificio) objeto;
                System.out.println("Edificio - Consumo Energía: " + e.getConsumoEnergia() +
                                   ", Emisiones Materiales: " + e.getEmisionesMateriales() +
                                   ", Residuos Generados: " + e.getResiduosGenerados() +
                                   ", Eficiencia Energética: " + e.isEsEficienteEnergeticamente() +
                                   ", Impacto Ecológico: " + e.obtenerImpactoEcologico() + " kg de CO2");
            } else if (objeto instanceof Auto) {
                Auto a = (Auto) objeto;
                System.out.println("Auto - Kilómetros Recorridos: " + a.getKilometrosRecorridos() +
                                   ", Emisiones por Kilómetro: " + a.getEmisionesPorKilometro() +
                                   ", Eléctrico: " + a.isEsElectrico() +
                                   ", Impacto Ecológico: " + a.obtenerImpactoEcologico() + " kg de CO2");
            } else if (objeto instanceof Bicicleta) {
                Bicicleta b = (Bicicleta) objeto;
                System.out.println("Bicicleta - Eléctrica: " + b.isEsElectrica() +
                                   ", Emisiones Fabricación: " + b.getEmisionesFabricacion() +
                                   ", Consumo Energético: " + b.getConsumoEnergetico() +
                                   ", Impacto Ecológico: " + b.obtenerImpactoEcologico() + " kg de CO2");
            }
        }
    }
}

