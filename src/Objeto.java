public abstract class Objeto {
    protected char direccion ;
    protected int posX;
    protected int posY;

    public abstract void cambiarPosicion(int x, int y, char direccion);

    public abstract void irA(int x, int y, char direccion);


    public Objeto(char direccion, int posX, int posY) {
        this.direccion = direccion;
        this.posX = posX;
        this.posY = posY;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }


    public int getPosX() {
        return posX;
    }


    public void setPosX(int posX) {
        this.posX = posX;
    }


    public int getPosY() {
        return posY;
    }


    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public String toString() {
        return "Objeto{" +
                "direccion=" + direccion +
                ", posX=" + posX +
                ", posY=" + posY +
                '}';
    }




}
