package Lista.poo.Lista02;

public class Lampada {

   public boolean lampada;

   public void ligarLampada(){
       lampada = true;
   }

   public void desligarLampada(){
       lampada = false;
   }

   public void statusLampada(){
       if (lampada){
           System.out.println("Lampada esta ligada!");
       }else {
           System.out.println("Lampada esta desligada!");
       }
   }

   public void alterarStatus(){
       if (lampada){
           desligarLampada();
       }else {
           ligarLampada();
       }
   }
}
