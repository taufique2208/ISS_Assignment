package xmlparser;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void parseXmlFile(String filePath) {
        try {
            File xmlFile = new File(filePath);
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            Document document = factory.newDocumentBuilder().parse(xmlFile);
            document.getDocumentElement().normalize();

            System.out.println("Root element: " + document.getDocumentElement().getNodeName());

            NodeList nodeList = document.getElementsByTagName("student");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element studentElement = (Element) nodeList.item(i);

                int id = Integer.parseInt(getElementValue(studentElement, "id"));
                String name = getElementValue(studentElement, "name");
                int age = Integer.parseInt(getElementValue(studentElement, "age"));

                System.out.println("\n----------------------------");
                System.out.println("ID   : " + id);
                System.out.println("Name : " + name);
                System.out.println("Age  : " + age);
            }

        } catch (ParserConfigurationException | IOException | SAXException e) {
            System.err.println("Error parsing XML file: " + e.getMessage());
        }
    }

    private static String getElementValue(Element element, String tag) {
        NodeList nodeList = element.getElementsByTagName(tag);
        return nodeList.getLength() > 0 ? nodeList.item(0).getTextContent() : "";
    }

    public static void main(String[] args) {
        String filePath = "src\\xmlparser\\student.xml"; // Update if needed
        parseXmlFile(filePath);
    }
}
