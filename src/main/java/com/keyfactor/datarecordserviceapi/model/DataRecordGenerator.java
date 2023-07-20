package com.keyfactor.datarecordserviceapi.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataRecordGenerator {

    public static List<DataRecord> generateDataRecords(int numberOfRecords) {
        List<DataRecord> dataRecords = new ArrayList<>();

        for (int i = 0; i < numberOfRecords; i++) {
            DataRecord record = new DataRecord();
            record.ID = i + 1;
            record.CreationDate = generateCreationDate();
            record.Data = generateRandomData();
            dataRecords.add(record);
        }

        return dataRecords;
    }

    private static ServerDateTime generateCreationDate() {
        int randomYear = generateRandomNumber(2010, 2022);
        int randomMonth = generateRandomNumber(1, 12);
        int randomDay = generateRandomNumber(1, 28);
        LocalDate creationDate = LocalDate.of(randomYear, randomMonth, randomDay);
        return ServerDateTime.toServerDateTime(creationDate);
    }

    private static byte[] generateRandomData() {
        byte[] data = new byte[1024];
        new Random().nextBytes(data);
        return data;
    }

    private static int generateRandomNumber(int min, int max) {
        if (min < max) {
            Random random = new Random();
            return random.nextInt(max - min + 1) + min;
        }
        return 1;
    }
}