public class Caja {

    String numero;
    String empresa;
    String contenido;

    public Caja() {
    }

    public Caja(String numero, String empresa, String contenido) {
        this.numero = numero;
        this.empresa = empresa;
        this.contenido = contenido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return  "Numero = " + numero +
                "\nEmpresa = " + empresa +
                "\nContenido = " + contenido;
    }
}
