package com.buyi.common.utils;

import io.jsonwebtoken.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.util.Base64Utils;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Date;
import java.util.UUID;

public class TokenUtil {

    private static Logger logger = LogManager.getLogger(TokenUtil.class);
    private static long expirationTime = 1800000;

    private static final Key key;

    static {
        String strKey = "dddddddddddddddddddddddddddddddddddddddddddddddd";
        SignatureAlgorithm hs256 = SignatureAlgorithm.HS256;
        byte[] encode = Base64Utils.encode(strKey.getBytes());
        key = new SecretKeySpec(encode, hs256.getJcaName());
    }


    private static JwtBuilder getBuilder() {
        return Jwts.builder()
                .setIssuer("buyi")
                .setSubject("account-management jws")
                .signWith(key);
    }

    private static JwtParser getParser() {
        return Jwts.parser()
                .requireIssuer("buyi")
                .setSigningKey(key);
    }

    public static String createJWS(Integer userId, String userName) {
        long millisTime = System.currentTimeMillis();
        Date atDate = new Date(millisTime);

        JwtBuilder builder = getBuilder().setAudience(String.valueOf(userId))
                .setExpiration(new Date(millisTime + expirationTime))
                .setId(String.valueOf(UUID.randomUUID()))
                //.setNotBefore(new Date(millisTime + 3000))
                .claim("name", userName);

        return builder.compact();
    }

    public static void verifyToken(String jws) {
        Jws<Claims> claimsJws;
        try {
            claimsJws = getParser().parseClaimsJws(jws);
            String signature = claimsJws.getSignature();
            System.out.println(signature);
            Claims body = claimsJws.getBody();
            System.out.println();
        } catch (JwtException e) {
            logger.error(e);
        }
    }

}
