package proyectoeddii;
public class Campo {
    public String nombre_campo;
    public String tipo_campo;
    public int longitud_campo;
    public String campo_llave;

    public Campo() {
    }

    public Campo(String nombre_campo, String tipo_campo, int longitud_campo, String campo_llave) {
        this.nombre_campo = nombre_campo;
        this.tipo_campo = tipo_campo;
        this.longitud_campo = longitud_campo;
        this.campo_llave = campo_llave;
    }

    public String getNombre_campo() {
        return nombre_campo;
    }

    public void setNombre_campo(String nombre_campo) {
        this.nombre_campo = nombre_campo;
    }

    public String getTipo_campo() {
        return tipo_campo;
    }

    public void setTipo_campo(String tipo_campo) {
        this.tipo_campo = tipo_campo;
    }

    public int getLongitud_campo() {
        return longitud_campo;
    }

    public void setLongitud_campo(int longitud_campo) {
        this.longitud_campo = longitud_campo;
    }

    public String getCampo_llave() {
        return campo_llave;
    }

    public void setCampo_llave(String campo_llave) {
        this.campo_llave = campo_llave;
    }

    @Override
    public String toString() {
        return nombre_campo + tipo_campo + longitud_campo + campo_llave;
    }
}