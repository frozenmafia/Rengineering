package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import java.util.List;
import java.util.Map;
import o.AsyncListUtil;
import o.postponeAndUpdateViewHolders;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class RtspHeaders {
    public static final String ACCEPT = "Accept";
    public static final String ALLOW = "Allow";
    public static final String AUTHORIZATION = "Authorization";
    public static final String BANDWIDTH = "Bandwidth";
    public static final String BLOCKSIZE = "Blocksize";
    public static final String CACHE_CONTROL = "Cache-Control";
    public static final String CONNECTION = "Connection";
    public static final String CONTENT_BASE = "Content-Base";
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_LANGUAGE = "Content-Language";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String CONTENT_LOCATION = "Content-Location";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CSEQ = "CSeq";
    public static final String DATE = "Date";
    public static final RtspHeaders EMPTY = new Builder().build();
    public static final String EXPIRES = "Expires";
    public static final String LOCATION = "Location";
    public static final String PROXY_AUTHENTICATE = "Proxy-Authenticate";
    public static final String PROXY_REQUIRE = "Proxy-Require";
    public static final String PUBLIC = "Public";
    public static final String RANGE = "Range";
    public static final String RTCP_INTERVAL = "RTCP-Interval";
    public static final String RTP_INFO = "RTP-Info";
    public static final String SCALE = "Scale";
    public static final String SESSION = "Session";
    public static final String SPEED = "Speed";
    public static final String SUPPORTED = "Supported";
    public static final String TIMESTAMP = "Timestamp";
    public static final String TRANSPORT = "Transport";
    public static final String USER_AGENT = "User-Agent";
    public static final String VIA = "Via";
    public static final String WWW_AUTHENTICATE = "WWW-Authenticate";
    private final ImmutableListMultimap<String, String> namesAndValues;

    /* loaded from: classes5.dex */
    public static final class Builder {
        private final ImmutableListMultimap.valueOf<String, String> namesAndValuesBuilder;

        public Builder() {
            this.namesAndValuesBuilder = new ImmutableListMultimap.valueOf<>();
        }

        public Builder(String str, String str2, int i) {
            this();
            add("User-Agent", str);
            add(RtspHeaders.CSEQ, String.valueOf(i));
            if (str2 != null) {
                add(RtspHeaders.SESSION, str2);
            }
        }

        private Builder(ImmutableListMultimap.valueOf<String, String> valueof) {
            this.namesAndValuesBuilder = valueof;
        }

        public Builder add(String str, String str2) {
            this.namesAndValuesBuilder.values(RtspHeaders.convertToStandardHeaderName(str.trim()), str2.trim());
            return this;
        }

        public Builder addAll(List<String> list) {
            for (int i = 0; i < list.size(); i++) {
                String[] splitAtFirst = Util.splitAtFirst(list.get(i), ":\\s?");
                if (splitAtFirst.length == 2) {
                    add(splitAtFirst[0], splitAtFirst[1]);
                }
            }
            return this;
        }

        public Builder addAll(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                add(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public RtspHeaders build() {
            return new RtspHeaders(this);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RtspHeaders) {
            return this.namesAndValues.equals(((RtspHeaders) obj).namesAndValues);
        }
        return false;
    }

    public int hashCode() {
        return this.namesAndValues.hashCode();
    }

    public Builder buildUpon() {
        ImmutableListMultimap.valueOf valueof = new ImmutableListMultimap.valueOf();
        valueof.ag$a(this.namesAndValues);
        return new Builder(valueof);
    }

    public ImmutableListMultimap<String, String> asMultiMap() {
        return this.namesAndValues;
    }

    public String get(String str) {
        ImmutableList<String> values = values(str);
        if (values.isEmpty()) {
            return null;
        }
        return (String) AsyncListUtil.DataCallback.valueOf(values);
    }

    public ImmutableList<String> values(String str) {
        return this.namesAndValues.get((ImmutableListMultimap<String, String>) convertToStandardHeaderName(str));
    }

    private RtspHeaders(Builder builder) {
        this.namesAndValues = builder.namesAndValuesBuilder.ah$a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String convertToStandardHeaderName(String str) {
        return postponeAndUpdateViewHolders.values(str, "Accept") ? "Accept" : postponeAndUpdateViewHolders.values(str, "Allow") ? "Allow" : postponeAndUpdateViewHolders.values(str, "Authorization") ? "Authorization" : postponeAndUpdateViewHolders.values(str, BANDWIDTH) ? BANDWIDTH : postponeAndUpdateViewHolders.values(str, BLOCKSIZE) ? BLOCKSIZE : postponeAndUpdateViewHolders.values(str, "Cache-Control") ? "Cache-Control" : postponeAndUpdateViewHolders.values(str, "Connection") ? "Connection" : postponeAndUpdateViewHolders.values(str, CONTENT_BASE) ? CONTENT_BASE : postponeAndUpdateViewHolders.values(str, "Content-Encoding") ? "Content-Encoding" : postponeAndUpdateViewHolders.values(str, "Content-Language") ? "Content-Language" : postponeAndUpdateViewHolders.values(str, "Content-Length") ? "Content-Length" : postponeAndUpdateViewHolders.values(str, "Content-Location") ? "Content-Location" : postponeAndUpdateViewHolders.values(str, "Content-Type") ? "Content-Type" : postponeAndUpdateViewHolders.values(str, CSEQ) ? CSEQ : postponeAndUpdateViewHolders.values(str, "Date") ? "Date" : postponeAndUpdateViewHolders.values(str, "Expires") ? "Expires" : postponeAndUpdateViewHolders.values(str, "Location") ? "Location" : postponeAndUpdateViewHolders.values(str, "Proxy-Authenticate") ? "Proxy-Authenticate" : postponeAndUpdateViewHolders.values(str, PROXY_REQUIRE) ? PROXY_REQUIRE : postponeAndUpdateViewHolders.values(str, PUBLIC) ? PUBLIC : postponeAndUpdateViewHolders.values(str, "Range") ? "Range" : postponeAndUpdateViewHolders.values(str, RTP_INFO) ? RTP_INFO : postponeAndUpdateViewHolders.values(str, RTCP_INTERVAL) ? RTCP_INTERVAL : postponeAndUpdateViewHolders.values(str, SCALE) ? SCALE : postponeAndUpdateViewHolders.values(str, SESSION) ? SESSION : postponeAndUpdateViewHolders.values(str, SPEED) ? SPEED : postponeAndUpdateViewHolders.values(str, SUPPORTED) ? SUPPORTED : postponeAndUpdateViewHolders.values(str, TIMESTAMP) ? TIMESTAMP : postponeAndUpdateViewHolders.values(str, TRANSPORT) ? TRANSPORT : postponeAndUpdateViewHolders.values(str, "User-Agent") ? "User-Agent" : postponeAndUpdateViewHolders.values(str, "Via") ? "Via" : postponeAndUpdateViewHolders.values(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }
}
