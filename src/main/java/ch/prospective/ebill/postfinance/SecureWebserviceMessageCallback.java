package ch.prospective.ebill.postfinance;


import com.sun.xml.wss.ProcessingContext;
import com.sun.xml.wss.XWSSProcessor;
import com.sun.xml.wss.XWSSecurityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
import org.springframework.ws.soap.security.xwss.XwsSecuritySecurementException;
import org.w3c.dom.Node;

import javax.xml.soap.SOAPMessage;
import javax.xml.transform.dom.DOMSource;
import java.io.IOException;

public class SecureWebserviceMessageCallback implements WebServiceMessageCallback {
    @Autowired
    XWSSProcessor xwssProcessor;
    ProcessingContext context = new ProcessingContext();

    public void doWithMessage(WebServiceMessage message) throws IOException {
        SaajSoapMessage saajSoapMessage = (SaajSoapMessage) message;
        Node node = ((DOMSource) saajSoapMessage.getSoapBody().getPayloadSource()).getNode();
        saajSoapMessage.setSoapAction(node.getNamespaceURI() + "/" + node.getLocalName());
        SOAPMessage saajMessage = saajSoapMessage.getSaajMessage();
        try {
            context.setSOAPMessage(saajMessage);
            SOAPMessage securedMessage = xwssProcessor.secureOutboundMessage(context);
            saajSoapMessage.setSaajMessage(securedMessage);
        } catch (XWSSecurityException e) {
            throw new XwsSecuritySecurementException(e.getMessage());
        }
    }
}
