
package com.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "SOAPException", targetNamespace = "http://guidewire.com/pc/ws/gw/webservice/pc/pc800/ccintegration/CCPolicySearchIntegration")
public class SOAPException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SOAPException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public SOAPException_Exception(String message, SOAPException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public SOAPException_Exception(String message, SOAPException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.guidewire.pc.ws.gw.webservice.pc.pc800.ccintegration.ccpolicysearchintegration.SOAPException
     */
    public SOAPException getFaultInfo() {
        return faultInfo;
    }

}