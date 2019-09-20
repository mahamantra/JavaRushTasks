package com.javarush.task.task33.task3309;

import com.javarush.task.task33.task3308.Shop;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.crypto.dsig.Transform;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;

/*
Комментарий внутри xml
*/
public class Solution {
    public static String toXmlWithComment(Object obj, String tagName, String comment) throws JAXBException, ParserConfigurationException, IOException, SAXException, TransformerException {
//        StringWriter stringWriter = new StringWriter();
//        JAXBContext context = JAXBContext.newInstance(obj.getClass());
//        Marshaller marshaller = context.createMarshaller();
//        marshaller.marshal(obj, stringWriter);
//
//        System.out.println(stringWriter.toString());

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse(new File("data.xml"));

        Node root = document.getDocumentElement();
        NodeList nodeList = root.getChildNodes();
       int max=nodeList.getLength();
        for (int i = 0; i < max; i++) {
            Comment comment1 = document.createComment("comment");

            Node node = nodeList.item(i);
            System.out.println(node.getNodeName());
            System.out.println(node.getParentNode());
            if (node.getNodeName().equals("secretData"))
                node.getParentNode().insertBefore(comment1, node);
            System.out.println(node.getNodeName().equals("count"));
        }

        Transformer transformer= TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT,"yes");
        transformer.transform(new DOMSource(document),new StreamResult(new FileOutputStream("result.xml")));

        return null;
    }

    public static void main(String[] args) throws JAXBException, ParserConfigurationException, IOException, SAXException, TransformerException {
        System.out.println(toXmlWithComment(new Shop(), "", ""));
    }
}
