package com.fancode.livestream.type;
/* loaded from: classes4.dex */
public enum NetworkProtocol {
    HTTP3(com.fancode.video.models.NetworkProtocol.HTTP3),
    HTTP2(com.fancode.video.models.NetworkProtocol.HTTP2),
    HTTP1("HTTP1"),
    $UNKNOWN("$UNKNOWN");
    
    private final String rawValue;

    NetworkProtocol(String str) {
        this.rawValue = str;
    }

    public String rawValue() {
        return this.rawValue;
    }

    public static NetworkProtocol safeValueOf(String str) {
        NetworkProtocol[] values;
        for (NetworkProtocol networkProtocol : values()) {
            if (networkProtocol.rawValue.equals(str)) {
                return networkProtocol;
            }
        }
        return $UNKNOWN;
    }
}
