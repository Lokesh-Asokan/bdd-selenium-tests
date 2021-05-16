package com.test.lokesh.utils;

public class URLMapper {

    private static String BASEURL = ReadProperties.getFromPropertyFile("base_URL");
    private static String LOGINURL = ReadProperties.getFromPropertyFile("login_URL");
    private static String GALLERYURL = ReadProperties.getFromPropertyFile("gallery_URL");
    private static String MYACCOUNTURL = ReadProperties.getFromPropertyFile("myaccount_URL");
    private static String LOGOUTURL = ReadProperties.getFromPropertyFile("logout_URL");


    public static String urlBuilder(String url){

        String getUrl;
        switch(url){
            case "base":
                getUrl = BASEURL;
                break;
            case "login":
                getUrl = BASEURL +LOGINURL;
                break;
            case "gallery":
                getUrl = BASEURL + GALLERYURL;
                break;
            case "myaccount":
                getUrl = BASEURL + MYACCOUNTURL;
                break;
            default:
                throw new IllegalArgumentException("Invalid url parameter" + url);
        }
        return getUrl;
    }

}
