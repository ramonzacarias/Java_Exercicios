package Lista.poo.Lista02;

public class Ex001 {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligarLampada();
        lampada.statusLampada();

        lampada.desligarLampada();
        lampada.statusLampada();

        lampada.alterarStatus();
        lampada.statusLampada();
    }
}
