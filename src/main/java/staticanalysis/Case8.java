package staticanalysis;

public class Case8 {

    // variáveis com nome pouco claro
    private int numberA, numberB;

    public void initialValue() {
        // variáveis não estão a ser utilizadas
        // mudança de nome das variáveis c e d para a e b
        this.numberA = 0;
        this.numberB = 0;

    }
}
