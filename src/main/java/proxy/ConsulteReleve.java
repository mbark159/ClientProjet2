
package proxy;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ConsulteReleve", targetNamespace = "http://wepservice.project2.enset.ma/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConsulteReleve {


    /**
     * 
     * @param rib
     * @return
     *     returns proxy.Releve
     */
    @WebMethod(operationName = "GetReleve")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetReleve", targetNamespace = "http://wepservice.project2.enset.ma/", className = "proxy.GetReleve")
    @ResponseWrapper(localName = "GetReleveResponse", targetNamespace = "http://wepservice.project2.enset.ma/", className = "proxy.GetReleveResponse")
    @Action(input = "http://wepservice.project2.enset.ma/ConsulteReleve/GetReleveRequest", output = "http://wepservice.project2.enset.ma/ConsulteReleve/GetReleveResponse")
    public Releve getReleve(
        @WebParam(name = "RIB", targetNamespace = "")
        String rib);

}
