import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lote lote = new Lote("L-01", new Banano("Cavendish"), 4.0, List.of(
            new Insumo("Urea", 12, "saco", 32.50),
            new Insumo("Fungicida", 8, "litro", 21.75),
            new Insumo("Semilla", 1, "lote", 180.00)
        ));

        CalculadoraCostos calc = new CalculadoraCostos();
        
        calc.setEstrategia(Estrategias.costoDirecto());
        System.out.println("Costo directo: " + calc.calcular(lote).get());

        calc.setEstrategia(Estrategias.costoConManoDeObra());
        System.out.println("Con mano de obra: " + calc.calcular(lote).get());
    }
}
