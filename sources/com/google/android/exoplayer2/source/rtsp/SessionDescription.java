package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class SessionDescription {
    public static final String ATTR_CONTROL = "control";
    public static final String ATTR_FMTP = "fmtp";
    public static final String ATTR_LENGTH = "length";
    public static final String ATTR_RANGE = "range";
    public static final String ATTR_RTPMAP = "rtpmap";
    public static final String ATTR_TOOL = "tool";
    public static final String ATTR_TYPE = "type";
    public static final String SUPPORTED_SDP_VERSION = "0";
    public final ImmutableMap<String, String> attributes;
    public final int bitrate;
    public final String connection;
    public final String emailAddress;
    public final String key;
    public final ImmutableList<MediaDescription> mediaDescriptionList;
    public final String origin;
    public final String phoneNumber;
    public final String sessionInfo;
    public final String sessionName;
    public final String timing;
    public final Uri uri;

    /* loaded from: classes5.dex */
    public static final class Builder {
        private String connection;
        private String emailAddress;
        private String key;
        private String origin;
        private String phoneNumber;
        private String sessionInfo;
        private String sessionName;
        private String timing;
        private Uri uri;
        private final HashMap<String, String> attributes = new HashMap<>();
        private final ImmutableList.valueOf<MediaDescription> mediaDescriptionListBuilder = new ImmutableList.valueOf<>();
        private int bitrate = -1;

        public Builder setSessionName(String str) {
            this.sessionName = str;
            return this;
        }

        public Builder setSessionInfo(String str) {
            this.sessionInfo = str;
            return this;
        }

        public Builder setUri(Uri uri) {
            this.uri = uri;
            return this;
        }

        public Builder setOrigin(String str) {
            this.origin = str;
            return this;
        }

        public Builder setConnection(String str) {
            this.connection = str;
            return this;
        }

        public Builder setBitrate(int i) {
            this.bitrate = i;
            return this;
        }

        public Builder setTiming(String str) {
            this.timing = str;
            return this;
        }

        public Builder setKey(String str) {
            this.key = str;
            return this;
        }

        public Builder setEmailAddress(String str) {
            this.emailAddress = str;
            return this;
        }

        public Builder setPhoneNumber(String str) {
            this.phoneNumber = str;
            return this;
        }

        public Builder addAttribute(String str, String str2) {
            this.attributes.put(str, str2);
            return this;
        }

        public Builder addMediaDescription(MediaDescription mediaDescription) {
            this.mediaDescriptionListBuilder.toString((ImmutableList.valueOf<MediaDescription>) mediaDescription);
            return this;
        }

        public SessionDescription build() {
            return new SessionDescription(this);
        }
    }

    private SessionDescription(Builder builder) {
        this.attributes = ImmutableMap.copyOf((Map) builder.attributes);
        this.mediaDescriptionList = builder.mediaDescriptionListBuilder.ah$a();
        this.sessionName = (String) Util.castNonNull(builder.sessionName);
        this.origin = (String) Util.castNonNull(builder.origin);
        this.timing = (String) Util.castNonNull(builder.timing);
        this.uri = builder.uri;
        this.connection = builder.connection;
        this.bitrate = builder.bitrate;
        this.key = builder.key;
        this.emailAddress = builder.emailAddress;
        this.phoneNumber = builder.phoneNumber;
        this.sessionInfo = builder.sessionInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SessionDescription sessionDescription = (SessionDescription) obj;
        return this.bitrate == sessionDescription.bitrate && this.attributes.equals(sessionDescription.attributes) && this.mediaDescriptionList.equals(sessionDescription.mediaDescriptionList) && Util.areEqual(this.origin, sessionDescription.origin) && Util.areEqual(this.sessionName, sessionDescription.sessionName) && Util.areEqual(this.timing, sessionDescription.timing) && Util.areEqual(this.sessionInfo, sessionDescription.sessionInfo) && Util.areEqual(this.uri, sessionDescription.uri) && Util.areEqual(this.emailAddress, sessionDescription.emailAddress) && Util.areEqual(this.phoneNumber, sessionDescription.phoneNumber) && Util.areEqual(this.connection, sessionDescription.connection) && Util.areEqual(this.key, sessionDescription.key);
    }

    public int hashCode() {
        int hashCode = this.attributes.hashCode();
        int hashCode2 = this.mediaDescriptionList.hashCode();
        String str = this.origin;
        int hashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.sessionName;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.timing;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        int i = this.bitrate;
        String str4 = this.sessionInfo;
        int hashCode6 = str4 == null ? 0 : str4.hashCode();
        Uri uri = this.uri;
        int hashCode7 = uri == null ? 0 : uri.hashCode();
        String str5 = this.emailAddress;
        int hashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.phoneNumber;
        int hashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.connection;
        int hashCode10 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.key;
        return ((((((((((((((((((((((hashCode + 217) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (str8 != null ? str8.hashCode() : 0);
    }
}
