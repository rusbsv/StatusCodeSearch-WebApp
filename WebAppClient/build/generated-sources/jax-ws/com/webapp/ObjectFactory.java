
package com.webapp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webapp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetErrorDescription_QNAME = new QName("http://webapp.com/", "getErrorDescription");
    private final static QName _GetErrorDescriptionResponse_QNAME = new QName("http://webapp.com/", "getErrorDescriptionResponse");
    private final static QName _GetTables_QNAME = new QName("http://webapp.com/", "getTables");
    private final static QName _GetTablesResponse_QNAME = new QName("http://webapp.com/", "getTablesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webapp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetErrorDescription }
     * 
     */
    public GetErrorDescription createGetErrorDescription() {
        return new GetErrorDescription();
    }

    /**
     * Create an instance of {@link GetErrorDescriptionResponse }
     * 
     */
    public GetErrorDescriptionResponse createGetErrorDescriptionResponse() {
        return new GetErrorDescriptionResponse();
    }

    /**
     * Create an instance of {@link GetTables }
     * 
     */
    public GetTables createGetTables() {
        return new GetTables();
    }

    /**
     * Create an instance of {@link GetTablesResponse }
     * 
     */
    public GetTablesResponse createGetTablesResponse() {
        return new GetTablesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetErrorDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.com/", name = "getErrorDescription")
    public JAXBElement<GetErrorDescription> createGetErrorDescription(GetErrorDescription value) {
        return new JAXBElement<GetErrorDescription>(_GetErrorDescription_QNAME, GetErrorDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetErrorDescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.com/", name = "getErrorDescriptionResponse")
    public JAXBElement<GetErrorDescriptionResponse> createGetErrorDescriptionResponse(GetErrorDescriptionResponse value) {
        return new JAXBElement<GetErrorDescriptionResponse>(_GetErrorDescriptionResponse_QNAME, GetErrorDescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTables }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.com/", name = "getTables")
    public JAXBElement<GetTables> createGetTables(GetTables value) {
        return new JAXBElement<GetTables>(_GetTables_QNAME, GetTables.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTablesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.com/", name = "getTablesResponse")
    public JAXBElement<GetTablesResponse> createGetTablesResponse(GetTablesResponse value) {
        return new JAXBElement<GetTablesResponse>(_GetTablesResponse_QNAME, GetTablesResponse.class, null, value);
    }

}
