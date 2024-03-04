package asignaciondinamica;

public class AccionDividirBloque implements IAccion{
    IMemoria memoria;
    @Override
    public void ejecutar(Bloque bloque) {
        memoria.dividirBloque(bloque, 10);
    }
}
