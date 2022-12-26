package com.fancode.video.models;

import o.runAnimators;
/* loaded from: classes6.dex */
public final class AudioTrackInfo {
    private final String bitrate;
    private final int index;
    private final String language;
    private final int title;
    private final String type;

    public static /* synthetic */ AudioTrackInfo copy$default(AudioTrackInfo audioTrackInfo, int i, String str, String str2, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = audioTrackInfo.index;
        }
        if ((i3 & 2) != 0) {
            str = audioTrackInfo.language;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            str2 = audioTrackInfo.bitrate;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            i2 = audioTrackInfo.title;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            str3 = audioTrackInfo.type;
        }
        return audioTrackInfo.copy(i, str4, str5, i4, str3);
    }

    public final int component1() {
        return this.index;
    }

    public final String component2() {
        return this.language;
    }

    public final String component3() {
        return this.bitrate;
    }

    public final int component4() {
        return this.title;
    }

    public final String component5() {
        return this.type;
    }

    public final AudioTrackInfo copy(int i, String str, String str2, int i2, String str3) {
        runAnimators.ag$a(str, "language");
        runAnimators.ag$a(str2, "bitrate");
        runAnimators.ag$a(str3, "type");
        return new AudioTrackInfo(i, str, str2, i2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AudioTrackInfo) {
            AudioTrackInfo audioTrackInfo = (AudioTrackInfo) obj;
            return this.index == audioTrackInfo.index && runAnimators.values((Object) this.language, (Object) audioTrackInfo.language) && runAnimators.values((Object) this.bitrate, (Object) audioTrackInfo.bitrate) && this.title == audioTrackInfo.title && runAnimators.values((Object) this.type, (Object) audioTrackInfo.type);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.index * 31) + this.language.hashCode()) * 31) + this.bitrate.hashCode()) * 31) + this.title) * 31) + this.type.hashCode();
    }

    public String toString() {
        int i = this.index;
        String str = this.language;
        String str2 = this.bitrate;
        int i2 = this.title;
        String str3 = this.type;
        return "AudioTrackInfo(index=" + i + ", language=" + str + ", bitrate=" + str2 + ", title=" + i2 + ", type=" + str3 + ")";
    }

    public AudioTrackInfo(int i, String str, String str2, int i2, String str3) {
        runAnimators.ag$a(str, "language");
        runAnimators.ag$a(str2, "bitrate");
        runAnimators.ag$a(str3, "type");
        this.index = i;
        this.language = str;
        this.bitrate = str2;
        this.title = i2;
        this.type = str3;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getBitrate() {
        return this.bitrate;
    }

    public final int getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }
}
