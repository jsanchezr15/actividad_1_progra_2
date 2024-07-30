/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juanjo SR
 */
public class Empleado extends Persona{
    private String codigo_empleado,puesto;

    public String getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(String codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    @Override
        public void agregar(){
            System.out.println("CODIGO EMPLEADO "+this.getCodigo_empleado());
            System.out.println("PUESTO "+this.getPuesto());
    System.out.println("NOMBRE "+this.getNombre());
    System.out.println("APELLIDO "+this.getApellido());
    System.out.println("DIRECCION "+this.getDireccion());
    System.out.println("TELEFONO "+this.getTelefono());
    System.out.println("FECHA NACIMIENTO "+this.getFechanacimiento());
    } 
}
