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
              <subject_div><![CDATA[창의교양]]></subject_div>
              <subject_div2><![CDATA[교양선택]]></subject_div2>
              <subject_no><![CDATA[01502]]></subject_no>
              <class_div><![CDATA[01]]></class_div>
              <subject_nm><![CDATA[마이다큐멘터리]]></subject_nm>
              <sub_dept><![CDATA[교양교직부]]></sub_dept>
              <day_night_nm><![CDATA[주간]]></day_night_nm>
              <shyr>1</shyr>
              <credit>3</credit>
              <class_nm><![CDATA[금07,08,09,10/19-328]]></class_nm>
              <prof_nm><![CDATA[김성환]]></prof_nm>
              <class_type><![CDATA[]]></class_type>
              <etc_permit_yn><![CDATA[Y]]></etc_permit_yn>
              <sec_permit_yn><![CDATA[Y]]></sec_permit_yn>
              <tlsn_limit_count>30</tlsn_limit_count>
              <tlsn_count>17</tlsn_count>
          </list>
      </mainlist>
  </root>
 */

/*
  <?xml version="1.0" encoding="UTF-8"?>
  <xs:schema attributeFormDefault="unqualified" elementFormDefault="qualified" xmlns:xs="http://www.w3.org/2001/XMLSchema">
    <xs:element name="root">
      <xs:complexType>
        <xs:sequence>
          <xs:element name="mainlist">
            <xs:complexType>
              <xs:sequence>
                <xs:element name="list">
                  <xs:complexType>
                    <xs:sequence>
                      <xs:element type="xs:string" name="year"/>
                      <xs:element type="xs:string" name="term"/>
                      <xs:element type="xs:string" name="subject_div"/>
                      <xs:element type="xs:string" name="subject_div2"/>
                      <xs:element type="xs:string" name="subject_no"/>
                      <xs:element type="xs:string" name="class_div"/>
                      <xs:element type="xs:string" name="subject_nm"/>
                      <xs:element type="xs:string" name="sub_dept"/>
                      <xs:element type="xs:string" name="day_night_nm"/>
                      <xs:element type="xs:string" name="shyr"/>
                      <xs:element type="xs:string" name="credit"/>
                      <xs:element type="xs:string" name="class_nm"/>
                      <xs:element type="xs:string" name="prof_nm"/>
                      <xs:element type="xs:string" name="class_type"/>
                      <xs:element type="xs:string" name="etc_permit_yn"/>
                      <xs:element type="xs:string" name="sec_permit_yn"/>
                      <xs:element type="xs:string" name="tlsn_limit_count"/>
                      <xs:element type="xs:string" name="tlsn_count"/>
                    </xs:sequence>
                  </xs:complexType>
                </xs:element>
              </xs:sequence>
            </xs:complexType>
          </xs:element>
          <xs:element type="xs:string" name="_COLUMNS_OF_TABLE_TO_TEXT_"/>
        </xs:sequence>
      </xs:complexType>
    </xs:element>
 </xs:schema>
 */
@ToString
@Setter
@Getter
@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.NONE)
public class ConvergenceSubjectResponse {

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
        private List<ConvergenceSubject> convergenceSubjectList;
    }

    @Getter
    @Setter
    @ToString
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class ConvergenceSubject {
        private String class_div="";
        private String class_nm="";
        private String class_type="";
        private String credit="";
        private String day_night_nm="";
        private String etc_permit_yn="";
        private String prof_nm="";
        private String sec_permit_yn="";
        private String shyr="";
        private String sub_dept="";
        private String subject_div="";
        private String subject_div2="";
        private String subject_nm="";
        private String subject_no="";
        private String term="";
        private String tlsn_count="";
        private String tlsn_limit_count="";
        private String year="";
    }
}
