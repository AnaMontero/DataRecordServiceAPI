package com.keyfactor.datarecordserviceapi.service;

import com.keyfactor.datarecordserviceapi.model.DataRecord;
import com.keyfactor.datarecordserviceapi.model.ServerDateTime;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DataRecordFilterShould {

    @Test
    void returnFilteredRecords() {
        List<DataRecord> dataRecords = generateTestData();
        ServerDateTime startDate = ServerDateTime.toServerDateTime(LocalDate.of(2020, 1, 1));
        ServerDateTime endDate = ServerDateTime.toServerDateTime(LocalDate.of(2023, 1, 15));

        List<DataRecord> filteredRecords = DataRecordFilter.filterDataRecordsByDate(dataRecords, startDate, endDate);

        assertThat(filteredRecords).hasSize(2);
    }

    @Test
    void returnEmptyListIfNoMatches() {
        List<DataRecord> dataRecords = generateTestData();
        ServerDateTime startDate = ServerDateTime.toServerDateTime(LocalDate.of(2022, 12, 1));
        ServerDateTime endDate = ServerDateTime.toServerDateTime(LocalDate.of(2022, 12, 31));

        List<DataRecord> filteredRecords = DataRecordFilter.filterDataRecordsByDate(dataRecords, startDate, endDate);

        assertThat(filteredRecords).isEmpty();
    }

    private List<DataRecord> generateTestData() {
        List<DataRecord> dataRecords = new ArrayList<>();


        dataRecords.add(new DataRecord(1, ServerDateTime.toServerDateTime(LocalDate.of(2023, 1, 16)), new byte[5]));
        dataRecords.add(new DataRecord(2, ServerDateTime.toServerDateTime(LocalDate.of(2020, 12, 13)), new byte[5]));
        dataRecords.add(new DataRecord(3, ServerDateTime.toServerDateTime(LocalDate.of(2013, 3, 30)), new byte[5]));
        dataRecords.add(new DataRecord(4, ServerDateTime.toServerDateTime(LocalDate.of(2021, 6, 15)), new byte[5]));
        dataRecords.add(new DataRecord(5, ServerDateTime.toServerDateTime(LocalDate.of(2015, 9, 4)), new byte[5]));

        return dataRecords;
    }
}