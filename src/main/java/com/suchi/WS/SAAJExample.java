package com.suchi.WS;

import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.soap.MessageFactory;

public class SAAJExample {
	
	static String req = "<?xml version=\"1.0\" encoding=\"utf-8\"?><soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\"><soap12:Body><GetWeather xmlns=\"http://www.webserviceX.NET\"><CityName>Bombay</CityName><CountryName>India</CountryName></GetWeather></soap12:Body></soap12:Envelope>";
	
	public static void main(String args[]){
		
		try {
			SOAPConnectionFactory f = SOAPConnectionFactory.newInstance();
			SOAPConnection conn = f.createConnection();
			
			InputStream in = new ByteArrayInputStream(req.getBytes());
			SOAPMessage req = MessageFactory.newInstance().createMessage(null, in);
			
			SOAPMessage res = conn.call(req, "http://www.webservicex.net/globalweather.asmx");
			
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			Source sourceContent = res.getSOAPPart().getContent();
			System.out.println("\n----------SOAP Response-----------");
			StreamResult result = new StreamResult(System.out);
			transformer.transform(sourceContent, result);
			
			conn.close();
			
			System.out.println("web service called and response received");
		} catch (UnsupportedOperationException | SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
