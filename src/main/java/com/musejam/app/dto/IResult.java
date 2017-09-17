package com.musejam.app.dto;

import java.io.Serializable;
import java.util.List;

public interface IResult extends Serializable{

    public List<AppError> getErrors();

    public Object getResult();

    public long getTotalResultCount();

}
