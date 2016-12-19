
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ActivityAPI", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI", wsdlLocation = "http://115.112.147.13:8080/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI?WSDL")
public class ActivityAPI
    extends Service
{

    private final static URL ACTIVITYAPI_WSDL_LOCATION;
    private final static WebServiceException ACTIVITYAPI_EXCEPTION;
    private final static QName ACTIVITYAPI_QNAME = new QName("http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI", "ActivityAPI");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://115.112.147.13:8080/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ACTIVITYAPI_WSDL_LOCATION = url;
        ACTIVITYAPI_EXCEPTION = e;
    }

    public ActivityAPI() {
        super(__getWsdlLocation(), ACTIVITYAPI_QNAME);
    }

    public ActivityAPI(WebServiceFeature... features) {
        super(__getWsdlLocation(), ACTIVITYAPI_QNAME, features);
    }

    public ActivityAPI(URL wsdlLocation) {
        super(wsdlLocation, ACTIVITYAPI_QNAME);
    }

    public ActivityAPI(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ACTIVITYAPI_QNAME, features);
    }

    public ActivityAPI(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ActivityAPI(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ActivityAPIPortType
     */
    @WebEndpoint(name = "ActivityAPISoap11Port")
    public ActivityAPIPortType getActivityAPISoap11Port() {
        return super.getPort(new QName("http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI", "ActivityAPISoap11Port"), ActivityAPIPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ActivityAPIPortType
     */
    @WebEndpoint(name = "ActivityAPISoap11Port")
    public ActivityAPIPortType getActivityAPISoap11Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI", "ActivityAPISoap11Port"), ActivityAPIPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ACTIVITYAPI_EXCEPTION!= null) {
            throw ACTIVITYAPI_EXCEPTION;
        }
        return ACTIVITYAPI_WSDL_LOCATION;
    }

}