package com.buyi.common.utils;

import org.junit.Before;
import org.junit.Test;

public class TokenUtilTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void createJWT() {
        String zs = TokenUtil.createJWS(2, "zs");
        System.out.println(zs);
        TokenUtil.verifyToken(zs);
    }

    @Test
    public void verifyToken() {
        TokenUtil.verifyToken("eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJidXlpIiwic3ViIjoiYWNjb3VudC1tYW5hZ2VtZW50IGp3cyIsImF1ZCI6IjIiLCJleHAiOjE1NDAwMjAxODEsImp0aSI6IjhhY2VkMjBmLTU4OGUtNGRjYi05YzAzLWZlMDI3M2UyYjQzNyIsIm5hbWUiOiJ6cyJ9.ZdGgL1nKvMMFFheOfEdRC2NDVFc-VnjOow-evJNnUZLQD3qHrdHKZ5zsipPB7gdpxb9HWXYzMuw2hqdqQh_dGA");
    }
}