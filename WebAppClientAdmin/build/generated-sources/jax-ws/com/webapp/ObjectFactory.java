
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

    private final static QName _AddError_QNAME = new QName("http://webapp.com/", "addError");
    private final static QName _AddErrorResponse_QNAME = new QName("http://webapp.com/", "addErrorResponse");
    private final static QName _CreateTable_QNAME = new QName("http://webapp.com/", "createTable");
    private final static QName _CreateTableResponse_QNAME = new QName("http://webapp.com/", "createTableResponse");
    private final static QName _DelError_QNAME = new QName("http://webapp.com/", "delError");
    private final static QName _DelErrorResponse_QNAME = new QName("http://webapp.com/", "delErrorResponse");
    private final static QName _GetAll_QNAME = new QName("http://webapp.com/", "getAll");
    private final static QName _GetAllResponse_QNAME = new QName("http://webapp.com/", "getAllResponse");
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
     * Create an instance of {@link AddError }
     * 
     */
    public AddError createAddError() {
        return new AddError();
    }

    /**
     * Create an instance of {@link AddErrorResponse }
     * 
     */
    public AddErrorResponse createAddErrorResponse() {
        return new AddErrorResponse();
    }

    /**
     * Create an instance of {@link CreateTable }
     * 
     */
    public CreateTable createCreateTable() {
        return new CreateTable();
    }

    /**
     * Create an instance of {@link CreateTableResponse }
     * 
     */
    public CreateTableResponse createCreateTableResponse() {
        return new CreateTableResponse();
    }

    /**
     * Create an instance of {@link DelError }
     * 
     */
    public DelError createDelError() {
        return new DelError();
    }

    /**
     * Create an instance of {@link DelErrorResponse }
     * 
     */
    public DelErrorResponse createDelErrorResponse() {
        return new DelErrorResponse();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.com/", name = "addError")
    public JAXBElement<AddError> createAddError(AddError value) {
        return new JAXBElement<AddError>(_AddError_QNAME, AddError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddErrorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.com/", name = "addErrorResponse")
    public JAXBElement<AddErrorResponse> createAddErrorResponse(AddErrorResponse value) {
        return new JAXBElement<AddErrorResponse>(_AddErrorResponse_QNAME, AddErrorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTable }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.com/", name = "createTable")
    public JAXBElement<CreateTable> createCreateTable(CreateTable value) {
        return new JAXBElement<CreateTable>(_CreateTable_QNAME, CreateTable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTableResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.com/", name = "createTableResponse")
    public JAXBElement<CreateTableResponse> createCreateTableResponse(CreateTableResponse value) {
        return new JAXBElement<CreateTableResponse>(_CreateTableResponse_QNAME, CreateTableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.com/", name = "delError")
    public JAXBElement<DelError> createDelError(DelError value) {
        return new JAXBElement<DelError>(_DelError_QNAME, DelError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelErrorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.com/", name = "delErrorResponse")
    public JAXBElement<DelErrorResponse> createDelErrorResponse(DelErrorResponse value) {
        return new JAXBElement<DelErrorResponse>(_DelErrorResponse_QNAME, DelErrorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.com/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webapp.com/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
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
