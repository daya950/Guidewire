
package servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ActivityAPIPortType", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI")
@XmlSeeAlso({
	servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.ObjectFactory.class,
	servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activitydtonotification.ObjectFactory.class,
	servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.activitydto.ObjectFactory.class,
	servlet.guidewire.cc.ws.gw.webservice.cc.cc801.dto.notedto.ObjectFactory.class,
	servlet.guidewire.ws.soapheaders.ObjectFactory.class,
	servlet.guidewire.cc.typekey.ObjectFactory.class
})
public interface ActivityAPIPortType {


    /**
     * 
     * @param id
     * @return
     *     returns servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.GetActivityByClaimIDResponse.Return
     * @throws WsiAuthenticationException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI")
    @RequestWrapper(localName = "getActivityByClaimID", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI", className = "servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.GetActivityByClaimID")
    @ResponseWrapper(localName = "getActivityByClaimIDResponse", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI", className = "servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.GetActivityByClaimIDResponse")
    public servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.GetActivityByClaimIDResponse.Return getActivityByClaimID(
        @WebParam(name = "id", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI")
        String id)
        throws WsiAuthenticationException_Exception
    ;

    /**
     * 
     * @param id
     * @return
     *     returns servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.GetNotificationsByClaimIDResponse.Return
     * @throws WsiAuthenticationException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI")
    @RequestWrapper(localName = "getNotificationsByClaimID", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI", className = "servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.GetNotificationsByClaimID")
    @ResponseWrapper(localName = "getNotificationsByClaimIDResponse", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI", className = "servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.GetNotificationsByClaimIDResponse")
    public servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.GetNotificationsByClaimIDResponse.Return getNotificationsByClaimID(
        @WebParam(name = "id", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI")
        String id)
        throws WsiAuthenticationException_Exception
    ;

    /**
     * 
     * @param id
     * @return
     *     returns servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.GetNotificationsByPolicyNoResponse.Return
     * @throws WsiAuthenticationException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI")
    @RequestWrapper(localName = "getNotificationsByPolicyNo", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI", className = "servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.GetNotificationsByPolicyNo")
    @ResponseWrapper(localName = "getNotificationsByPolicyNoResponse", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI", className = "servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.GetNotificationsByPolicyNoResponse")
    public servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.GetNotificationsByPolicyNoResponse.Return getNotificationsByPolicyNo(
        @WebParam(name = "id", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI")
        String id)
        throws WsiAuthenticationException_Exception
    ;

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.Boolean
     * @throws WsiAuthenticationException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI")
    @RequestWrapper(localName = "updateActivitySeen", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI", className = "servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.UpdateActivitySeen")
    @ResponseWrapper(localName = "updateActivitySeenResponse", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI", className = "servlet.guidewire.cc.ws.gw.webservice.cc.cc801.claim.activityapi.activityapi.UpdateActivitySeenResponse")
    public Boolean updateActivitySeen(
        @WebParam(name = "id", targetNamespace = "http://guidewire.com/cc/ws/gw/webservice/cc/cc801/claim/activityapi/ActivityAPI")
        String id)
        throws WsiAuthenticationException_Exception
    ;

}
