package com.keyfactor.datarecordserviceapi.controller;

import com.keyfactor.datarecordserviceapi.model.DataRecord;
import com.keyfactor.datarecordserviceapi.request.DataRecordRequest;
import com.keyfactor.datarecordserviceapi.service.DataRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/data-records")
public class DataRecordController {
    private final DataRecordService dataRecordService;

    @Autowired
    public DataRecordController(DataRecordService dataRecordService) {
        this.dataRecordService = dataRecordService;
    }
    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public DataRecord[] getRecordsByDate(@RequestBody DataRecordRequest userRequest) {
        LocalDate startDate = userRequest.getStartDate();
        LocalDate endDate = userRequest.getEndDate();
        int pageNumber = userRequest.getPageNumber();
        int resultsPerPage = userRequest.getResultsPerPage();

        try {
            return dataRecordService.getRecords(startDate, endDate, pageNumber, resultsPerPage);
        }
        catch (Exception ex) {
            return new DataRecord[0];
        }
    }
}