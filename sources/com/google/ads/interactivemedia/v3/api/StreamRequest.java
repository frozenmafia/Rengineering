package com.google.ads.interactivemedia.v3.api;

import java.util.Map;
/* loaded from: classes4.dex */
public interface StreamRequest {

    /* loaded from: classes4.dex */
    public enum StreamFormat {
        DASH,
        HLS
    }

    Map<String, String> getAdTagParameters();

    String getApiKey();

    String getAssetKey();

    String getAuthToken();

    String getContentSourceId();

    String getContentUrl();

    String getCustomAssetKey();

    boolean getEnableNonce();

    StreamFormat getFormat();

    String getLiveStreamEventId();

    String getManifestSuffix();

    String getNetworkCode();

    String getOAuthToken();

    String getProjectNumber();

    String getRegion();

    String getStreamActivityMonitorId();

    Boolean getUseQAStreamBaseUrl();

    Object getUserRequestContext();

    String getVideoId();

    void setAdTagParameters(Map<String, String> map);

    void setAuthToken(String str);

    void setContentUrl(String str);

    void setEnableNonce(boolean z);

    void setFormat(StreamFormat streamFormat);

    void setManifestSuffix(String str);

    void setStreamActivityMonitorId(String str);

    void setUseQAStreamBaseUrl(Boolean bool);

    void setUserRequestContext(Object obj);
}
