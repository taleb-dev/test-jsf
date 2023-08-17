package com.example.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PortService {

    // dump data for testing
    public static Map<String,Integer> getLuPortList(){
        Map<String,Integer> luPortMap = new HashMap<>();
        luPortMap.put("taleb",1);
        luPortMap.put("omer",2);
        luPortMap.put("kaled",3);
        return luPortMap;
    }

    public static LuPort getById(Integer id){
        Map<Integer,LuPort> luPortMap = new HashMap<>();
        luPortMap.put(1,new LuPort(1,"taleb"));
        luPortMap.put(2,new LuPort(2,"omer"));
        luPortMap.put(3,new LuPort(3,"kaled"));
        return luPortMap.get(id);
    }
}
