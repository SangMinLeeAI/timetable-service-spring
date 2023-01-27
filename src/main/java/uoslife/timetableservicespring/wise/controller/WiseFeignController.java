package uoslife.timetableservicespring.wise.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uoslife.timetableservicespring.wise.dto.DepartmentResponse;
import uoslife.timetableservicespring.wise.dto.MajorSubjectResponse;
import uoslife.timetableservicespring.wise.service.WiseFeignService;

@Slf4j
@RestController
@RequiredArgsConstructor
public class WiseFeignController {

    private final WiseFeignService wiseFeignService;

    @GetMapping("/major-subjects")
    public MajorSubjectResponse getMajorSubjects(@RequestParam String apiKey,
                                                 @RequestParam String year,
                                                 @RequestParam String term,
                                                 @RequestParam String deptDiv,
                                                 @RequestParam String dept,
                                                 @RequestParam String subDept) {
        return wiseFeignService.getMajorSubjects(apiKey, year, term, deptDiv, dept, subDept);
    }

    @GetMapping("/departments")
    public DepartmentResponse getDepartments(@RequestParam String apiKey,
                                             @RequestParam String openYn) {
        return wiseFeignService.getDepartments(apiKey, openYn);
    }
}

