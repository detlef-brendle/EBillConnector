package ch.prospective.ebill.postfinance

import ch.yellowworld.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration
import org.springframework.ws.client.core.WebServiceTemplate
import spock.lang.Specification

@WebAppConfiguration
@ContextConfiguration(classes = [Config.class])
public class EFinanceTest extends Specification {

    public static final String BILLER_ID = "41101000000309714"
    @Autowired
    @Qualifier(value = "uploadTemplate")
    WebServiceTemplate uploadTemplate
    @Autowired
    @Qualifier(value = "downloadTemplate")
    WebServiceTemplate downloadTemplate

    @Autowired
    SecureWebserviceMessageCallback secureWebserviceMessageCallback


    def 'test call getInvoiceListWithIDs'() {
        when:
        def o = new GetInvoiceListWithIDs(billerID: BILLER_ID)
        GetInvoiceListWithIDsResponse receive = downloadTemplate.marshalSendAndReceive(o, secureWebserviceMessageCallback) as GetInvoiceListWithIDsResponse
        then:
        receive
    }

    def 'test call getInvoiceList'() {
        when:
        GetInvoiceList o = new GetInvoiceList(billerID: BILLER_ID)
        GetInvoiceListResponse receive = downloadTemplate.marshalSendAndReceive(o, secureWebserviceMessageCallback) as GetInvoiceListResponse
        then:
        receive
    }
}
