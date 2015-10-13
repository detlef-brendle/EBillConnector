Author: Detlef Brendle (Prospective Media Services AG, Zürich. Oktober 2015)


Dieses Modul dient als Basis um den E-Rechnung Webservice der Postfinance zu nutzen.

Wichtige Dateien:

-security-config.xml    : Hier werden die Credentials (Benutzer/Passwort) hinterlegt, die notwendig sind um den Webservice aufzurufen. Benutzernamen und Passwort bekommen Sie von der Postfinance.
Config.groovy           : Webservice Templates (Upload/download) mit der TestUmgebung von Postfinance. Wichtig: Falls PROD erwünscht, muss die WSDL Endpoint URL entsprechend angepasst werden.
ch.yellowworld Package  : JAXB Generierte Klassen vom WSDL
-EFinanceTest.groovy    : Beispielhafter Aufruf zum WebserviceTemplate. Wichtig ist, dass marshalSendAndReceive() mit securityCallback Handler aufgerufen wird.





