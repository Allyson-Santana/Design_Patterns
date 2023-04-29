public class Fila
{
    private static Fila instancia = null;

    private Fila() {}
    
    public void ImprimeDocumeto() {}
    public void RemoveDocumento() {}
    public void RemoveTodosDocumentos() {}  

    public static Fila getInstance() {
        if(instancia  == null) {
            instancia = new Fila();
        }
        return instancia;
    }

}
