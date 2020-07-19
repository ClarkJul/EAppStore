package com.clark.download.demo1.download;

/**
 * 监听器
 * Created on 2019-10-17
 */
public abstract class DownloadCenterListener {

    public void onStart(ControlCallBack callBack) {

    }

    public void onSuccess(String url) {
    }

    public void onError(String url, Throwable e) {
    }

    public void onDeleted(String url) {

    }

    public void onProgress(String url, long bytesRead, long contentLength, boolean done) {

    }

    public void onPaused(String url) {

    }

}
