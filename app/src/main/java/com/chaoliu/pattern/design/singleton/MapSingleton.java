package com.chaoliu.pattern.design.singleton;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * 容器单例
 *
 */
public class MapSingleton {

    private static Map<String ,Object> objectMap = new HashMap<>(  );

    private MapSingleton(){

    }

    public static void registerService(String key,Object object){
        if (!objectMap.containsKey( key )){
            objectMap.put( key,object );
        }
    }

    public static Object getService(String key){
        return objectMap.get( key );
    }

}