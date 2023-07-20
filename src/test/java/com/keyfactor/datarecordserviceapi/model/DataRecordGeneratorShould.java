package com.keyfactor.datarecordserviceapi.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DataRecordGeneratorShould {

    @Test
    void returnListOfDataRecords() {
        int numberOfRecords = 5;
        List<DataRecord> dataRecords = DataRecordGenerator.generateDataRecords(numberOfRecords);

        assertThat(dataRecords).isNotNull();
        assertThat(dataRecords).hasSize(numberOfRecords);
    }

    @Test
    void haveUniqueIds() {
        int numberOfRecords = 5;
        List<DataRecord> dataRecords = DataRecordGenerator.generateDataRecords(numberOfRecords);

        assertThat(dataRecords).extracting("ID").doesNotHaveDuplicates();
    }

    @Test
    void haveValidCreationDate() {
        int numberOfRecords = 5;
        List<DataRecord> dataRecords = DataRecordGenerator.generateDataRecords(numberOfRecords);

        assertThat(dataRecords).extracting("CreationDate").isNotNull();
    }
}