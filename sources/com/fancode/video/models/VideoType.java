package com.fancode.video.models;

import com.google.android.exoplayer2.util.MimeTypes;
import java.net.URL;
import java.util.Locale;
/* loaded from: classes4.dex */
public enum VideoType {
    UNKNOWN("UNKNOWN"),
    MP4(MimeTypes.VIDEO_MP4),
    HLS("application/vnd.apple.mpegurl"),
    FLV(MimeTypes.VIDEO_FLV),
    WVM("video/wvm"),
    DASH(MimeTypes.APPLICATION_MPD);
    
    private final String value;

    VideoType(String str) {
        this.value = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    public static VideoType getVideoType(String str, String str2) {
        VideoType videoType = MP4;
        if (videoType.toString().equals(str)) {
            return videoType;
        }
        VideoType videoType2 = HLS;
        if (videoType2.toString().equals(str)) {
            return videoType2;
        }
        VideoType videoType3 = FLV;
        if (videoType3.toString().equals(str)) {
            return videoType3;
        }
        VideoType videoType4 = WVM;
        if (videoType4.toString().equals(str)) {
            return videoType4;
        }
        VideoType videoType5 = DASH;
        return (videoType5.toString().equals(str) || "video/mpeg-dash".equals(str)) ? videoType5 : inferVideoType(str2);
    }

    private static VideoType inferVideoType(String str) {
        VideoType videoType;
        VideoType videoType2 = UNKNOWN;
        if (str != null) {
            try {
                if (str.isEmpty()) {
                    return videoType2;
                }
                URL url = new URL(str);
                String lowerCase = (url.getProtocol() + "://" + url.getHost() + url.getPath()).toLowerCase(Locale.US);
                if (lowerCase.endsWith(".mpd")) {
                    videoType = DASH;
                } else if (lowerCase.endsWith(".m3u8")) {
                    videoType = HLS;
                } else if (!lowerCase.matches("\".*\\\\.ism(l)?(/manifest(\\\\(.+\\\\))?)?\"")) {
                    return videoType2;
                } else {
                    videoType = WVM;
                }
                return videoType;
            } catch (Exception unused) {
                return videoType2;
            }
        }
        return videoType2;
    }
}
