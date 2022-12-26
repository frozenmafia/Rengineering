package com.fancode.video.models;

import o.runAnimators;
/* loaded from: classes.dex */
public final class VideoTrackInfo {
    private final int bitrate;
    private final String codecs;
    private final int height;
    private final int trackId;
    private final int width;

    public static /* synthetic */ VideoTrackInfo copy$default(VideoTrackInfo videoTrackInfo, int i, String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = videoTrackInfo.trackId;
        }
        if ((i5 & 2) != 0) {
            str = videoTrackInfo.codecs;
        }
        String str2 = str;
        if ((i5 & 4) != 0) {
            i2 = videoTrackInfo.width;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = videoTrackInfo.bitrate;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = videoTrackInfo.height;
        }
        return videoTrackInfo.copy(i, str2, i6, i7, i4);
    }

    public final int component1() {
        return this.trackId;
    }

    public final String component2() {
        return this.codecs;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.bitrate;
    }

    public final int component5() {
        return this.height;
    }

    public final VideoTrackInfo copy(int i, String str, int i2, int i3, int i4) {
        runAnimators.ag$a(str, "codecs");
        return new VideoTrackInfo(i, str, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoTrackInfo) {
            VideoTrackInfo videoTrackInfo = (VideoTrackInfo) obj;
            return this.trackId == videoTrackInfo.trackId && runAnimators.values((Object) this.codecs, (Object) videoTrackInfo.codecs) && this.width == videoTrackInfo.width && this.bitrate == videoTrackInfo.bitrate && this.height == videoTrackInfo.height;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.trackId * 31) + this.codecs.hashCode()) * 31) + this.width) * 31) + this.bitrate) * 31) + this.height;
    }

    public String toString() {
        int i = this.trackId;
        String str = this.codecs;
        int i2 = this.width;
        int i3 = this.bitrate;
        int i4 = this.height;
        return "VideoTrackInfo(trackId=" + i + ", codecs=" + str + ", width=" + i2 + ", bitrate=" + i3 + ", height=" + i4 + ")";
    }

    public VideoTrackInfo(int i, String str, int i2, int i3, int i4) {
        runAnimators.ag$a(str, "codecs");
        this.trackId = i;
        this.codecs = str;
        this.width = i2;
        this.bitrate = i3;
        this.height = i4;
    }

    public final int getTrackId() {
        return this.trackId;
    }

    public final String getCodecs() {
        return this.codecs;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getBitrate() {
        return this.bitrate;
    }

    public final int getHeight() {
        return this.height;
    }
}
