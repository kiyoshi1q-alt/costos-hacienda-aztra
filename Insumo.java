public record Insumo(String nombre, double cantidad, String unidad, double precioUnitario) {
    public Insumo {
        if (cantidad < 0 || precioUnitario < 0) {
            throw new IllegalArgumentException("Cantidad y precio deben ser positivos");
        }
    }
    public double costo() {
        return cantidad * precioUnitario;
    }
}
