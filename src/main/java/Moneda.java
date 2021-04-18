import java.util.Random;
public class Moneda {
    private boolean valor;

    public Moneda(boolean valor)
    {
        this.valor=valor;
    }
    public Moneda()
    {
        valor=false;
    }

    public boolean getValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }
    public void lanzarMoneda(){
        int i;
        Random rnd=new Random();
        i= rnd.nextInt(100);
        if(i%2==0) this.valor=true;
        else this.valor=false;
    }
    public String toString(){
        return "True=Cara\nFalse=Cruz\nValor="+valor;
    }
}
