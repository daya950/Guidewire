
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.claimapi;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "BadIdentifierException", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/ClaimAPI")
public class BadIdentifierException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private BadIdentifierException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public BadIdentifierException_Exception(String message, BadIdentifierException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public BadIdentifierException_Exception(String message, BadIdentifierException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.guidewire.cc.ws.gw.webservice.cc.cc801.claim.claimapi.BadIdentifierException
     */
    public BadIdentifierException getFaultInfo() {
        return faultInfo;
    }

}