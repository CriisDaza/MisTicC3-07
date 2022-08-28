public class Spring2 {

    public static void main(String[] args) {
        //Instancia de empresa creada
        Empresa emp = new Empresa("MisionTic", "Calle 1 #2-2", 123123123, 90909999);

        //Extraer Datos de la empresa creada
        System.out.println("Nombre Empresa: " + emp.getNombre());
        System.out.println("Direccion Empresa: " + emp.getDireccion());
        System.out.println("Telefono Empresa: " + emp.getTelefono());
        System.out.println("Nit Empresa: " + emp.getNIT());

        //Modificar Datos de la empresa Creada
        emp.setNombre("Mision Ministerio de las Tic");
        emp.setDireccion("Calle 2 #3-3");
        emp.setTelefono(454545454);
        emp.setNIT(87854546);
        System.out.println("----------");
        //Verificar Cambios en la instancia
        System.out.println("Nombre Empresa: " + emp.getNombre());
        System.out.println("Direccion Empresa: " + emp.getDireccion());
        System.out.println("Telefono Empresa: " + emp.getTelefono());
        System.out.println("Nit Empresa: " + emp.getNIT());

        System.out.println("---------------------------------");

        //Crear Instancia de Empleado
        Empleado empleado = new Empleado("Pedro", "pedro@misiontic.com", "Admin");

        //Extraer Datos del empleado creado
        System.out.println("Nombre Empleado: " + empleado.getNombreEmpleado());
        System.out.println("Correo Empleado: " + empleado.getCorreo());
        System.out.println("Rol Empleado: " + empleado.getRolEmpleado());

        //Modificacion de la instancia
        empleado.setNombreEmpleado("Pedro Navajas");
        empleado.setCorreo("PedroNavajas@misiontic.com");
        empleado.setRolEmpleado("Operario");
        System.out.println("----------");
        //Verificar Cambios en la instancia
        System.out.println("Nombre Empleado: " + empleado.getNombreEmpleado());
        System.out.println("Correo Empleado: " + empleado.getCorreo());
        System.out.println("Rol Empleado: " + empleado.getRolEmpleado());

        //Creacion instancia movimientoDinero
        movimientoDinero mov = new movimientoDinero(999999.2,"Consignacion","Andres ");

        System.out.println("---------------------------------");
        //mostrar datos
        System.out.println("Monto: " + mov.getMontoMovimiento());
        System.out.println("Concepto: " + mov.getConceptoMovimiento());
        System.out.println("Usuario " + mov.getUsuario());

        //Modificar instanciua movimiento dinero
        mov.setMontoMovimiento(1111111.9);
        mov.setConceptoMovimiento("Envio");
        mov.setUsuario("Felipe");
        System.out.println("----------");
        //Verificar Cambio de datos
        System.out.println("Monto: " + mov.getMontoMovimiento());
        System.out.println("Concepto: " + mov.getConceptoMovimiento());
        System.out.println("Usuario " + mov.getUsuario());
    }
    }

