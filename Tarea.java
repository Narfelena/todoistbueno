import java.time.LocalDate;
/**
 * Write a description of class Tarea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarea
{
    private String descripcion;
    private boolean terminada;
    private int prioridad;
    private LocalDate fechaVencimiento;
    
    public Tarea(String descripcion)
    {
        terminada = false;
        this.descripcion = descripcion;
        prioridad = 0;
        fechaVencimiento = null;
    }
    
    public String getDescripcion() 
    {
        return descripcion;
    }
    
    public boolean estaTerminada()
    {
        return terminada;
    }
    
    public void marcarComoCompletada()
    {
        terminada = true;
    }
    
    public void cambiarFechaVencimiento(LocalDate nuevaFechaVencimiento)
    {
        nuevaFechaVencimiento = fechaVencimiento;
    }
    
    public LocalDate mostrarFechaVencimiento()
    {
        return fechaVencimiento;
    }
    
    public String toString()
    {
        String textoADevolver = "";
        if (terminada) {
            textoADevolver = textoADevolver + "HECHA ";
        }
        textoADevolver += descripcion + " ( " + prioridad + ").";
        return textoADevolver;
    }
    
    public void cambiarPrioridad(int nuevaPrioridad)
    {
        if(nuevaPrioridad >= 0 && nuevaPrioridad <= 5){
            prioridad = nuevaPrioridad;
        }
    }
    
}
