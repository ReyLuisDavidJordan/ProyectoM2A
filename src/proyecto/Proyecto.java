/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author ISTA
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Gracias Cristo siu");
        System.out.println("??");
    //Comentario desde github
        //MALDITO MAMAÑEMA
        // hola como estas pinshe webada de git hub
        
        ArrayList <Cocinero> ListaCocineros= new ArrayList <>();
        ArrayList <Mesero> ListaMeseros= new ArrayList<>();
        ArrayList <Cliente> ListaCliente=new ArrayList<>();
        ArrayList <Pedido> Pedi=new ArrayList<>();
       Scanner entrada= new Scanner(System.in);
        boolean Salir=false;
        boolean SalirCocinero=false;
        boolean SalirMesero=false;
        boolean SalirMenuSalirCliente=false;
        boolean SalirMenuPedido=false;
       do{  
        System.out.println("Bienvenido al menu de la Empresa");
       System.out.println("1. Creación de cocinero");
       System.out.println("2. Creación de mesero");
       System.out.println("3. Creación de cliente");
       System.out.println("4. Reporte de cocineros (con su salario+bono).");
       System.out.println("5. Reporte de meseros (con su salario+bono).");
       System.out.println("6. Reporte de los clientes (con su descuento)");
       System.out.println("7. Buscar Cocinero por cedula y modificar la edad");
       System.out.println("8. Buscar Mesero por cédula y modificar la edad");
       System.out.println("9. Buscar Cliente por cédula y modificar la edad");
       System.out.println("10. Eliminar Cocinero por cédula.");
       System.out.println("11. Eliminar Mesero por cedula");
       System.out.println("12. Eliminar Cliente por cédula");
       System.out.println("13. Ingresar Pedido.");
       System.out.println("14. Mostrar Pedido");
       System.out.println("15. SALIR");
        
    }
    
}
