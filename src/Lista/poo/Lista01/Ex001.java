package Lista.poo.Lista01;

public class Ex001 {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.potenciaLampada = 4;
        lampada.precoLampada = 19.90F;
        lampada.tensaoEletrica = "Bivolt";
        lampada.temperaturaCor = "2700 k";
        lampada.durabilidade = "2400 h";
        lampada.formatoLampada = "Bolinha";
        lampada.tipoLampada = "LED";


        System.out.println(lampada.potenciaLampada);
        System.out.println(lampada.tensaoEletrica);
        System.out.println(lampada.precoLampada);
    }
}
