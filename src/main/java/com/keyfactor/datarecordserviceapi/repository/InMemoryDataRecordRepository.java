package com.keyfactor.datarecordserviceapi.repository;

import com.keyfactor.datarecordserviceapi.model.DataRecord;
import com.keyfactor.datarecordserviceapi.model.DataRecordGenerator;
import com.keyfactor.datarecordserviceapi.model.ServerDateTime;
import com.keyfactor.datarecordserviceapi.service.DataRecordFilter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryDataRecordRepository implements DataRecordRepository {
    private List<DataRecord> dataRecords = DataRecordGenerator.generateDataRecords(300);

    @Override
    public DataRecord[] getRecords(ServerDateTime notBefore, ServerDateTime notAfter, int recordLimit) {
        var orderedData = DataRecordFilter.filterDataRecordsByDate(dataRecords, notBefore, notAfter);

        return orderedData.toArray(new DataRecord[0]);
    }
}