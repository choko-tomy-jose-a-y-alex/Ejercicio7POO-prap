interface Auto {
 void año();
}

class Automatico implements Auto {
 public void año() {System.out.println("1941");}
}

abstract class Manual implements Auto {
 abstract String velMax();
  abstract String valor();
}

class Ferrari250 extends Manual {
 public void año() {System.out.println("1964");}
 String velMax() {
     return "280 km/h";   
 }

 String valor(){
    return "35 millones de dólares";
 }
}

class FerrariGTC4Lusso extends Manual {
 public void año() {System.out.println("2016");}
 String velMax() {
     return "335 km/h";
 }

 String valor(){
    return "370 mil dolares";
 }
}

class Ferrari250GTO extends Manual {
 public void año() {System.out.println("1962");}
 String velMax() {
     return "280 km/h";   
 }

 String valor(){
    return "60 millones de dólares";
 }
}

public class Polim {
  static String mensaje="No me alcanza pa' ni uno ;(";
 public static void main(String[] args) {
   final FerrariGTC4Lusso autoNuevo = new  FerrariGTC4Lusso();
   final Ferrari250 autoViejo = new  Ferrari250();
   final Ferrari250GTO autoCaro = new  Ferrari250GTO();
   final Auto[] arr = new  Auto[]{
     new Automatico(),
     autoNuevo,
     autoViejo,
     autoCaro,
     ()->System.out.println("¿Cuanto cuestan?")};
   for (final Auto a: arr) {
     a.año();
   }
   final Manual[] arr2 = new  Manual[]{autoViejo, autoNuevo, autoCaro};
   for (final Manual i: arr2) {
     System.out.println(i.velMax());
     System.out.println(i.valor());
   }

   System.out.println(mensaje);
 }
}
