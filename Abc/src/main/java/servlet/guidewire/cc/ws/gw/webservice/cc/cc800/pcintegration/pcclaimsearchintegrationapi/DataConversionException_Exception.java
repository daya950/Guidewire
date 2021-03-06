
package servlet.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "DataConversionException", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc800/pcintegration/PCClaimSearchIntegrationAPI")
public class DataConversionException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DataConversionException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public DataConversionException_Exception(String message, DataConversionException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public DataConversionException_Exception(String message, DataConversionException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.guidewire.cc.ws.gw.webservice.cc.cc800.pcintegration.pcclaimsearchintegrationapi.DataConversionException
     */
    public DataConversionException getFaultInfo() {
        return faultInfo;
    }

}
