package com.clevertap.android.sdk.pushnotification;

import com.google.android.gms.measurement.AppMeasurement;
import o.setBoundsInScreen;
/* loaded from: classes4.dex */
public interface PushConstants {
    public static final String valueOf = PushType.FCM.toString();

    /* loaded from: classes4.dex */
    public enum PushType {
        FCM(AppMeasurement.FCM_ORIGIN, "fcm_token", "com.clevertap.android.sdk.pushnotification.fcm.FcmPushProvider", "com.google.firebase.messaging.FirebaseMessagingService", 1, ""),
        XPS("xps", "xps_token", "com.clevertap.android.xps.XiaomiPushProvider", "com.xiaomi.mipush.sdk.MiPushClient", 1, ""),
        HPS("hps", "hps_token", "com.clevertap.android.hms.HmsPushProvider", "com.huawei.hms.push.HmsMessageService", 1, ""),
        BPS("bps", "bps_token", "com.clevertap.android.bps.BaiduPushProvider", "com.baidu.android.pushservice.PushMessageReceiver", 1, ""),
        ADM("adm", "adm_token", "com.clevertap.android.adm.AmazonPushProvider", "com.amazon.device.messaging.ADM", 1, "");
        
        private final String ctProviderClassName;
        private final String messagingSDKClassName;
        private int runningDevices;
        private String serverRegion;
        private final String tokenPrefKey;
        private final String type;

        PushType(String str, String str2, String str3, String str4, int i, String str5) {
            this.type = str;
            this.tokenPrefKey = str2;
            this.ctProviderClassName = str3;
            this.messagingSDKClassName = str4;
            this.runningDevices = i;
            this.serverRegion = str5;
        }

        public String getCtProviderClassName() {
            return this.ctProviderClassName;
        }

        public String getMessagingSDKClassName() {
            return this.messagingSDKClassName;
        }

        public String getTokenPrefKey() {
            return this.tokenPrefKey;
        }

        public String getType() {
            return this.type;
        }

        public void setRunningDevices(int i) {
            this.runningDevices = i;
        }

        public int getRunningDevices() {
            return this.runningDevices;
        }

        public void setServerRegion(String str) {
            setBoundsInScreen.values("PushConstants: setServerRegion called with region:" + str);
            this.serverRegion = str;
        }

        public String getServerRegion() {
            setBoundsInScreen.values("PushConstants: getServerRegion called, returning region:" + this.serverRegion);
            return this.serverRegion;
        }

        @Override // java.lang.Enum
        public String toString() {
            return " [PushType:" + name() + "] ";
        }
    }
}
