package org.sid.authservice.sec;

public class JWTUtil {
    public static final String SECRET = "mySecret1234";
    public static final String AUTH_HEADER = "authorization";
    public static final String PREFIXE = "Bearer ";
    public static final long EXPIRE_ACCESS_TOKEN = 2*60*1000 ;
    public static final long EXPIRE_REFRESH_TOKEN = 15*60*1000 ;
    public static final String END_POINT = "/refreshToken";
}
