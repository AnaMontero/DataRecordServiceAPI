package com.keyfactor.datarecordserviceapi.service;

import com.keyfactor.datarecordserviceapi.model.DataRecord;
import com.keyfactor.datarecordserviceapi.model.ServerDateTime;
import com.keyfactor.datarecordserviceapi.repository.InMemoryDataRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class DataRecordService {
    private final InMemoryDataRecordRepository dataRecordRepository;

    @Autowired
    public DataRecordService(InMemoryDataRecordRepository dataRecordRepository) {
        this.dataRecordRepository = dataRecordRepository;
    }

    public DataRecord[] getRecords(LocalDate startDate, LocalDate endDate, int pageNumber, int resultsPerPage) {

        ServerDateTime recordDataStartDate = ServerDateTime.toServerDateTime(startDate);
        ServerDateTime recordDataEndDate = ServerDateTime.toServerDateTime(endDate);

        var dataRecords = dataRecordRepository.getRecords(recordDataStartDate, recordDataEndDate, resultsPerPage);
        var firstItem = pageNumber * resultsPerPage;

        List<DataRecord> pageRecords = new ArrayList<>();

        for(int i = 0; i < resultsPerPage; i++){
            firstItem += i;
            pageRecords.add(dataRecords[firstItem]);
        }

        return pageRecords.toArray(new DataRecord[0]);
    }
}