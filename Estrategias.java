public final class Estrategias {
    public static final double VALOR_JORNAL = 18.50;
    
    public static EstrategiaCosto costoDirecto() {
        return lote -> lote.costoInsumos();
    }
    
    public static EstrategiaCosto costoConManoDeObra() {
        return lote -> lote.costoInsumos()
            + lote.jornalesPorHectarea() * lote.hectareas() * VALOR_JORNAL;
    }
}
