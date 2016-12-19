
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.claimapi;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "DuplicateKeyException", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/ClaimAPI")
public class DuplicateKeyException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DuplicateKeyException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public DuplicateKeyException_Exception(String message, DuplicateKeyException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public DuplicateKeyException_Exception(String message, DuplicateKeyException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.guidewire.cc.ws.gw.webservice.cc.cc801.claim.claimapi.DuplicateKeyException
     */
    public DuplicateKeyException getFaultInfo() {
        return faultInfo;
    }

}