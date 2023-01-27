package uoslife.timetableservicespring.wise.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
  <?xml version="1.0" encoding="EUC-KR"?>
  <root xmlns="">
  <mainlist>
  <list>
  <year><![CDATA[2012]]></year>
  <term><![CDATA[A10]]></term>
  <subject_div2><![CDATA[역사와철학2]]></subject_div2>
  <subject_div><![CDATA[교양선택]]></subject_div>
  <subject_no><![CDATA[01093]]></subject_no>
  <class_div><![CDATA[01]]></class_div>
  <subject_nm><![CDATA[현대사회와윤리]]></subject_nm>
  <sub_dept><![CDATA[교양교직부]]></sub_dept>
  <day_night_nm><![CDATA[주간]]></day_night_nm>
  <shyr>1</shyr>
  <credit>3</credit>
  <class_nm><![CDATA[월05,06/8-103, 목07/8-103]]></class_nm>
  <prof_nm><![CDATA[최순필]]></prof_nm>
  <class_type><![CDATA[]]></class_type>
  <tlsn_limit_count>42</tlsn_limit_count>
  <tlsn_count>28</tlsn_count>
  </list>
  </mainlist>
  </root>
 */

/**
 * <xs:schema attributeFormDefault="unqualified" elementFormDefault="qualified" xmlns:xs="http://www.w3.org/2001/XMLSchema">
 *   <xs:element name="root">
 *     <xs:complexType>
 *       <xs:sequence>
 *         <xs:element name="mainlist">
 *           <xs:complexType>
 *             <xs:sequence>
 *               <xs:element maxOccurs="unbounded" name="list">
 *                 <xs:complexType>
 *                   <xs:sequence>
 *                     <xs:element name="year" type="xs:string" />
 *                     <xs:element name="term" type="xs:string" />
 *                     <xs:element name="subject_div2" type="xs:string" />
 *                     <xs:element name="subject_div" type="xs:string" />
 *                     <xs:element name="subject_no" type="xs:string" />
 *                     <xs:element name="class_div" type="xs:string" />
 *                     <xs:element name="subject_nm" type="xs:string" />
 *                     <xs:element name="sub_dept" type="xs:string" />
 *                     <xs:element name="day_night_nm" type="xs:string" />
 *                     <xs:element name="shyr" type="xs:unsignedByte" />
 *                     <xs:element name="credit" type="xs:unsignedByte" />
 *                     <xs:element name="class_nm" type="xs:string" />
 *                     <xs:element name="prof_nm" type="xs:string" />
 *                     <xs:element name="class_type" type="xs:string" />
 *                     <xs:element name="tlsn_limit_count" />
 *                     <xs:element name="tlsn_count" />
 *                     <xs:element name="etc_permit_yn" type="xs:string" />
 *                     <xs:element name="sec_permit_yn" type="xs:string" />
 *                   </xs:sequence>
 *                 </xs:complexType>
 *               </xs:element>
 *             </xs:sequence>
 *           </xs:complexType>
 *         </xs:element>
 *         <xs:element name="_COLUMNS_OF_TABLE_TO_TEXT_" type="xs:string" />
 *       </xs:sequence>
 *     </xs:complexType>
 *   </xs:element>
 * </xs:schema>
 */
@ToString
@Setter
@Getter
@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.NONE)
public class CultureSubjectResponse {

    @XmlElement(name = "mainlist")
    private MainList mainlist;

    @XmlElement(name = "_COLUMNS_OF_TABLE_TO_TEXT_")
    private String _COLUMNS_OF_TABLE_TO_TEXT_;

    @Getter
    @Setter
    @ToString
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlRootElement(name = "mainlist")
    private static class MainList {
        @XmlElement(name = "list")
        private List<CultureSubject> cultureSubjectList;
    }

    @Getter
    @Setter
    @ToString
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class CultureSubject {
        private String class_div = "";
        private String class_nm = "";
        private String class_type = "";
        private String credit = "";
        private String day_night_nm = "";
        private String etc_permit_yn = "";
        private String prof_nm = "";
        private String sec_permit_yn = "";
        private String shyr = "";
        private String sub_dept = "";
        private String subject_div = "";
        private String subject_div2 = "";
        private String subject_nm = "";
        private String subject_no = "";
        private String term = "";
        private String tlsn_count = "";
        private String tlsn_limit_count = "";
        private String year = "";
    }
}
