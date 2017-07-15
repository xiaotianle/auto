package com.tianle.utils;

import java.util.Arrays;
import java.util.*;

/**
 * Created by win7 on 2017/6/20.
 */
public class CommonUtil {

    public String [] sort(String [] arrs){


        return null;
    }

    public static void main(String [] args){

        String [] arr = {
                "/d/20170505001/empno.txt.Z",
                "/d/20170505001/empno_sc.txt.Z",
                "/d/20170505001/rlship.txt.Z",
                "/d/20170503001/rlship.txt.Z",
                "/d/20170503001/empno_sc.txt.Z",
                "/d/20170504001/rlship.txt.Z",
                "/d/20170504001/empno_sc.txt.Z"
        };
        

        Arrays.sort(arr);

        for (String s : arr
             ) {
            System.out.println(s);

        }

    }
}
