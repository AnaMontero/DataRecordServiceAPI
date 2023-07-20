package com.keyfactor.datarecordserviceapi.service;

import com.keyfactor.datarecordserviceapi.model.DataRecord;
import com.keyfactor.datarecordserviceapi.model.ServerDateTime;

import java.util.List;
import java.util.stream.Collectors;

public class DataRecordFilter {

    public static List<DataRecord> filterDataRecordsByDate(List<DataRecord> dataRecords, ServerDateTime startDate, ServerDateTime endDate) {

        return dataRecords.stream()
                .filter(record -> isDateTimeWithinRange(record.CreationDate, startDate, endDate))
                .collect(Collectors.toList());
    }

    private static boolean isDateTimeWithinRange(ServerDateTime dateTime, ServerDateTime startDate, ServerDateTime endDate) {
        return !dateTime.isBefore(startDate) && !dateTime.isAfter(endDate);
    }
}