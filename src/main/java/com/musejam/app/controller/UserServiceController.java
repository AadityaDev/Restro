package com.musejam.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.musejam.app.constants.MusejamErrors;
import com.musejam.app.dto.AppError;
import com.musejam.app.dto.AppResult;
import com.musejam.app.dto.IResult;
import com.musejam.app.dto.UserDto;
import com.musejam.app.model.User;
import com.musejam.app.repository.IUserRepository;
import com.musejam.app.utils.StringUtils;
import com.musejam.app.utils.Utils;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserServiceController {

    @Autowired
    private IUserRepository repository;
    @Autowired
    private Environment environment;

    @RequestMapping(value = "/user/signup", method = RequestMethod.POST)
    @ResponseBody
    public IResult createUser(@RequestBody UserDto userDto) {

        AppResult datuxResult = new AppResult();
        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setAuthToken("1234567");
        try {
            repository.save(user);
            datuxResult.setResult(repository.findUserByEmail(user.getEmail()));
        } catch (Exception e) {
            Utils.setException(e, new AppError(StringUtils.isNull(e.getMessage()) ? MusejamErrors.Exception.getDescription() : e.getMessage(), MusejamErrors.Exception.getCode()),
                    datuxResult);
        } finally {
            return datuxResult;
        }
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @ResponseBody
    public IResult authenticateUser(@RequestBody UserDto userDto) {
        AppResult datuxResult = new AppResult();
        try {
            User user1 = repository.findByEmailAndPassword(userDto.getEmail(), userDto.getPassword());
            datuxResult.setResult(user1);
        } catch (Exception e) {
            AppError datuxError = new AppError(e.getMessage(), 1);
            List<AppError> errors = new ArrayList<>();
            errors.add(datuxError);
            datuxResult.setErrors(errors);
        } finally {
            return datuxResult;
        }
    }

    @RequestMapping(value = "/user/details", method = RequestMethod.POST)
    @ResponseBody
    public IResult getUserDetails(@RequestBody UserDto userDto) {

        AppResult datuxResult = new AppResult();
        User user = new User();
        try {
            user = repository.findUserByEmail(userDto.getEmail());
            datuxResult.setResult(user);
        } catch (Exception e) {
            Utils.setException(e, new AppError(StringUtils.isNull(e.getMessage()) ? MusejamErrors.Exception.getDescription() : e.getMessage(), MusejamErrors.Exception.getCode()),
                    datuxResult);
        } finally {
            return datuxResult;
        }
    }

}
