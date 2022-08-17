package com.antsilo.ahttpdemo;

import java.util.List;

/**
 * @author antsilo
 * @email chezi008@qq.com
 * @date 2022/8/17 9:09
 * @description:
 */
public class HttpResp {
    public Boolean error;
    public List<Result> results;


    public static class Result {
        public String _id;
        public String createdAt;
        public String desc;
        public String publishedAt;
        public String source;
        public String type;
        public String url;
        public Boolean used;
        public String who;
    }
}
