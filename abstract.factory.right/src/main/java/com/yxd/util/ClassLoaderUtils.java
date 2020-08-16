package com.yxd.util;

import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @author yangxudong
 * @description:
 * @date 2020/8/16 19:54
 */
public class ClassLoaderUtils {
    private static final Set<Class> primitveSet = new HashSet<>();

    static{
        primitveSet.add(Integer.class);
        primitveSet.add(Long.class);
        primitveSet.add(Float.class);
        primitveSet.add(Byte.class);
        primitveSet.add(Double.class);
        primitveSet.add(Short.class);
        primitveSet.add(Boolean.class);
        primitveSet.add(Character.class);
    }

    public static ClassLoader getCurrentClassLoader() {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        if (cl == null) {
            cl = ClassLoaderUtils.class.getClassLoader();
        }
        return cl == null ? ClassLoader.getSystemClassLoader() : cl;
    }

    public static ClassLoader getClassLoader(Class<?> clazz) {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        if (cl != null) {
            return cl;
        }
        if (clazz != null) {
            cl = clazz.getClassLoader();
            return cl;
        }
        return ClassLoader.getSystemClassLoader();
    }

    public static Class forName(String className) throws ClassNotFoundException {
        return forName(className, true);
    }

    private static Class forName(String className, boolean initialize) throws ClassNotFoundException {
        return Class.forName(className, initialize, getCurrentClassLoader());
    }
    public static Class<?>[] getClazzByArgs(Object[] args) {
        Class<?>[] parameterTypes = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof ArrayList) {
                parameterTypes[i] = List.class;
                continue;
            }
            if (args[i] instanceof LinkedList) {
                parameterTypes[i] = List.class;
                continue;
            }
            if (args[i] instanceof HashMap) {
                parameterTypes[i] = Map.class;
                continue;
            }
            if (args[i] instanceof Long){
                parameterTypes[i] = long.class;
                continue;
            }
            if (args[i] instanceof Double){
                parameterTypes[i] = double.class;
                continue;
            }
            if (args[i] instanceof TimeUnit){
                parameterTypes[i] = TimeUnit.class;
                continue;
            }
            parameterTypes[i] = args[i].getClass();
        }
        return parameterTypes;
    }


}
