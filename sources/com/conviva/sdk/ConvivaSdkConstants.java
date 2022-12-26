package com.conviva.sdk;

import com.conviva.api.ConvivaConstants;
/* loaded from: classes4.dex */
public class ConvivaSdkConstants extends ConvivaConstants {
    public static final String AD_PLAYER = "Conviva.playertype";
    public static final String AD_TAG_URL = "Conviva.ad_tag_url";
    public static final String ASSET_NAME = "Conviva.assetName";
    static final String CLIENT_CONFIGURATION_FAILED = "ConvivaVideoAnalytics not yet configured";
    public static final String DEFAULT_RESOURCE = "Conviva.defaultResource";
    public static final String DURATION = "Conviva.duration";
    public static final String ENCODED_FRAMERATE = "Conviva.encodedFrameRate";
    public static final String FRAMEWORK_NAME = "Conviva.framework";
    public static final String FRAMEWORK_VERSION = "Conviva.frameworkVersion";
    public static final String GATEWAY_URL = "gatewayUrl";
    public static final String HEARTBEAT_INTERVAL = "heartbeatInterval";
    static final String INVALID_AD_PLAYER_MONITOR = "Invalid : Did you report ad playback ended?";
    static final String INVALID_PLAYER_MONITOR = "Invalid : Did you report playback ended?";
    public static final String IS_LIVE = "Conviva.isLive";
    public static final String IS_OFFLINE_PLAYBACK = "Conviva.offlinePlayback";
    public static final String LOG_LEVEL = "logLevel";
    public static final int NO_SESSION_KEY = -2;
    public static final String PLAYER_NAME = "Conviva.playerName";
    public static final String PLAYER_UNAVAILABLE_ERROR = "Player cannot be null";
    public static final String POD_DURATION = "Conviva.podDuration";
    public static final String POD_INDEX = "Conviva.podIndex";
    public static final String POD_POSITION = "Conviva.podPosition";
    public static final String STREAM_URL = "Conviva.streamUrl";
    public static final String VIEWER_ID = "Conviva.viewerId";

    /* loaded from: classes4.dex */
    public enum AdPlayer {
        CONTENT,
        SEPARATE
    }

    /* loaded from: classes4.dex */
    public enum AdPosition {
        PREROLL,
        MIDROLL,
        POSTROLL
    }

    /* loaded from: classes4.dex */
    public enum AdType {
        CLIENT_SIDE,
        SERVER_SIDE
    }

    /* loaded from: classes4.dex */
    public enum ConvivaModule {
        ExoPlayer,
        Brightcove,
        NexStreaming
    }

    /* loaded from: classes4.dex */
    public enum ErrorSeverity {
        FATAL,
        WARNING
    }

    /* loaded from: classes4.dex */
    public enum LogLevel {
        DEBUG,
        INFO,
        WARNING,
        ERROR,
        NONE
    }

    /* loaded from: classes4.dex */
    public enum PlayerState {
        STOPPED,
        PLAYING,
        BUFFERING,
        PAUSED,
        UNKNOWN
    }

    /* loaded from: classes4.dex */
    public enum StreamType {
        UNKNOWN,
        LIVE,
        VOD
    }

    /* loaded from: classes6.dex */
    public class DEVICEINFO {
        public static final String ANROID_BUILD_MODEL = "androidBuildModel";
        public static final String DEVICE_BRAND = "deviceBrand";
        public static final String DEVICE_MANUFACTURER = "deviceManufacturer";
        public static final String DEVICE_MODEL = "deviceModel";
        public static final String DEVICE_TYPE = "deviceType";
        public static final String DEVICE_VERSION = "deviceVersion";
        public static final String OPERATING_SYSTEM_VERSION = "operatingSystemVersion";
        public static final String SCREEN_RESOLUTION_HEIGHT = "deviceScreenHeight";
        public static final String SCREEN_RESOLUTION_SCALE_FACTOR = "deviceScreenScaleFactor";
        public static final String SCREEN_RESOLUTION_WIDTH = "deviceScreenWidth";

        public DEVICEINFO() {
        }
    }

    /* loaded from: classes6.dex */
    public class PLAYBACK {
        public static final String AVG_BITRATE = "Conviva.playback_avg_bitrate";
        public static final String BITRATE = "Conviva.playback_bitrate";
        public static final String BUFFER_LENGTH = "Conviva.playback_buffer_length";
        public static final String CDN_IP = "Conviva.playback_cdn_ip";
        public static final String DROPPED_FRAMES_COUNT = "Conviva.playback_dropped_frames_count";
        public static final String ENCODED_FRAMERATE = "Conviva.playback_encoded_frame_rate";
        public static final String PLAYER_STATE = "Conviva.playback_state";
        public static final String PLAY_HEAD_TIME = "Conviva.playback_head_time";
        public static final String RENDERED_FRAMERATE = "Conviva.playback_frame_rate";
        public static final String RESOLUTION = "Conviva.playback_resolution";
        public static final String SEEK_ENDED = "Conviva.playback_seek_ended";
        public static final String SEEK_STARTED = "Conviva.playback_seek_started";

        public PLAYBACK() {
        }
    }

    /* loaded from: classes4.dex */
    public enum Events {
        AD_REQUESTED("Conviva.AdRequested"),
        AD_RESPONSE("Conviva.AdResponse"),
        AD_SLOT_STARTED("Conviva.SlotStarted"),
        AD_SLOT_ENDED("Conviva.SlotEnded"),
        AD_ATTEMPTED("Conviva.AdAttempted"),
        AD_IMPRESSION_START("Conviva.AdImpression"),
        AD_START("Conviva.AdStart"),
        AD_FIRST_QUARTILE("Conviva.AdFirstQuartile"),
        AD_MID_QUARTILE("Conviva.AdMidQuartile"),
        AD_THIRD_QUARTILE("Conviva.AdThirdQuartile"),
        AD_COMPLETE("Conviva.AdComplete"),
        AD_END("Conviva.AdEnd"),
        AD_IMPRESSION_END("Conviva.AdImpression"),
        AD_SKIPPED("Conviva.AdSkipped"),
        AD_ERROR("Conviva.AdError"),
        AD_PROGRESS("Conviva.AdProgress"),
        AD_CLOSE("Conviva.AdClose"),
        CONTENT_PAUSED("Conviva.PauseContent"),
        CONTENT_RESUMED("Conviva.ResumeContent"),
        POD_START("Conviva.PodStart"),
        POD_END("Conviva.PodEnd"),
        USER_WAIT_STARTED("Conviva.UserWaitStarted"),
        USER_WAIT_ENDED("Conviva.UserWaitEnded"),
        BUMPER_VIDEO_STARTED("Conviva.BumperVideoStarted"),
        BUMPER_VIDEO_ENDED("Conviva.BumperVideoEnded");
        
        private String val;

        Events(String str) {
            this.val = str;
        }

        public String getValue() {
            return this.val;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.val;
        }
    }

    /* loaded from: classes6.dex */
    public enum ErrorType {
        ERROR_UNKNOWN("ERROR_UNKNOWN"),
        ERROR_IO("ERROR_IO"),
        ERROR_TIMEOUT("ERROR_TIMEOUT"),
        ERROR_NULL_ASSET("ERROR_NULL_ASSET"),
        ERROR_MISSING_PARAMETER("ERROR_MISSING_PARAMETER"),
        ERROR_NO_AD_AVAILABLE("ERROR_NO_AD_AVAILABLE"),
        ERROR_PARSE("ERROR_PARSE"),
        ERROR_INVALID_VALUE("ERROR_INVALID_VALUE"),
        ERROR_INVALID_SLOT("ERROR_INVALID_SLOT"),
        ERROR_3P_COMPONENT("ERROR_3P_COMPONENT"),
        ERROR_UNSUPPORTED_3P_FEATURE("ERROR_UNSUPPORTED_3P_FEATURE"),
        ERROR_DEVICE_LIMIT("ERROR_DEVICE_LIMIT"),
        ERROR_UNMATCHED_SLOT_SIZE("ERROR_UNMATCHED_SLOT_SIZE");
        
        private String val;

        ErrorType(String str) {
            this.val = str;
        }

        public String getValue() {
            return this.val;
        }
    }
}
