import java.util.*;

public class Practica6 {
    public static void main(String[] args) {
        Zoo.lotullo();

    }
}
class Zoo{
    
    public static void lotullo(){
    Animal[] animalArray = new Animal[5];
    animalArray[0]= new Elefante("Dumbo", "cacahuates",50, true, false, "Macho");
    animalArray[1]= new Leon("Simba","zebra adobada", 6, false, true,"Macho");
    animalArray[2]= new Tigre("Tigger", "sopa du macaco",4,true,true,"macho");
    animalArray[3]= new Jirafa("Candas", "Hojas de manzano", 6,true, true ,"hembra");
    animalArray[4]= new Lobo("Shakira", "wonejo", 53, false, false, "hembra");
    for(Animal a : animalArray){
       
        a.soy();
        a.info();
        a.comer();
        a.dormir();
        a.hablar();
        Veterinarian.Veterinario(a);
        System.out.println("\n");
        }
    }
   
}
class Animal{
    
    String nombre;
    String comida;
    int edad;
    boolean vacunado;
    boolean salud;
    String sexo;
    public void setVacunado() {
        this.vacunado = true;
    }
    public void setSalud(boolean salud) {
        this.salud = salud;
    }
    public boolean getVacunado(){
        return vacunado;
    }
    
    public Animal(String nombre, String comida, int edad, boolean vacunado, boolean salud, String sexo){
        this.nombre = nombre;
        this.comida = comida;
        this.edad = edad;
        this.vacunado = vacunado;
        this.salud = salud;
        this.sexo = sexo;
    }
    public void info(){
        
        System.out.println("Nombre: "+nombre+"\nComida favorita: "+comida);
    }
    public void soy(){
        System.out.println("Soy un animal");
       } 
    public void comer(){
        
        System.out.println("Estoy comiendo");
    }
    public void dormir(){
        System.out.println("Estoy durmiendo");
    }
    public void hablar(){
        System.out.println("Eststoy hablando");
    }
   
    

}

class Elefante extends Animal{
    public Elefante(String nombre, String comida, int edad, boolean vacunado, boolean salud, String sexo){
        super(nombre, comida, edad, vacunado, salud, sexo);
        
    }

   public void soy(){
    System.out.println("Soy un elefante");
   } 
   public void comer(){
       System.out.println("Estoy comindo comida de elfante");
    }
    public void hablar(){
        System.out.println("Estoy barritando!!!!!");
    }
    public void dormir(){
        System.out.println("Estoy durmiendo por la noche");
    }
    
}
class Leon extends Animal{
    
   
    public Leon(String nombre, String comida, int edad, boolean vacunado, boolean salud, String sexo){
        super(nombre, comida, edad, vacunado, salud, sexo);
        
    }
    public void comer(){
        System.out.println("Estoy comindo comida de leon");
     }
     public void hablar(){
         System.out.println("Estoy gruñendo");
     }
     public void dormir(){
         System.out.println("Estoy durmiendo por la noche, por la tarde o por el dia, megusta dormir!!!");
     }
     public void soy(){
        System.out.println("Soy un leon");
       } 

}
class Tigre extends Animal{
    public Tigre(String nombre, String comida, int edad, boolean vacunado, boolean salud, String sexo){
        super(nombre, comida, edad, vacunado, salud, sexo);
       
    }
    public void comer(){
        System.out.println("Estoy comindo comida de tigre");
     }
     public void hablar(){
         System.out.println("Estoy gruñendo");
     }
     public void dormir(){
         System.out.println("Estoy durmiendo por la noche");
     }
     public void soy(){
        System.out.println("Soy un tigre");
       } 


}
class Jirafa extends Animal{
    public Jirafa(String nombre, String comida, int edad, boolean vacunado, boolean salud, String sexo){
        super(nombre, comida, edad, vacunado, salud, sexo);
       
    }
    public void soy(){
        System.out.println("Soy una jirafa");
       } 
    public void comer(){
        System.out.println("Extiendo mi cuello para comer hojas");
     }
     public void hablar(){
         System.out.println("Estoy zumbando");
     }
     public void dormir(){
         System.out.println("Estoy durmiendo por la noche");
     }

}
class Lobo extends Animal{
    public Lobo(String nombre, String comida, int edad, boolean vacunado, boolean salud, String sexo){
        super(nombre, comida, edad, vacunado, salud, sexo);
        
    }
    public void soy(){
        System.out.println("soy un lobo");
       } 
    public void comer(){
        System.out.println("Estoy comindo comida de lobo");
     }
     public void hablar(){
         System.out.println("Estoy aullandole a la luna o a una bola gigante");
     }
     public void dormir(){
         System.out.println("Estoy durmiendo por el dia");
     }

}
class Veterinarian{
    public static void Veterinario(Animal animal){
        
        System.out.println("Este animal esta visitando al veterianario");
        if(animal.getVacunado() == true){
            System.out.println("El anumal ya ha sido vacunado");
    
        }else{
            animal.setVacunado();
            System.out.println("El animal ha sido vacunado");
            
        }

        if(animal.edad > 20){
            System.out.println("El animal esta bien pero debe tener comida especial para su edad");
        }

        if(animal.salud == false){
            System.out.println("El animal esta enfermo, lo sanare");
            animal.setSalud(true);
            System.out.println("El animal ya se encuentra bien, cuidalo!!");
        }else{
            System.out.println("El animal esta bien de salud");
        }

        
    }
}