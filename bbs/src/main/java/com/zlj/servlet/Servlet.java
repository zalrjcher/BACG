package com.zlj.servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;

public class Servlet  {
    public static void main(String[] args) {
        int [] arr = new int[12];
        for (int i = 0 ; i < arr.length ; i ++){
            arr[i]=i;
        }
        JSONArray platformList = JSON.parseArray("nizhende ad e ");
        System.out.println(platformList.toString());
    }
}
