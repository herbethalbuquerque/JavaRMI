import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {

    public static void main(String args[])
    {
        try
        {
            MuralImpl recado = new MuralImpl();
            LocateRegistry.createRegistry(2020);
            Naming.rebind("//localhost:2020/Mural", recado);
            
            System.out.println("Servidor Mural ativo");
        }
        catch (Exception e)
        {
            System.out.println("Servidor Mural erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
