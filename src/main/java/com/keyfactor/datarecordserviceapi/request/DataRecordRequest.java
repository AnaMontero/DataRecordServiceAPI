package com.keyfactor.datarecordserviceapi.request;

import java.time.LocalDate;

public class DataRecordRequest {
    private LocalDate startDate;
    private LocalDate endDate;
    private int pageNumber;
    private int resultsPerPage;

    public DataRecordRequest(LocalDate startDate, LocalDate endDate, int pageNumber, int resultsPerPage) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.pageNumber = pageNumber;
        this.resultsPerPage = resultsPerPage;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getResultsPerPage() {
        return resultsPerPage;
    }
}
