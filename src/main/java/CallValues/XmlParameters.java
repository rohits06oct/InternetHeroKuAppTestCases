package CallValues;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.*;
import java.io.File;


public class XmlParameters {

    private static String width;
    private static String height;
    private static Node nNode;
    private static Element element;
    static String browser;
    static NodeList nList;

    public static void main(String[] args) {
        System.out.println("main starts");
        readXml();
        String data = readXMLValue(0);
        String data1=readXMLValue(3);
        System.out.println(data);
        System.out.println(data1);
    }

    public static void readXml() {
        try{
            File inputFile = new File("testng.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            nList = doc.getElementsByTagName("parameter");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static String readXMLValue(int index) {
        readXml();
        nNode = nList.item(index);
        element = (Element) nNode;
        browser = element.getAttribute("value");
        return browser;
    }
//    public static String readXMLValue() {
//        nNode = nList.item(1);
//        element = (Element) nNode;
//        width = element.getAttribute("value");
//        System.out.println(width);
//        return width;
//    }
//    public static String xmlValueHeight() {
//            nNode = nList.item(2);
//            element = (Element) nNode;
//            height = element.getAttribute("value");
//            System.out.println(height);
//            return height;
//    }
}