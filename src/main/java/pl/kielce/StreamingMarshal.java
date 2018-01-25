package pl.kielce;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class StreamingMarshal
{

    public static void main(String[] args) throws FileNotFoundException, XMLStreamException {
        XMLStreamWriter xmlOut = XMLOutputFactory.newFactory().createXMLStreamWriter(new FileOutputStream("/tmp/file.xml"), "UTF-8");
        xmlOut.writeStartDocument();
        xmlOut.writeStartElement("rootElement");

        xmlOut.writeStartElement("test");
        xmlOut.writeCharacters("hello");
        xmlOut.writeEndElement();

        xmlOut.writeStartElement("test2");

        xmlOut.writeCharacters("<>.&");

        xmlOut.writeEndElement();

        xmlOut.writeEndElement();
        xmlOut.writeEndDocument();
    }
}