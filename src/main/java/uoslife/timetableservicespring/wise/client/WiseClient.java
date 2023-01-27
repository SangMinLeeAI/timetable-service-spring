package uoslife.timetableservicespring.wise.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import uoslife.timetableservicespring.wise.dto.ConvergenceSubjectResponse;
import uoslife.timetableservicespring.wise.dto.CultureSubjectResponse;
import uoslife.timetableservicespring.wise.dto.DepartmentResponse;
import uoslife.timetableservicespring.wise.dto.MajorSubjectResponse;

@FeignClient(name = "wise",
        url = "https://wise.uos.ac.kr/uosdoc",
        configuration = WiseConfiguration.class)
public interface WiseClient {

    /**
     * 전공 과목 조회 apiKey year term deptDiv dept subDept
     *
     * @return MajorSubjectResponse
     */
    @RequestMapping(method = RequestMethod.GET, value = "/api.ApiUcrMjTimeInq.oapi")
    MajorSubjectResponse getMajorSubjects(@RequestParam("apiKey") String apiKey,
                                          @RequestParam("year") String year,
                                          @RequestParam("term") String term,
                                          @RequestParam("deptDiv") String deptDiv,
                                          @RequestParam("dept") String dept,
                                          @RequestParam("subDept") String subDept);

    /**
     * 교양과목 조회 apiKey year term subjectDiv
     *
     * @return CultureSubjectResponse
     */
    @RequestMapping(method = RequestMethod.GET, value = "/api.ApiUcrCultTimeInq.oapi")
    CultureSubjectResponse getCultureSubjects(@RequestParam("apiKey") String apiKey,
                                              @RequestParam("year") String year,
                                              @RequestParam("term") String term,
                                              @RequestParam("subjectDiv") String subjectDiv);

    /**
     * 융복합 과목 조회 apiKey year term deptDiv dept
     *
     * @return ConvergenceSubjectResponse
     */
    @RequestMapping(method = RequestMethod.GET, value = "/api.ApiUcrCnvTimeInq.oapi")
    ConvergenceSubjectResponse getConvergenceSubjects(@RequestParam("apiKey") String apiKey,
                                                      @RequestParam("year") String year,
                                                      @RequestParam("term") String term,
                                                      @RequestParam("deptDiv") String deptDiv,
                                                      @RequestParam("dept") String dept);

    /**
     * 부서 조회 apiKey openYn
     *
     * @return DepartmentResponse
     */
    @RequestMapping(method = RequestMethod.GET, value = "/api.ApiApiDeptList.oapi")
    DepartmentResponse getDepartments(@RequestParam("apiKey") String apiKey,
                                      @RequestParam("openYn") String openYn);
}
