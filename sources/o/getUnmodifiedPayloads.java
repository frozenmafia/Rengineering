package o;
/* loaded from: classes5.dex */
public final class getUnmodifiedPayloads {
    getUnmodifiedPayloads() {
    }

    /* loaded from: classes5.dex */
    protected static final class toString extends hasAnyOfTheFlags<Boolean> {
        private static toString ag$a;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String ag$a() {
            return "firebase_performance_collection_enabled";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String p_() {
            return "isEnabled";
        }

        private toString() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static toString ah$a() {
            toString tostring;
            synchronized (toString.class) {
                if (ag$a == null) {
                    ag$a = new toString();
                }
                tostring = ag$a;
            }
            return tostring;
        }
    }

    /* loaded from: classes5.dex */
    protected static final class invoke extends hasAnyOfTheFlags<String> {
        private static invoke ah$a;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String HaptikSDK$a() {
            return "fpr_disabled_android_versions";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String p_() {
            return "com.google.firebase.perf.SdkDisabledVersions";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public String valueOf() {
            return "";
        }

        protected invoke() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static invoke ah$a() {
            invoke invokeVar;
            synchronized (invoke.class) {
                if (ah$a == null) {
                    ah$a = new invoke();
                }
                invokeVar = ah$a;
            }
            return invokeVar;
        }
    }

    /* loaded from: classes5.dex */
    protected static final class isLogoutPending extends hasAnyOfTheFlags<Float> {
        private static isLogoutPending values;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String HaptikSDK$a() {
            return "fpr_vc_trace_sampling_rate";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String p_() {
            return "com.google.firebase.perf.TraceSamplingRate";
        }

        private isLogoutPending() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static isLogoutPending ah$a() {
            isLogoutPending islogoutpending;
            synchronized (isLogoutPending.class) {
                if (values == null) {
                    values = new isLogoutPending();
                }
                islogoutpending = values;
            }
            return islogoutpending;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Float valueOf() {
            return Float.valueOf(1.0f);
        }
    }

    /* loaded from: classes5.dex */
    protected static final class HaptikWebView extends hasAnyOfTheFlags<Long> {
        private static HaptikWebView ag$a;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String HaptikSDK$a() {
            return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String ag$a() {
            return "sessions_cpu_capture_frequency_fg_ms";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String p_() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
        }

        private HaptikWebView() {
        }

        public static HaptikWebView ah$a() {
            HaptikWebView haptikWebView;
            synchronized (HaptikWebView.class) {
                if (ag$a == null) {
                    ag$a = new HaptikWebView();
                }
                haptikWebView = ag$a;
            }
            return haptikWebView;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Long valueOf() {
            return 100L;
        }
    }

    /* loaded from: classes5.dex */
    protected static final class getInitSettings extends hasAnyOfTheFlags<Long> {
        private static getInitSettings ah$a;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String HaptikSDK$a() {
            return "fpr_session_gauge_memory_capture_frequency_bg_ms";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String ag$a() {
            return "sessions_memory_capture_frequency_bg_ms";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String p_() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
        }

        private getInitSettings() {
        }

        public static getInitSettings ah$a() {
            getInitSettings getinitsettings;
            synchronized (getInitSettings.class) {
                if (ah$a == null) {
                    ah$a = new getInitSettings();
                }
                getinitsettings = ah$a;
            }
            return getinitsettings;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Long valueOf() {
            return 0L;
        }
    }

    /* loaded from: classes7.dex */
    protected static final class onXdkEvent extends hasAnyOfTheFlags<Long> {
        private static onXdkEvent valueOf;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String HaptikSDK$a() {
            return "fpr_rl_trace_event_count_fg";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String p_() {
            return "com.google.firebase.perf.TraceEventCountForeground";
        }

        private onXdkEvent() {
        }

        public static onXdkEvent valueOf() {
            onXdkEvent onxdkevent;
            synchronized (onXdkEvent.class) {
                if (valueOf == null) {
                    valueOf = new onXdkEvent();
                }
                onxdkevent = valueOf;
            }
            return onxdkevent;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Long ah$a() {
            return 300L;
        }
    }

    /* loaded from: classes7.dex */
    protected static final class a extends hasAnyOfTheFlags<Long> {
        private static a toString;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String HaptikSDK$a() {
            return "fpr_rl_trace_event_count_bg";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String p_() {
            return "com.google.firebase.perf.TraceEventCountBackground";
        }

        private a() {
        }

        public static a ah$a() {
            a aVar;
            synchronized (a.class) {
                if (toString == null) {
                    toString = new a();
                }
                aVar = toString;
            }
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Long valueOf() {
            return 30L;
        }
    }

    /* loaded from: classes7.dex */
    protected static final class valueOf extends hasAnyOfTheFlags<Long> {
        private static valueOf toString;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String HaptikSDK$a() {
            return "fpr_rl_network_event_count_fg";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String p_() {
            return "com.google.firebase.perf.NetworkEventCountForeground";
        }

        private valueOf() {
        }

        public static valueOf ah$a() {
            valueOf valueof;
            synchronized (valueOf.class) {
                if (toString == null) {
                    toString = new valueOf();
                }
                valueof = toString;
            }
            return valueof;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Long valueOf() {
            return 700L;
        }
    }

    /* loaded from: classes7.dex */
    protected static final class values extends hasAnyOfTheFlags<Long> {
        private static values toString;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String HaptikSDK$a() {
            return "fpr_rl_network_event_count_bg";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String p_() {
            return "com.google.firebase.perf.NetworkEventCountBackground";
        }

        private values() {
        }

        public static values ah$a() {
            values valuesVar;
            synchronized (values.class) {
                if (toString == null) {
                    toString = new values();
                }
                valuesVar = toString;
            }
            return valuesVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Long valueOf() {
            return 70L;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static final class getSignupData extends hasAnyOfTheFlags<Float> {
        private static getSignupData ah$a;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String HaptikSDK$a() {
            return "fpr_vc_session_sampling_rate";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String ag$a() {
            return "sessions_sampling_percentage";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // o.hasAnyOfTheFlags
        public String p_() {
            return "com.google.firebase.perf.SessionSamplingRate";
        }

        private getSignupData() {
        }

        public static getSignupData valueOf() {
            getSignupData getsignupdata;
            synchronized (getSignupData.class) {
                if (ah$a == null) {
                    ah$a = new getSignupData();
                }
                getsignupdata = ah$a;
            }
            return getsignupdata;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Float ah$a() {
            return Float.valueOf(0.01f);
        }
    }
}
