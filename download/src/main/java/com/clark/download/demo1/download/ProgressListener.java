package com.clark.download.demo1.download;

public interface ProgressListener {
    void update(String url, long bytesRead, long contentLength, boolean done);
}