package com.musejam.app.helper;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import com.musejam.app.dto.AppError;
import com.musejam.app.dto.AppResult;

@Component
@EnableAsync
public class ResultHelper {

	public AppResult setResult(@NotNull Object result){
		AppResult appResult=new AppResult();
		appResult.setResult(result);
		return appResult;
	}
	
	public AppResult setResultAndError(@NotNull Object result,@NotNull List<AppError> errors){
		AppResult appResult=new AppResult();
		appResult.setResult(result);
		appResult.setErrors(errors);
		return appResult;
	}
	
	public List<AppError> setErrors(@NotNull String errorMessage,@NotNull int errorCode){
		List<AppError> errors=new ArrayList<>();
		AppError appError=new AppError(errorMessage, errorCode);
		errors.add(appError);
		return errors;
	}
	
}
