package com.keyfactor.datarecordserviceapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataRecord {
    public int ID;

    public ServerDateTime CreationDate;

    public byte[] Data;
}