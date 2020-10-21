import java.util.*;
public class Practica4 {

    public static void main(String[] args) {
        Pajaro[] pajaritos = new Pajaro[3]; 
        Regular rojo = new Regular("Andrez", 1F, 1F);
        Bombardero negro = new Bombardero("Lara",3F,0.5F);
        Boomerang verde = new Boomerang("Yampa", 2F, 1.5F);
        System.out.println("Se usa solo las sub clases"); 
        pajaritos[0]=rojo;
        pajaritos[1]=negro;
        pajaritos[2]=verde;
        rojo.golpearfuerte();
        negro.tirarbombas();
        verde.efectoboomerang();
        System.out.println("Se usan solo los metodos de la clase padre"); 
        for(Pajaro pajarraco : pajaritos){
            pajarraco.lanzado(2.6F);
            pajarraco.volar();
            pajarraco.colicion();

        }

        
    }
    public static class Pajaro{
        String nombre;
        float peso;
        float velocidad;
        float fuerza;
    
        public Pajaro(String nombre, float peso, float velocidad){
            this.nombre = nombre;
            this.peso = peso;
            this.velocidad= velocidad;
            this.fuerza= peso * velocidad;
        }
        public void lanzado(float fuerzadelanzamiento){
            System.out.println("Me lanzaron con esta fuerza:" + fuerzadelanzamiento); 
        }
        public void volar(){
            System.out.println("Estoy volando "); 
        }
        public void colicion(){
            
            System.out.println("Me estrelle con esta fuerza:"+ this.fuerza);
        }
    
    }
    public static class Regular extends Pajaro{
        public Regular(String nombre, float peso, float velocidad){
            super (nombre, peso, velocidad);
        }
        public void golpearfuerte(){
            System.out.println("Golpe mi objetivo con fuerza."); 
        }
    }
    public static class Bombardero extends Pajaro{
        public Bombardero(String nombre, float peso, float velocidad){
            super (nombre, peso, velocidad);
    
        }
        public void tirarbombas(){
            System.out.println("Arroje bombas mientra volaba."); 
        }
    }
    public static class Boomerang extends Pajaro{
        public Boomerang(String nombre, float peso, float velocidad){
            super (nombre, peso, velocidad);
    
        }
        public void efectoboomerang(){
            System.out.println("Golpee mi objetivo y hice un efecto boomerang y lo golpe de nuevo"); 
        }
        
    }
}

