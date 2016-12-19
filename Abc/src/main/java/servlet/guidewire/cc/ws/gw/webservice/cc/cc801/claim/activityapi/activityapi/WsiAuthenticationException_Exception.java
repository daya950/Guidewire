
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "WsiAuthenticationException", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI")
public class WsiAuthenticationException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private WsiAuthenticationException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public WsiAuthenticationException_Exception(String message, WsiAuthenticationException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public WsiAuthenticationException_Exception(String message, WsiAuthenticationException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.WsiAuthenticationException
     */
    public WsiAuthenticationException getFaultInfo() {
        return faultInfo;
    }

}
