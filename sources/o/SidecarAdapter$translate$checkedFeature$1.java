package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.sendbird.android.constant.StringSet;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public class SidecarAdapter$translate$checkedFeature$1 {
    private static final String[] HaptikSDK$b;
    private static final String[] ag$a;
    private static final String[] ah$a;
    private static final String[] ah$b;
    private static int ak = 0;
    private static int onXdkEvent = 1;
    private static final String[] toString;
    private static final String[] valueOf;
    private static final String[] values;
    private boolean HaptikSDK$a;
    private boolean HaptikSDK$d;
    private boolean HaptikSDK$e;
    private boolean HaptikWebView;
    private boolean a;
    private boolean getInitSettings;
    private boolean getSignupData;
    private boolean invoke;
    private String isLogoutPending;
    private static long aj$a = -3378236913138441920L;
    private static final Map<String, SidecarAdapter$translate$checkedFeature$1> HaptikSDK$c = new HashMap();

    private SidecarAdapter$translate$checkedFeature$1(String str) {
        try {
            this.getInitSettings = true;
            this.HaptikSDK$d = true;
            this.invoke = true;
            this.HaptikSDK$a = false;
            this.a = false;
            this.HaptikWebView = false;
            this.getSignupData = false;
            this.HaptikSDK$e = false;
            this.isLogoutPending = str;
        } catch (Exception e) {
            throw e;
        }
    }

    public String values() {
        try {
            int i = onXdkEvent + 15;
            try {
                ak = i % 128;
                int i2 = i % 2;
                String str = this.isLogoutPending;
                int i3 = onXdkEvent + 81;
                ak = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        if ((r1 != null) != true) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
        if (r1 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
        r5 = r6.valueOf(r5);
        o.isWindowLayoutProviderValid.valueOf(r5);
        r1 = r0.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        if (r1 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        r1 = new o.SidecarAdapter$translate$checkedFeature$1(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        r1.getInitSettings = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
        r5 = o.SidecarAdapter$translate$checkedFeature$1.onXdkEvent + 89;
        o.SidecarAdapter$translate$checkedFeature$1.ak = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        if ((r5 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
        r5 = 23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
        r5 = '+';
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
        if (r5 == 23) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
        r5 = r5.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o.SidecarAdapter$translate$checkedFeature$1 values(java.lang.String r5, o.getSidecarDevicePosture$window_release r6) {
        /*
            int r0 = o.SidecarAdapter$translate$checkedFeature$1.ak     // Catch: java.lang.Exception -> L70
            int r0 = r0 + 109
            int r1 = r0 % 128
            o.SidecarAdapter$translate$checkedFeature$1.onXdkEvent = r1     // Catch: java.lang.Exception -> L70
            int r0 = r0 % 2
            r1 = 65
            if (r0 != 0) goto L11
            r0 = 46
            goto L13
        L11:
            r0 = 65
        L13:
            r2 = 0
            if (r0 == r1) goto L2f
            o.isWindowLayoutProviderValid.ag$a(r5)
            java.util.Map<java.lang.String, o.SidecarAdapter$translate$checkedFeature$1> r0 = o.SidecarAdapter$translate$checkedFeature$1.HaptikSDK$c
            java.lang.Object r1 = r0.get(r5)
            o.SidecarAdapter$translate$checkedFeature$1 r1 = (o.SidecarAdapter$translate$checkedFeature$1) r1
            r3 = 15
            int r3 = r3 / r2
            r3 = 1
            if (r1 != 0) goto L29
            r4 = 0
            goto L2a
        L29:
            r4 = 1
        L2a:
            if (r4 == r3) goto L53
            goto L3c
        L2d:
            r5 = move-exception
            throw r5
        L2f:
            o.isWindowLayoutProviderValid.ag$a(r5)     // Catch: java.lang.Exception -> L6e
            java.util.Map<java.lang.String, o.SidecarAdapter$translate$checkedFeature$1> r0 = o.SidecarAdapter$translate$checkedFeature$1.HaptikSDK$c     // Catch: java.lang.Exception -> L6e
            java.lang.Object r1 = r0.get(r5)
            o.SidecarAdapter$translate$checkedFeature$1 r1 = (o.SidecarAdapter$translate$checkedFeature$1) r1
            if (r1 != 0) goto L53
        L3c:
            java.lang.String r5 = r6.valueOf(r5)
            o.isWindowLayoutProviderValid.valueOf(r5)
            java.lang.Object r6 = r0.get(r5)
            r1 = r6
            o.SidecarAdapter$translate$checkedFeature$1 r1 = (o.SidecarAdapter$translate$checkedFeature$1) r1
            if (r1 != 0) goto L53
            o.SidecarAdapter$translate$checkedFeature$1 r1 = new o.SidecarAdapter$translate$checkedFeature$1
            r1.<init>(r5)
            r1.getInitSettings = r2     // Catch: java.lang.Exception -> L70
        L53:
            int r5 = o.SidecarAdapter$translate$checkedFeature$1.onXdkEvent
            int r5 = r5 + 89
            int r6 = r5 % 128
            o.SidecarAdapter$translate$checkedFeature$1.ak = r6
            int r5 = r5 % 2
            r6 = 23
            if (r5 == 0) goto L64
            r5 = 23
            goto L66
        L64:
            r5 = 43
        L66:
            if (r5 == r6) goto L69
            return r1
        L69:
            r5 = 0
            int r5 = r5.length     // Catch: java.lang.Throwable -> L6c
            return r1
        L6c:
            r5 = move-exception
            throw r5
        L6e:
            r5 = move-exception
            throw r5
        L70:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SidecarAdapter$translate$checkedFeature$1.values(java.lang.String, o.getSidecarDevicePosture$window_release):o.SidecarAdapter$translate$checkedFeature$1");
    }

    public static SidecarAdapter$translate$checkedFeature$1 valueOf(String str) {
        int i = onXdkEvent + 89;
        ak = i % 128;
        int i2 = i % 2;
        SidecarAdapter$translate$checkedFeature$1 values2 = values(str, getSidecarDevicePosture$window_release.toString);
        int i3 = ak + 85;
        onXdkEvent = i3 % 128;
        int i4 = i3 % 2;
        return values2;
    }

    public boolean ag$a() {
        boolean z;
        int i = ak + 17;
        onXdkEvent = i % 128;
        Object[] objArr = null;
        if ((i % 2 == 0 ? ')' : (char) 20) != 20) {
            try {
                z = this.getInitSettings;
                int length = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            z = this.getInitSettings;
        }
        int i2 = onXdkEvent + 19;
        ak = i2 % 128;
        if (!(i2 % 2 != 0)) {
            return z;
        }
        int length2 = objArr.length;
        return z;
    }

    public boolean valueOf() {
        try {
            int i = ak + 123;
            onXdkEvent = i % 128;
            if ((i % 2 == 0 ? '#' : '^') != '#') {
                return this.HaptikSDK$d;
            }
            boolean z = this.HaptikSDK$d;
            Object[] objArr = null;
            int length = objArr.length;
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean ah$a() {
        try {
            int i = onXdkEvent + 57;
            ak = i % 128;
            if (i % 2 != 0) {
                boolean z = this.HaptikSDK$a;
                Object[] objArr = null;
                int length = objArr.length;
                return z;
            }
            return this.HaptikSDK$a;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        if ((r4.HaptikSDK$a) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
        if (r0 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
        if (r4.a == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
        r0 = o.SidecarAdapter$translate$checkedFeature$1.onXdkEvent + 19;
        o.SidecarAdapter$translate$checkedFeature$1.ak = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean HaptikSDK$c() {
        /*
            r4 = this;
            int r0 = o.SidecarAdapter$translate$checkedFeature$1.onXdkEvent
            int r0 = r0 + 51
            int r1 = r0 % 128
            o.SidecarAdapter$translate$checkedFeature$1.ak = r1
            int r0 = r0 % 2
            r1 = 93
            if (r0 == 0) goto L11
            r0 = 93
            goto L13
        L11:
            r0 = 33
        L13:
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L23
            boolean r0 = r4.HaptikSDK$a     // Catch: java.lang.Exception -> L21
            if (r0 != 0) goto L1d
            r0 = 0
            goto L1e
        L1d:
            r0 = 1
        L1e:
            if (r0 == 0) goto L2b
            goto L39
        L21:
            r0 = move-exception
            throw r0
        L23:
            boolean r0 = r4.HaptikSDK$a
            r1 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L39
        L2b:
            boolean r0 = r4.a
            if (r0 == 0) goto L3a
            int r0 = o.SidecarAdapter$translate$checkedFeature$1.onXdkEvent
            int r0 = r0 + 19
            int r1 = r0 % 128
            o.SidecarAdapter$translate$checkedFeature$1.ak = r1
            int r0 = r0 % 2
        L39:
            r2 = 1
        L3a:
            return r2
        L3b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SidecarAdapter$translate$checkedFeature$1.HaptikSDK$c():boolean");
    }

    public boolean HaptikSDK$b() {
        int i = ak + 55;
        onXdkEvent = i % 128;
        if (i % 2 != 0) {
            return HaptikSDK$c.containsKey(this.isLogoutPending);
        }
        boolean containsKey = HaptikSDK$c.containsKey(this.isLogoutPending);
        Object[] objArr = null;
        int length = objArr.length;
        return containsKey;
    }

    public boolean ah$b() {
        try {
            int i = ak + 115;
            try {
                onXdkEvent = i % 128;
                int i2 = i % 2;
                boolean z = this.HaptikWebView;
                int i3 = ak + 23;
                onXdkEvent = i3 % 128;
                if ((i3 % 2 == 0 ? 'S' : 'Z') != 'Z') {
                    Object[] objArr = null;
                    int length = objArr.length;
                    return z;
                }
                return z;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public boolean invoke() {
        boolean z;
        int i = ak + 43;
        onXdkEvent = i % 128;
        Object obj = null;
        if ((i % 2 == 0 ? 'B' : '2') != 'B') {
            z = this.getSignupData;
        } else {
            try {
                z = this.getSignupData;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = onXdkEvent + 103;
        ak = i2 % 128;
        if ((i2 % 2 != 0 ? 'O' : ')') != ')') {
            super.hashCode();
            return z;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SidecarAdapter$translate$checkedFeature$1 HaptikSDK$a() {
        int i = ak + 27;
        onXdkEvent = i % 128;
        if (i % 2 == 0) {
            this.a = false;
        } else {
            try {
                this.a = true;
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            int i2 = onXdkEvent + 47;
            ak = i2 % 128;
            int i3 = i2 % 2;
            return this;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SidecarAdapter$translate$checkedFeature$1) {
            SidecarAdapter$translate$checkedFeature$1 sidecarAdapter$translate$checkedFeature$1 = (SidecarAdapter$translate$checkedFeature$1) obj;
            if (this.isLogoutPending.equals(sidecarAdapter$translate$checkedFeature$1.isLogoutPending) && this.invoke == sidecarAdapter$translate$checkedFeature$1.invoke && this.HaptikSDK$a == sidecarAdapter$translate$checkedFeature$1.HaptikSDK$a && this.HaptikSDK$d == sidecarAdapter$translate$checkedFeature$1.HaptikSDK$d) {
                if (this.getInitSettings != sidecarAdapter$translate$checkedFeature$1.getInitSettings) {
                    return false;
                }
                try {
                    try {
                        if (!(this.HaptikWebView != sidecarAdapter$translate$checkedFeature$1.HaptikWebView)) {
                            if (this.a == sidecarAdapter$translate$checkedFeature$1.a) {
                                if (this.getSignupData != sidecarAdapter$translate$checkedFeature$1.getSignupData) {
                                    return false;
                                }
                                if (this.HaptikSDK$e == sidecarAdapter$translate$checkedFeature$1.HaptikSDK$e) {
                                    int i = ak + 89;
                                    onXdkEvent = i % 128;
                                    int i2 = i % 2;
                                    return true;
                                }
                                return false;
                            }
                            int i3 = ak + 119;
                            onXdkEvent = i3 % 128;
                            int i4 = i3 % 2;
                            int i5 = ak + 87;
                            onXdkEvent = i5 % 128;
                            if (i5 % 2 == 0) {
                                Object obj2 = null;
                                super.hashCode();
                                return false;
                            }
                            return false;
                        }
                        return false;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        try {
            int i = ak + 61;
            onXdkEvent = i % 128;
            int i2 = i % 2;
            int hashCode = (((((((((((((((this.isLogoutPending.hashCode() * 31) + (this.getInitSettings ? 1 : 0)) * 31) + (this.HaptikSDK$d ? 1 : 0)) * 31) + (this.invoke ? 1 : 0)) * 31) + (this.HaptikSDK$a ? 1 : 0)) * 31) + (this.a ? 1 : 0)) * 31) + (this.HaptikWebView ? 1 : 0)) * 31) + (this.getSignupData ? 1 : 0)) * 31) + (this.HaptikSDK$e ? 1 : 0);
            try {
                int i3 = ak + 43;
                onXdkEvent = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    Object[] objArr = null;
                    int length = objArr.length;
                    return hashCode;
                }
                return hashCode;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String toString() {
        String str;
        int i = ak + 91;
        onXdkEvent = i % 128;
        Object[] objArr = null;
        if ((i % 2 == 0 ? 'A' : '+') != '+') {
            str = this.isLogoutPending;
            int length = objArr.length;
        } else {
            str = this.isLogoutPending;
        }
        int i2 = onXdkEvent + 89;
        ak = i2 % 128;
        if (!(i2 % 2 != 0)) {
            return str;
        }
        int length2 = objArr.length;
        return str;
    }

    static {
        String[] strArr = {"html", TtmlNode.TAG_HEAD, TtmlNode.TAG_BODY, "frameset", "script", "noscript", TtmlNode.TAG_STYLE, com.apxor.androidsdk.core.ce.Constants.META, "link", ah$a(new char[]{11810, 30296, 28219, 33940, 11862, 6001, 44239, 42808, 43847}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1).intern(), "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", TtmlNode.TAG_P, "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", TtmlNode.TAG_DIV, "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math"};
        values = strArr;
        ah$b = new String[]{"object", "base", "font", TtmlNode.TAG_TT, "i", "b", StringSet.u, "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", TtmlNode.ATTR_TTS_RUBY, "rt", "rp", "a", "img", TtmlNode.TAG_BR, "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", TtmlNode.TAG_SPAN, "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", androidx.core.app.NotificationCompat.CATEGORY_PROGRESS, "meter", "area", com.apxor.androidsdk.core.ce.Constants.PARAMETERS, ah$a(new char[]{27426, 10313, 55781, 32351, 27473, 18790, 6928, 24045, 60993, 52844}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern(), "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", com.apxor.androidsdk.core.ce.Constants.PARAMETERS, ah$a(new char[]{27426, 10313, 55781, 32351, 27473, 18790, 6928, 24045, 60993, 52844}, TextUtils.lastIndexOf("", '0', 0, 0) + 1).intern(), "track", "data", "bdi", StringSet.s};
        valueOf = new String[]{com.apxor.androidsdk.core.ce.Constants.META, "link", "base", "frame", "img", TtmlNode.TAG_BR, "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", com.apxor.androidsdk.core.ce.Constants.PARAMETERS, ah$a(new char[]{27426, 10313, 55781, 32351, 27473, 18790, 6928, 24045, 60993, 52844}, KeyEvent.normalizeMetaState(0)).intern(), "track"};
        toString = new String[]{ah$a(new char[]{11810, 30296, 28219, 33940, 11862, 6001, 44239, 42808, 43847}, Color.green(0)).intern(), "a", TtmlNode.TAG_P, "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", TtmlNode.TAG_STYLE, "ins", "del", StringSet.s};
        HaptikSDK$b = new String[]{"pre", "plaintext", ah$a(new char[]{11810, 30296, 28219, 33940, 11862, 6001, 44239, 42808, 43847}, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))).intern(), "textarea"};
        ah$a = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        ag$a = new String[]{"input", "keygen", "object", "select", "textarea"};
        for (int i = 0; i < 63; i++) {
            values(new SidecarAdapter$translate$checkedFeature$1(strArr[i]));
        }
        for (String str : ah$b) {
            SidecarAdapter$translate$checkedFeature$1 sidecarAdapter$translate$checkedFeature$1 = new SidecarAdapter$translate$checkedFeature$1(str);
            sidecarAdapter$translate$checkedFeature$1.getInitSettings = false;
            sidecarAdapter$translate$checkedFeature$1.HaptikSDK$d = false;
            values(sidecarAdapter$translate$checkedFeature$1);
        }
        for (String str2 : valueOf) {
            SidecarAdapter$translate$checkedFeature$1 sidecarAdapter$translate$checkedFeature$12 = HaptikSDK$c.get(str2);
            isWindowLayoutProviderValid.ag$a(sidecarAdapter$translate$checkedFeature$12);
            sidecarAdapter$translate$checkedFeature$12.invoke = false;
            sidecarAdapter$translate$checkedFeature$12.HaptikSDK$a = true;
        }
        for (String str3 : toString) {
            SidecarAdapter$translate$checkedFeature$1 sidecarAdapter$translate$checkedFeature$13 = HaptikSDK$c.get(str3);
            isWindowLayoutProviderValid.ag$a(sidecarAdapter$translate$checkedFeature$13);
            sidecarAdapter$translate$checkedFeature$13.HaptikSDK$d = false;
        }
        String[] strArr2 = HaptikSDK$b;
        int length = strArr2.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = ak + 59;
            onXdkEvent = i3 % 128;
            if (i3 % 2 != 0) {
                SidecarAdapter$translate$checkedFeature$1 sidecarAdapter$translate$checkedFeature$14 = HaptikSDK$c.get(strArr2[i2]);
                isWindowLayoutProviderValid.ag$a(sidecarAdapter$translate$checkedFeature$14);
                sidecarAdapter$translate$checkedFeature$14.HaptikWebView = true;
                i2++;
            } else {
                SidecarAdapter$translate$checkedFeature$1 sidecarAdapter$translate$checkedFeature$15 = HaptikSDK$c.get(strArr2[i2]);
                isWindowLayoutProviderValid.ag$a(sidecarAdapter$translate$checkedFeature$15);
                sidecarAdapter$translate$checkedFeature$15.HaptikWebView = true;
                i2 += 26;
            }
        }
        String[] strArr3 = ah$a;
        int length2 = strArr3.length;
        int i4 = 0;
        while (i4 < length2) {
            int i5 = ak + 15;
            onXdkEvent = i5 % 128;
            if ((i5 % 2 == 0 ? '\"' : (char) 23) != '\"') {
                SidecarAdapter$translate$checkedFeature$1 sidecarAdapter$translate$checkedFeature$16 = HaptikSDK$c.get(strArr3[i4]);
                isWindowLayoutProviderValid.ag$a(sidecarAdapter$translate$checkedFeature$16);
                sidecarAdapter$translate$checkedFeature$16.getSignupData = true;
                i4++;
            } else {
                SidecarAdapter$translate$checkedFeature$1 sidecarAdapter$translate$checkedFeature$17 = HaptikSDK$c.get(strArr3[i4]);
                isWindowLayoutProviderValid.ag$a(sidecarAdapter$translate$checkedFeature$17);
                sidecarAdapter$translate$checkedFeature$17.getSignupData = true;
                i4 += 93;
            }
        }
        for (String str4 : ag$a) {
            SidecarAdapter$translate$checkedFeature$1 sidecarAdapter$translate$checkedFeature$18 = HaptikSDK$c.get(str4);
            isWindowLayoutProviderValid.ag$a(sidecarAdapter$translate$checkedFeature$18);
            sidecarAdapter$translate$checkedFeature$18.HaptikSDK$e = true;
        }
    }

    private static void values(SidecarAdapter$translate$checkedFeature$1 sidecarAdapter$translate$checkedFeature$1) {
        int i = onXdkEvent + 107;
        ak = i % 128;
        int i2 = i % 2;
        try {
            HaptikSDK$c.put(sidecarAdapter$translate$checkedFeature$1.isLogoutPending, sidecarAdapter$translate$checkedFeature$1);
            int i3 = ak + 21;
            onXdkEvent = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String ah$a(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(aj$a, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * aj$a));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
