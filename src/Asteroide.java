import java.util.Objects;

public class Asteroide extends Objeto{
    public Asteroide(char direccion, int posX, int posY) {
        super(direccion, posX, posY);
    }


    @Override
    public void cambiarPosicion(int x, int y, char direccion) {
        setPosX( x );
        setPosY( y );
    }

    @Override
    public void irA(int x, int y, char direccion) {
        System.out.println("voy a chocar una nave");

    }

    public Asteroide(char direccion, int posX, int posY, int lesion) {
        super(direccion, posX, posY);
        this.lesion = lesion;
    }

    private int lesion;

    public int getLesion() {
        return lesion;
    }

    public void setLesion(int lesion) {
        this.lesion = lesion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asteroide asteroide = (Asteroide) o;
        return lesion == asteroide.lesion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lesion);
    }


    @Override
    public String toString() {
        return "Asteroide{" +
                "lesion=" + lesion +
                ", direccion=" + direccion +
                ", posX=" + posX +
                ", posY=" + posY +
                '}';
    }
}
