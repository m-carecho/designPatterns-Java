package Strategy;

public class Robo {
    private Comportamento comportamento;

    void setComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }
}
