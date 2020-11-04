import java.util.*;
public class Practica5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tecla;
        
        
        
        Cuenta cuenta = Banco.crearcuenta();

        do{
            System.out.println("Precione cualquiera de las siguientes teclas:\n1- Consultar saldo\n2- Depositar\n3- Retirar\n4- Crear nueva cuenta\n5- Salir");
            
            tecla=sc.nextInt();
            switch (tecla) {
                case 1:
                    System.out.println("Ingrese su pin");
                    if(Banco.verificarpin(cuenta)){
                        Banco.versaldo(cuenta);
                    }else{
                        System.out.println("Pin incorrecto");

                    }
                    
                    break;
                case 2:
                    System.out.println("Ingrese su pin");
                    if(Banco.verificarpin(cuenta)){
                        System.out.println("Ingrese la cantidad a depositar");
                        double depositar = sc.nextDouble();
                        Banco.depositar(depositar, cuenta);
                    }else{
                        System.out.println("Pin incorrecto");

                    }

                    break;
                
                case 3:
                     System.out.println("Ingrese su pin");
                    if(Banco.verificarpin(cuenta)){
                        System.out.println("Ingrese la cantidad a retirar");
                        double retiro = sc.nextDouble();
                        Banco.retirar(cuenta, retiro);
                    }else{
                        System.out.println("Pin incorrecto");

                    }
                    break;
                case 4:
                    System.out.println("Usted esta creando una nueva cuenta");
                    cuenta = Banco.crearcuenta();
               
                    break;
                case 5:
                System.out.println("Gracias!");
                break;
                default:
                System.out.println("Opcion invalida");
                    break;
            }

        }while(tecla != 5);
        
    }

    
}

class Banco{
    Scanner sc = new Scanner (System.in);
   public static void depositar(double cantidad,Cuenta cuenta){
       
       cuenta.setSaldo(cuenta.getSaldo()+cantidad);
       System.out.println("Se depositaron "+cantidad+" pesos a su cuenta");
       System.out.println("Su saldo total es de "+cuenta.getSaldo());

    }
    public static void retirar(Cuenta cuenta, double cantidad){
        
        if(cantidad > cuenta.getSaldo()){
            System.out.println("Fondos insuficientes");
        }else{cuenta.setSaldo(cuenta.getSaldo()-cantidad);
            System.out.println("Resiva la cantidad de "+cantidad+" pesos.");
            System.out.println("Su saldo restante es de "+cuenta.getSaldo());
        }
    }
    public static void versaldo(Cuenta cuenta){
        System.out.println("Su saldo es de "+cuenta.getSaldo());
    }
    public static boolean verificarpin(Cuenta cuenta){
        Scanner sc = new Scanner (System.in);
        System.out.println("Hola "+cuenta.getNombre()+", por favor ingrese su pin.");
        int pin = sc.nextInt();
        if(pin == cuenta.getPin()){
            return true;
        }else return false;

    }
    public static Cuenta crearcuenta(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el nombre del Nuevo cliente");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el pin del nuevo cliente ");
        int pin = sc.nextInt();
        System.out.println("Ingrese el saldo del nuevo cliente");
        double saldo = sc.nextDouble();
        Cuenta cuenta = new Cuenta(nombre,pin,saldo);
        return cuenta;
    }
    
}
class Cuenta{
    private String nombre;
    private int pin;
    private double saldo;
    public Cuenta(String nombre, int pin, double saldo){
        this.nombre=nombre;
        this.pin=pin;
        this.saldo=saldo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public int getPin() {
        return pin;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    

}
