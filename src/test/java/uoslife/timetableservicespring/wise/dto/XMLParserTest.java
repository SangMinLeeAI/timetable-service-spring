package uoslife.timetableservicespring.wise.dto;

import java.io.File;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

public class XMLParserTest {

    private static final String XSD_FILE_PATH = "/Users/min/sources/timetable-service-spring/src/test/java/uoslife/timetableservicespring/wise/dto/DeptInput.xsd";
    private static final String XML_FILE_PATH = "/Users/min/sources/timetable-service-spring/src/test/java/uoslife/timetableservicespring/wise/dto/DeptInput.xml";

    public static void main(String[] args) throws Exception {
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = sf.newSchema(new File(XSD_FILE_PATH));

        JAXBContext jc = JAXBContext.newInstance(DepartmentResponse.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        unmarshaller.setSchema(schema);
        unmarshaller.setEventHandler(new MyValidationEventHandler());
        DepartmentResponse response = (DepartmentResponse) unmarshaller.unmarshal(new File(XML_FILE_PATH));
    }


}
