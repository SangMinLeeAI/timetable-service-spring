package uoslife.timetableservicespring.wise.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uoslife.timetableservicespring.wise.client.WiseClient;
import uoslife.timetableservicespring.wise.dto.DepartmentResponse;
import uoslife.timetableservicespring.wise.dto.MajorSubjectResponse;

@Service
@Slf4j
public class WiseFeignService {

    @Autowired
    private WiseClient wiseClient;

    public MajorSubjectResponse getMajorSubjects(String apiKey,
                                                 String year,
                                                 String term,
                                                 String deptDiv,
                                                 String dept,
                                                 String subDept) {
        return wiseClient.getMajorSubjects(
                apiKey,
                year,
                term,
                deptDiv,
                dept,
                subDept);
    }

    public DepartmentResponse getDepartments(String apiKey,
                                             String OpenYn) {
        return wiseClient.getDepartments(
                apiKey,
                OpenYn);
    }
}
