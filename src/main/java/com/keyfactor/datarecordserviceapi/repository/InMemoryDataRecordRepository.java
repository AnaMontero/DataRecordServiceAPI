package com.keyfactor.datarecordserviceapi.repository;

import com.keyfactor.datarecordserviceapi.model.DataRecord;
import com.keyfactor.datarecordserviceapi.model.ServerDateTime;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryDataRecordRepository implements DataRecordRepository {
    private List<DataRecord> dataRecords = new ArrayList<>();

    @Override
    public DataRecord[] getRecords(ServerDateTime notBefore, ServerDateTime notAfter, int recordLimit) {
        return dataRecords.toArray(new DataRecord[0]);
    }

    @Override
    public void save(DataRecord dataRecord) {
        dataRecords.add(dataRecord);
    }
}