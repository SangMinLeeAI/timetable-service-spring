package uoslife.timetableservicespring.wise.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <?xml version="1.0" encoding="EUC-KR"?>
 * <root xmlns="">
 * <deptList>
 * <list>
 * <prt_ord><![CDATA[00000]]></prt_ord>
 * <dept><![CDATA[A000000100]]></dept>
 * <dept_code_nm><![CDATA[A000000100-서울시립대]]></dept_code_nm>
 * <dept_nm><![CDATA[서울시립대]]></dept_nm>
 * <up_nm><![CDATA[]]></up_nm>
 * <up_dept><![CDATA[]]></up_dept>
 * <dept_div><![CDATA[000]]></dept_div>
 * </list>
 * </deptList>
 * <deptDivList>
 * <list>
 * <dept><![CDATA[A200000100]]></dept>
 * <dept_nm><![CDATA[대학]]></dept_nm>
 * <up_dept><![CDATA[A000000100]]></up_dept>
 * <dept_div><![CDATA[200]]></dept_div>
 * </list>
 * </deptDivList>
 * <subDeptList>
 * <list>
 * <prt_ord><![CDATA[00000]]></prt_ord>
 * <dept><![CDATA[A000000100]]></dept>
 * <dept_code_nm><![CDATA[A000000100-서울시립대]]></dept_code_nm>
 * <dept_nm><![CDATA[서울시립대]]></dept_nm>
 * <up_nm><![CDATA[]]></up_nm>
 * <up_dept><![CDATA[]]></up_dept>
 * <dept_div><![CDATA[000]]></dept_div>
 * <colg><![CDATA[]]></colg>
 * <colg_nm><![CDATA[]]></colg_nm>
 * </list>
 * </subDeptList>
 * </root>
 */
/*
<xs:schema attributeFormDefault="unqualified" elementFormDefault="qualified" xmlns:xs="http://www.w3.org/2001/XMLSchema">
  <xs:element name="root">
    <xs:complexType>
      <xs:sequence>
        <xs:element name="deptList">
          <xs:complexType>
            <xs:sequence>
              <xs:element name="list">
                <xs:complexType>
                  <xs:sequence>
                    <xs:element type="xs:byte" name="prt_ord"/>
                    <xs:element type="xs:string" name="dept"/>
                    <xs:element type="xs:string" name="dept_code_nm"/>
                    <xs:element type="xs:string" name="dept_nm"/>
                    <xs:element type="xs:string" name="up_nm"/>
                    <xs:element type="xs:string" name="up_dept"/>
                    <xs:element type="xs:byte" name="dept_div"/>
                  </xs:sequence>
                </xs:complexType>
              </xs:element>
            </xs:sequence>
          </xs:complexType>
        </xs:element>
        <xs:element name="deptDivList">
          <xs:complexType>
            <xs:sequence>
              <xs:element name="list">
                <xs:complexType>
                  <xs:sequence>
                    <xs:element type="xs:string" name="dept"/>
                    <xs:element type="xs:string" name="dept_nm"/>
                    <xs:element type="xs:string" name="up_dept"/>
                    <xs:element type="xs:short" name="dept_div"/>
                  </xs:sequence>
                </xs:complexType>
              </xs:element>
            </xs:sequence>
          </xs:complexType>
        </xs:element>
        <xs:element name="subDeptList">
          <xs:complexType>
            <xs:sequence>
              <xs:element name="list">
                <xs:complexType>
                  <xs:sequence>
                    <xs:element type="xs:byte" name="prt_ord"/>
                    <xs:element type="xs:string" name="dept"/>
                    <xs:element type="xs:string" name="dept_code_nm"/>
                    <xs:element type="xs:string" name="dept_nm"/>
                    <xs:element type="xs:string" name="up_nm"/>
                    <xs:element type="xs:string" name="up_dept"/>
                    <xs:element type="xs:byte" name="dept_div"/>
                    <xs:element type="xs:string" name="colg"/>
                    <xs:element type="xs:string" name="colg_nm"/>
                  </xs:sequence>
                </xs:complexType>
              </xs:element>
            </xs:sequence>
          </xs:complexType>
        </xs:element>
      </xs:sequence>
    </xs:complexType>
  </xs:element>
</xs:schema>
 */
@ToString
@Getter
@Setter
@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.NONE)
public class DepartmentResponse {


    @XmlElement(name = "deptList")
    private DeptList deptList;

    @XmlElement(name = "deptDivList")
    private DeptDivList deptDivList;

    @XmlElement(name = "subDeptList")
    private SubDeptList subDeptList;

    @XmlElement(name = "_COLUMNS_OF_TABLE_TO_TEXT_")
    private String columnsOfTableToText;

    @ToString
    @Getter
    @Setter
    @XmlRootElement(name = "deptList")
    @XmlAccessorType(XmlAccessType.NONE)
    public static class DeptList {
        @XmlElement(name = "list")
        private List<Department> departmentList;

        @ToString
        @Getter
        @Setter
        @XmlAccessorType(XmlAccessType.NONE)
        @XmlRootElement(name = "list")
        public static class Department {
            @XmlElement(name = "prt_ord")
            private String prtOrd;

            @XmlElement(name = "dept")
            private String dept;

            @XmlElement(name = "dept_code_nm")
            private String deptCodeNm;

            @XmlElement(name = "dept_nm")
            private String deptNm;

            @XmlElement(name = "up_nm")
            private String upNm;

            @XmlElement(name = "up_dept")
            private String upDept;

            @XmlElement(name = "dept_div")
            private String deptDiv;
        }
    }


    @ToString
    @Getter
    @Setter
    @XmlRootElement(name = "deptDivList")
    @XmlAccessorType(XmlAccessType.NONE)
    public static class DeptDivList {
        @XmlElement(name = "list")
        private List<DepartmentDivision> departmentDivisionList;


        @ToString
        @Getter
        @Setter
        @XmlAccessorType(XmlAccessType.NONE)
        @XmlRootElement(name = "list")
        public static class DepartmentDivision {
            @XmlElement(name = "dept")
            private String dept;

            @XmlElement(name = "dept_nm")
            private String deptNm;

            @XmlElement(name = "up_dept")
            private String upDept;

            @XmlElement(name = "dept_div")
            private String deptDiv;
        }
    }

    @ToString
    @Getter
    @Setter
    @XmlRootElement(name = "subDeptList")
    @XmlAccessorType(XmlAccessType.NONE)
    public static class SubDeptList {
        @XmlElement(name = "list")
        private List<SubDepartment> subDepartmentList;

        @ToString
        @Getter
        @Setter
        @XmlAccessorType(XmlAccessType.FIELD)
        public static class SubDepartment {
            private String prt_ord = "";

            private String dept = "";

            private String dept_code_nm = "";

            private String dept_nm = "";

            private String up_nm = "";

            private String up_dept = "";

            private String dept_div = "";

            private String colg = "";

            private String colg_nm = "";
        }
    }
}




