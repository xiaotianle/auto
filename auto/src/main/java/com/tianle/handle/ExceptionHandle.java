package com.tianle.handle;

import com.tianle.domain.Result;
import com.tianle.exception.UserException;
import com.tianle.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by win7 on 2017/6/21.
 */

@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){

        if( e instanceof UserException) {
            UserException ue = (UserException) e;
            return ResultUtil.error(ue.getCode(),ue.getMessage());
        }
        else {
            return ResultUtil.error(-1, "未知错误");
        }
    }
}
