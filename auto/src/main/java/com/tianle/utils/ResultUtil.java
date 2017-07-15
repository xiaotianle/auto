package com.tianle.utils;

import com.tianle.domain.Result;

/**
 * Created by win7 on 2017/5/4.
 */
public class ResultUtil {

    public static Result success(Object object)
    {
        Result result = new Result();
        result.setCode(1);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result error(Integer code, String msg)
    {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

}
