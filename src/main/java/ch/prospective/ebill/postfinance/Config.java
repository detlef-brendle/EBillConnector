package ch.prospective.ebill.postfinance;

import com.sun.xml.wss.XWSSProcessor;
import com.sun.xml.wss.XWSSProcessorFactory;
import com.sun.xml.wss.XWSSecurityException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

import javax.naming.NamingException;
import java.io.IOException;

/**
 *
 */
@Configuration
@EnableWebMvc
public class Config extends WebMvcConfigurerAdapter {

    @Bean
    @Qualifier(value="uploadTemplate")
    public WebServiceTemplate createUploadWebServiceTemplate() throws NamingException {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setDefaultUri("https://ebill-ki.postfinance.ch/B2BWebServices/UploadInvoice.asmx?WSDL");
        webServiceTemplate.setMarshaller(getMarshaller());
        webServiceTemplate.setUnmarshaller(getMarshaller());
        HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
        webServiceTemplate.setMessageSender(messageSender);
        return webServiceTemplate;
    }

    @Bean
    @Qualifier(value="downloadTemplate")
    public WebServiceTemplate createDownloadWebServiceTemplate() throws NamingException {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setDefaultUri("https://ebill-ki.postfinance.ch/B2BWebservices/BillerDownloadServices.asmx?WSDL");
        webServiceTemplate.setMarshaller(getMarshaller());
        webServiceTemplate.setUnmarshaller(getMarshaller());
        HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
        webServiceTemplate.setMessageSender(messageSender);
        return webServiceTemplate;
    }

    @Bean
    public Jaxb2Marshaller getMarshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setPackagesToScan("ch.yellowworld");
        return jaxb2Marshaller;
    }


    @Bean
    public XWSSProcessor getXWSSProcessor() throws XWSSecurityException, IOException {
        XWSSProcessorFactory factory = XWSSProcessorFactory.newInstance();
        ClassPathResource xwssConfig = new ClassPathResource("security-config.xml");
        return factory.createProcessorForSecurityConfiguration(xwssConfig.getInputStream(), null);
    }

    @Bean
    public SecureWebserviceMessageCallback createCallback() {
        return new SecureWebserviceMessageCallback();
    }


}
