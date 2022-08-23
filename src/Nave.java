public class Nave extends Objeto{

    private int vida;

    private double velocidad;

    public Nave(char direccion, int posX, int posY){
        super(direccion,posX,posY);
    }


    public Nave(char direccion, int posX, int posY, int vida, double velocidad) {
        super(direccion, posX, posY);
        this.vida = vida;
        this.velocidad = velocidad;
    }

    //--------------- esto es de la actividad de cambiar posicion ---------------//

    @Override
    public void cambiarPosicion(int x, int y, char direccion){
        System.out.println("cambiar posicion");
        rotar( direccion );
        setPosX(x);
        setPosY(y);
    }

    public void rotar(char direccion){

    }

    public void vidaPerdida(int daño){
        setVida( getVida() - daño);
    }



    @Override
    public void irA(int x, int y, char direccion) {
        System.out.println("la mas rapida de tottee italieee FFIIIUUMMMMM");
    }


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }


    @Override
    public String toString() {
        return "Nave{" +
                "vida=" + vida +
                ", velocidad=" + velocidad +
                ", direccion=" + direccion +
                ", posX=" + posX +
                ", posY=" + posY +
                '}';
    }
}
