package com.conviva.api;
/* loaded from: classes4.dex */
public class ConvivaConstants {

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
    public enum AdStream {
        CONTENT,
        SEPARATE
    }

    /* loaded from: classes4.dex */
    public enum DeviceType {
        DESKTOP { // from class: com.conviva.api.ConvivaConstants.DeviceType.1
            @Override // java.lang.Enum
            public String toString() {
                return "DESKTOP";
            }
        },
        CONSOLE { // from class: com.conviva.api.ConvivaConstants.DeviceType.2
            @Override // java.lang.Enum
            public String toString() {
                return "Console";
            }
        },
        SETTOP { // from class: com.conviva.api.ConvivaConstants.DeviceType.3
            @Override // java.lang.Enum
            public String toString() {
                return "Settop";
            }
        },
        MOBILE { // from class: com.conviva.api.ConvivaConstants.DeviceType.4
            @Override // java.lang.Enum
            public String toString() {
                return "Mobile";
            }
        },
        TABLET { // from class: com.conviva.api.ConvivaConstants.DeviceType.5
            @Override // java.lang.Enum
            public String toString() {
                return "Tablet";
            }
        },
        SMARTTV { // from class: com.conviva.api.ConvivaConstants.DeviceType.6
            @Override // java.lang.Enum
            public String toString() {
                return "SmartTV";
            }
        },
        UNKNOWN { // from class: com.conviva.api.ConvivaConstants.DeviceType.7
            @Override // java.lang.Enum
            public String toString() {
                return "Unknown";
            }
        }
    }

    /* loaded from: classes4.dex */
    public enum ErrorSeverity {
        FATAL,
        WARNING
    }

    /* loaded from: classes6.dex */
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
        POD_END("Conviva.PodEnd");
        
        private String val;

        Events(String str) {
            this.val = str;
        }

        public String getValue() {
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
