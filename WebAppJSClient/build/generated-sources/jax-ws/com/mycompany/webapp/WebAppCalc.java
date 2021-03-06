
package com.mycompany.webapp;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebAppCalc", targetNamespace = "http://webapp.mycompany.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebAppCalc {


    /**
     * 
     * @param i
     * @param j
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://webapp.mycompany.com/", className = "com.mycompany.webapp.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://webapp.mycompany.com/", className = "com.mycompany.webapp.AddResponse")
    @Action(input = "http://webapp.mycompany.com/WebAppCalc/addRequest", output = "http://webapp.mycompany.com/WebAppCalc/addResponse")
    public int add(
        @WebParam(name = "i", targetNamespace = "")
        int i,
        @WebParam(name = "j", targetNamespace = "")
        int j);

}
