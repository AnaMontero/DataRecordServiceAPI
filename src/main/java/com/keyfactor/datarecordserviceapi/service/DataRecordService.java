package com.keyfactor.datarecordserviceapi.service;

import com.keyfactor.datarecordserviceapi.model.DataRecord;
import com.keyfactor.datarecordserviceapi.repository.InMemoryDataRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DataRecordService {
    private final InMemoryDataRecordRepository dataRecordRepository;

    @Autowired
    public DataRecordService(InMemoryDataRecordRepository dataRecordRepository) {
        this.dataRecordRepository = dataRecordRepository;
    }

    public DataRecord[] getRecords(LocalDate startDate, LocalDate endDate, int pageNumber, int resultsPerPage) {

        return new DataRecord[0];
    }
}