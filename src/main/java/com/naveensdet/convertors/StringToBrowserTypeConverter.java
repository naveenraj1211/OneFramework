package com.naveensdet.convertors;

import com.naveensdet.enums.BrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.Map;

public class StringToBrowserTypeConverter implements Converter<BrowserType> {


    @Override
    public BrowserType convert(Method method, String browserName) {
        Map<String, BrowserType> map = Map.of("CHROME", BrowserType.CHROME, "FIREFOX", BrowserType.FIREFOX);
        return map.getOrDefault(browserName.toUpperCase(), BrowserType.FIREFOX);
    }
}
