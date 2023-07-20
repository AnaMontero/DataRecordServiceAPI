package com.keyfactor.datarecordserviceapi.repository;

import com.keyfactor.datarecordserviceapi.model.DataRecord;
import com.keyfactor.datarecordserviceapi.model.ServerDateTime;

public interface DataRecordRepository {
    DataRecord[] getRecords(ServerDateTime notBefore, ServerDateTime notAfter, int recordLimit);
    void save(DataRecord dataRecord);
}
