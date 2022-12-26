package com.conviva.utils;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import o.CheckedTextViewCompat;
import o.CheckedTextViewCompat$ag$a;
import o.CompoundButtonCompat;
import o.cancelTargetTouch;
import o.getValueAt;
import o.requestPermission;
/* loaded from: classes4.dex */
public class Config {
    private cancelTargetTouch HaptikSDK$b;
    private boolean HaptikSDK$d;
    private CompoundButtonCompat HaptikWebView;
    public Map<String, Object> ah$a;
    private CheckedTextViewCompat.Api21Impl getSignupData;
    private Map<String, Object> invoke;
    public int toString;
    public Map<String, Object> valueOf;
    private final String HaptikSDK$c = "clId";
    private final String ah$b = "iId";
    private final String HaptikSDK$a = "sdkConfig";
    private final String ag$a = "csi_en";
    public boolean values = false;
    private boolean HaptikSDK$e = false;
    private Stack<CheckedTextViewCompat$ag$a> getInitSettings = new Stack<>();

    /* loaded from: classes4.dex */
    public enum ConvivaIdErrorCodes {
        CONVIVAID_NA(SessionDescription.SUPPORTED_SDP_VERSION),
        CONVIVAID_FETCH_ERROR(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE),
        CONVIVAID_USER_OPTOUT(ExifInterface.GPS_MEASUREMENT_2D),
        CONVIVAID_PRIVACY_RESTRICTION(ExifInterface.GPS_MEASUREMENT_3D),
        CONVIVAID_SERVER_RESTRICTION("4"),
        CONVIVAID_USER_OPT_DELETE("5");
        
        private String val;

        ConvivaIdErrorCodes(String str) {
            this.val = str;
        }

        public String getValue() {
            return this.val;
        }
    }

    public Config(CompoundButtonCompat compoundButtonCompat, CheckedTextViewCompat.Api21Impl api21Impl, cancelTargetTouch canceltargettouch) {
        this.HaptikWebView = compoundButtonCompat;
        this.getSignupData = api21Impl;
        this.HaptikSDK$b = canceltargettouch;
        this.HaptikWebView.valueOf("Config");
        HashMap hashMap = new HashMap();
        this.invoke = hashMap;
        hashMap.put("clientId", getValueAt.valueOf);
        this.invoke.put("iid", -1);
        this.invoke.put("sendLogs", false);
        this.invoke.put("fp", "");
        HashMap hashMap2 = new HashMap();
        this.valueOf = hashMap2;
        hashMap2.putAll(this.invoke);
    }

    public boolean ah$a() {
        return this.HaptikSDK$e;
    }

    public void valueOf() {
        this.HaptikSDK$d = false;
        this.getSignupData.ah$a("sdkConfig", new requestPermission() { // from class: com.conviva.utils.Config$ah$a
            @Override // o.requestPermission
            public void valueOf(boolean z, String str) {
                boolean z2;
                if (!z) {
                    CompoundButtonCompat compoundButtonCompat = Config.this.HaptikWebView;
                    compoundButtonCompat.toString("load(): error loading configuration from local storage: " + str);
                } else if (str != null) {
                    Config.this.values(str);
                    CompoundButtonCompat compoundButtonCompat2 = Config.this.HaptikWebView;
                    StringBuilder sb = new StringBuilder();
                    sb.append("load(): configuration successfully loaded from local storage");
                    z2 = Config.this.HaptikSDK$d;
                    sb.append(z2 ? " (was empty)" : "");
                    sb.append(".");
                    compoundButtonCompat2.values(sb.toString());
                }
                Config.this.HaptikSDK$e = true;
                Config.this.ah$b();
            }
        });
    }

    public void values(String str) {
        Map<String, Object> canceltargettouch = this.HaptikSDK$b.toString(str);
        if (canceltargettouch == null) {
            this.HaptikSDK$d = true;
            return;
        }
        String obj = canceltargettouch.containsKey("clId") ? canceltargettouch.get("clId").toString() : null;
        if (obj != null && !obj.equals(getValueAt.valueOf) && !obj.equals("null") && obj.length() > 0) {
            this.valueOf.put("clientId", obj);
            CompoundButtonCompat compoundButtonCompat = this.HaptikWebView;
            compoundButtonCompat.ah$a("parse(): setting the client id to " + obj + " (from local storage)");
        }
        int intValue = canceltargettouch.containsKey("iId") ? ((Integer) canceltargettouch.get("iId")).intValue() : -1;
        if (intValue != -1) {
            this.valueOf.put("iid", Integer.valueOf(intValue));
            CompoundButtonCompat compoundButtonCompat2 = this.HaptikWebView;
            compoundButtonCompat2.ah$a("parse(): setting the iid to " + intValue + " (from local storage)");
        }
    }

    public String ag$a() {
        HashMap hashMap = new HashMap();
        hashMap.put("clId", this.valueOf.get("clientId"));
        return this.HaptikSDK$b.ag$a(hashMap);
    }

    /* loaded from: classes4.dex */
    class valueOf implements requestPermission {
        valueOf() {
        }

        @Override // o.requestPermission
        public void valueOf(boolean z, String str) {
            if (z) {
                Config.this.HaptikWebView.values("save(): configuration successfully saved to local storage.");
                return;
            }
            CompoundButtonCompat compoundButtonCompat = Config.this.HaptikWebView;
            compoundButtonCompat.toString("save(): error saving configuration to local storage: " + str);
        }
    }

    public void values() {
        this.getSignupData.valueOf("sdkConfig", ag$a(), new valueOf());
    }

    public void ah$a(CheckedTextViewCompat$ag$a checkedTextViewCompat$ag$a) {
        if (ah$a()) {
            checkedTextViewCompat$ag$a.ah$a();
        } else {
            this.getInitSettings.push(checkedTextViewCompat$ag$a);
        }
    }

    public Object ag$a(String str) {
        if (this.HaptikSDK$e) {
            return this.valueOf.get(str);
        }
        return null;
    }

    public void valueOf(String str, Object obj) {
        if (this.HaptikSDK$e) {
            this.valueOf.put(str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$b() {
        if (this.getInitSettings.empty()) {
            return;
        }
        while (true) {
            CheckedTextViewCompat$ag$a pop = this.getInitSettings.pop();
            if (pop == null) {
                return;
            }
            pop.ah$a();
        }
    }
}
