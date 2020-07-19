package com.clark.network;


import java.util.HashMap;
public interface INetworkRequestInfo {
    HashMap<String, String> getRequestHeaderMap();
    boolean isDebug();
}
