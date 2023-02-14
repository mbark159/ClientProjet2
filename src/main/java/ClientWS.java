import proxy.ConsuleReleveWS;
import proxy.ConsulteReleve;
import proxy.Operation;
import proxy.Releve;

public class ClientWS {
    public static void main(String[] args) {
        ConsulteReleve stub =new ConsuleReleveWS().getConsulteRelevePort();
        System.out.println(stub.getReleve("f"));


    }
}
