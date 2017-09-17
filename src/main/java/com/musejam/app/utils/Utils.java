package com.musejam.app.utils;

import javax.validation.constraints.NotNull;

import com.musejam.app.dto.AppError;
import com.musejam.app.dto.AppResult;

import java.util.ArrayList;
import java.util.List;

public class Utils {


    public static void setException(@NotNull Exception exception,@NotNull AppError datuxError, @NotNull AppResult datuxResult) {
        if ((exception != null) && (!StringUtils.isNull(exception.getMessage()))) {
            datuxError = new AppError(exception.getMessage(), datuxError.getErrorCode());
        } else {
            datuxError = new AppError(datuxError.getErrorMessage(), datuxError.getErrorCode());
        }
        List<AppError> errors = new ArrayList<>();
        errors.add(datuxError);
        datuxResult.setErrors(errors);
    }


}
