package com.giphy.sdk.core.network.api;

import android.net.Uri;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class Constants {
    private static final Uri HaptikSDK$b;
    private static final Uri HaptikSDK$c;
    private static final Environment ag$a;
    private static final Uri ah$a;
    private static final String ah$b;
    public static final Constants toString = new Constants();
    private static final String valueOf;
    private static final String values;

    /* loaded from: classes4.dex */
    public enum Environment {
        DEV,
        PROD
    }

    static {
        Uri parse;
        String str;
        Environment environment = Environment.PROD;
        ag$a = environment;
        if (environment == Environment.PROD) {
            parse = Uri.parse("https://api.giphy.com");
            str = "Uri.parse(\"https://api.giphy.com\")";
        } else {
            parse = Uri.parse("https://api.dev.giphy.tech");
            str = "Uri.parse(\"https://api.dev.giphy.tech\")";
        }
        runAnimators.ah$a(parse, str);
        HaptikSDK$c = parse;
        Uri parse2 = Uri.parse("https://x.giphy.com");
        runAnimators.ah$a(parse2, "Uri.parse(\"https://x.giphy.com\")");
        ah$a = parse2;
        HaptikSDK$b = Uri.parse("https://pingback.giphy.com");
        valueOf = "api_key";
        ah$b = "pingback_id";
        values = "Content-Type";
    }

    private Constants() {
    }

    public final Uri HaptikSDK$b() {
        return HaptikSDK$c;
    }

    public final Uri values() {
        return HaptikSDK$b;
    }

    public final String valueOf() {
        return valueOf;
    }

    public final String ag$a() {
        return ah$b;
    }

    public final String ah$a() {
        return values;
    }

    /* loaded from: classes4.dex */
    public static final class values {
        public static final values values = new values();
        private static final String ah$b = "v1/%s/search";
        private static final String HaptikSDK$b = "v1/%s/trending";
        private static final String HaptikSDK$e = "v1/trending/searches";
        private static final String ah$a = "v1/channels/search";
        private static final String HaptikSDK$a = "v1/%s/random";
        private static final String toString = "v1/gifs/%s";
        private static final String HaptikSDK$c = "v1/gifs";
        private static final String valueOf = "v1/emoji";
        private static final String invoke = "v2/pingback";
        private static final String ag$a = "v1/text/animate";

        private values() {
        }

        public final String invoke() {
            return ah$b;
        }

        public final String HaptikSDK$a() {
            return HaptikSDK$b;
        }

        public final String HaptikSDK$c() {
            return HaptikSDK$e;
        }

        public final String valueOf() {
            return ah$a;
        }

        public final String ag$a() {
            return toString;
        }

        public final String ah$b() {
            return HaptikSDK$c;
        }

        public final String values() {
            return valueOf;
        }

        public final String HaptikSDK$b() {
            return invoke;
        }

        public final String ah$a() {
            return ag$a;
        }
    }
}
