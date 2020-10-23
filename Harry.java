import java.util.*;
public class Harry {
    public static void main(String[] args) {
        int tecla;
        Scanner sc = new Scanner (System.in);
        do{
            System.out.println("\nPreciona una de las siguentes teclas:\n1-Harry Potter\n2-Dubie\n3-Vernon\n4-Minerva McGonagall\n5-Nicholas\n6-salir\n");
            tecla=sc.nextInt();
            
            switch (tecla) {
                case 1:
                Magoespecial harry = new Magoespecial("Harry Potter", true, " magico", "Blanca", "Cola de Fenix", " El egido", "Bien");
                    
                    break;
                
                case 2:
                Criaturamagica dubie = new Criaturamagica("Dubie", true, " Magico", "Elfo domestico", true, false, true);
                    
                    break;
                case 3:
                Muggle vernom = new Muggle("Vernon", true, " Muggle", "Trabajador", "Tio de Harry Potter");
                    
                    break;
                
                case 4:
                Profesor minerva = new Profesor("Minerva McGonagall", true, " magico", "Blanca", "Escama de dragon", "Encantamientos", "Hechiseria", "Grifindor");
              
                        
                    
                    break; 
                case 5:
                Criaturamagica nicolas = new Criaturamagica("Nicholas de Mimsy-Porpington", true, " magico", "humano", false, false, false);
                    break;
                default:
                
                System.out.println("Ingrese una tecla valida");


                    break;
            }

        }while(tecla != 6);
        
    }
    public static class Servivo{
        String nombre;
        boolean inteligente;
        String mundo;
        public Servivo(String nombre, boolean inteligente, String mundo){
            this.nombre = nombre;
            this.inteligente = inteligente;
            this.mundo = mundo;
            System.out.println("Mi nombre es: "+nombre); 
            if(inteligente){
                System.out.println("Soy un ser inteligente");
            } else{
                System.out.println("No soy un ser inteligente");
            }
            System.out.println("Pertenesco al mundo" + mundo);
        
        }
            
    }
    public static class Mago extends Servivo{
        String magia;
        String varita;
        
        public Mago(String nombre, boolean inteligente, String mundo, String magia, String varita){
            super (nombre, inteligente, mundo);
            this.magia = magia;
            this.varita = varita;
            System.out.println("Hago magia " + magia);
            System.out.println("My varita esta hecha de "+varita);
        }

    }
    public static class Estudiante extends Mago{
        String casa;
        String deporte;
        String clases;
        public Estudiante(String nombre, boolean inteligente, String mundo, String magia, String varita, String casa,String deporte, String clases){
            super(nombre, inteligente, mundo, magia, varita);
            this.casa=casa;
            this.deporte=deporte;
            this.clases=clases;
            System.out.println("Estudio en Hogwarts y pertenesco a la casa "+casa);
            System.out.println("El deporte que practico es "+deporte);
            System.out.println("Estoy en las siguentes clases: "+clases);

        }
    }
    public static class Profesor extends Mago{
        String asignatura;
        String tipodemago;
        String casa;
        public Profesor(String nombre, boolean inteligente, String mundo, String magia, String varita, String asignatura, String tipodemago,String casa){
            super(nombre, inteligente, mundo, magia, varita);
            this.asignatura=asignatura;
            this.tipodemago=tipodemago;
            this.casa=casa;
            System.out.println("Soy profesor de Hoqwarts y doy clae de "+asignatura);
            System.out.println("Soy especialista en "+tipodemago);
            System.out.println("Pertenesco a la casa de "+casa);

        }
    }
    public static class Magoespecial extends Mago{
        String rol;
        String lado;//bien, mal
        public Magoespecial(String nombre, boolean inteligente, String mundo, String magia, String varita, String rol, String lado){
            super(nombre, inteligente, mundo, magia, varita);
            this.rol=rol;
            this.lado=lado;
            System.out.println("Soy un mago especial");
            System.out.println("Mi rol es"+rol);
            System.out.println("Sigo el camino del "+lado);

        }

    }
    public static class Muggle extends Servivo{
        String ocupacion;
        String rol;
        public Muggle(String nombre, boolean inteligente, String mundo, String ocupacion, String rol){
            super(nombre, inteligente, mundo);
            this.ocupacion=ocupacion;
            this.rol=rol;
            System.out.println("Soy un Muggle");
            System.out.println("Mi ocupacion es "+ocupacion);
            System.out.println("Mi rol es "+rol);

        }
    }
    public static class Criaturamagica extends Servivo{
        String criatura;
        boolean magia;
        boolean peligroso;
        boolean vida;
        public Criaturamagica(String nombre, boolean inteligente, String mundo, String criatura, boolean magia, boolean peligroso, boolean vida){
            super(nombre, inteligente, mundo);
            this.criatura = criatura;
            this.magia = magia;
            this.peligroso = peligroso;
            this.vida = vida;
            System.out.println("Soy un "+criatura);
    
            if(magia){
                System.out.println("Puedo hacer magia");
            } else{
                System.out.println("No Puedo hacer magia");
            }
            if(peligroso){
                System.out.println("Soy peligroso");
            } else{
                System.out.println("No soy peligroso");
            }
            if(vida){
                System.out.println("Estoy vivo");
            } else{
                System.out.println("Soy un fantasma o una pintura");
            }
           
        
        }
        }

    }

