import java.util.Scanner;

import java.util.*;
public class Practica7{
    public static void main(String[] args) {
        Platillo platillo = new Platillo();
        Cocinatron cocinatron = new Cocinatron();
        MagnumOpus magnumOpus = new MagnumOpus();
        Picatron picatron = new Picatron();
        int srobot, hacer;
        
        Scanner sc = new Scanner (System.in);
        do{
            if(platillo.picado == true && platillo.cocido == false)System.out.println("Picado->");
            if(platillo.picado == true && platillo.cocido == true)System.out.println("Picado->Cocido->");
            System.out.println("Seleccione un robot\n1)Magnum Opus\n2)Picatron\n3)Cocinatron");
            srobot = sc.nextInt();
            System.out.println("Seleccione una accion\n1)Picar\n2)Cocer\n3)Servir");
            hacer = sc.nextInt();
            
            if(srobot == 1){
                if(hacer == 1){
                    magnumOpus.Picar(platillo);
                }
                if(hacer == 2){
                    magnumOpus.Cocinar(platillo);
                }
                if(hacer == 3){
                    magnumOpus.Servir(platillo);
                }

            }
            if(srobot == 2){
                if(hacer == 1){
                    picatron.Picar(platillo);
                }
                if(hacer == 2){
                    picatron.Cocinar(platillo);
                }
                if(hacer == 3){
                    picatron.Servir(platillo);
                }
                
            }
            if(srobot == 3){
                if(hacer == 1){
                    cocinatron.Picar(platillo);
                }
                if(hacer == 2){
                    cocinatron.Cocinar(platillo);
                }
                if(hacer == 3){
                    cocinatron.Servir(platillo);
                }
                
            }
          

        }while(platillo.cocido == false || platillo.picado == false || platillo.servido == false );
    }

}
class Platillo{
    boolean picado;
    boolean cocido;
    boolean servido;
    public Platillo(){
        this.picado = false;
        this.cocido = false;
        this.servido = false;
    }

}
interface Preparar{
    public void Picar();
    public void Cocinar();
    public void Servir();

}
abstract class Robot {
    public Robot(){

    }
    public void Picar(Platillo platillo){

    }
    public void Cocinar(Platillo platillo){

    }
    public void Servir(Platillo platillo){

    }

}
class MagnumOpus extends Robot{
    public MagnumOpus(){

    }
    public void Picar(Platillo platillo){
        System.out.println("Magnum Opus dice: No puedo picar, para eso tengo chalanes");
    }
    public void Cocinar(Platillo platillo){
        System.out.println("Magnum Opus dice: No puedo picar, para eso tengo chalanes");

    }
    public void Servir(Platillo platillo){
        
        if(platillo.picado == true && platillo.cocido == true){
            platillo.servido=true;
            System.out.println("El platillo esta servido!, y ostia tio se ve de rechupetes!");
        }else{
            System.out.println("Al platillo le falta picar los ingredientes o cocinarse");
        }
    }


}
class Picatron extends Robot {
    public Picatron(){

    }
    public void Picar(Platillo platillo){
        if(platillo.picado == true){
            System.out.println("Los ingrediemtes ya estan picados"); 
        }else{
            platillo.picado = true;
            System.out.println("Picatron dice: He picado los ingredientes satisfactoriamente");
        }
        
    }
    public void Cocinar(Platillo platillo){
        System.out.println("Picatron dice: No puedo cocinar toy chiquito");

    }
    public void Servir(Platillo platillo){
        System.out.println("Picatron dice: No puedo  servir toy chiquito");
    }
}
class Cocinatron extends Robot{
    public Cocinatron(){

    }
    public void Picar(Platillo platillo){
        System.out.println("Cocinatron dice: No puedo picar toy chiquito");
    }
    public void Cocinar(Platillo platillo){
        if(platillo.cocido == true){
            System.out.println("El platido ya esta cocido");
        }else if(platillo.picado == true){
            platillo.cocido = true;
            System.out.println("El clatillo esta cocido");

        }  
        
    }
    public void Servir(Platillo platillo){
        System.out.println("Cocinatron dice: No puedo  servir toy chiquito");
    }

}
