package com.appsflyer.internal;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class bp extends bs {
    public final Map<String, Object> valueOf;

    public bp(Runnable runnable) {
        super("google", runnable);
        this.valueOf = new HashMap();
    }

    private static boolean AFInAppEventType(Context context) {
        ah.AFInAppEventParameterName();
        if (ah.values(ah.values(context), "appsFlyerCount", false) > 0) {
            AFLogger.AFInAppEventType("Install referrer will not load, the counter > 1, ");
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if (aa.values(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.AFKeystoreWrapper("Install referrer is allowed");
                return true;
            }
            AFLogger.AFKeystoreWrapper("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append("com.android.installreferrer.api.InstallReferrerClient");
            sb.append(" not found");
            AFLogger.AFInAppEventType(sb.toString());
            return false;
        } catch (Throwable th) {
            AFLogger.values("An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th);
            return false;
        }
    }

    @Override // com.appsflyer.internal.bs
    public final void AFInAppEventParameterName(final Context context) {
        if (AFInAppEventType(context)) {
            AFInAppEventType();
            try {
                final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                AFLogger.AFKeystoreWrapper("Connecting to Install Referrer Library...");
                build.startConnection(new InstallReferrerStateListener() { // from class: com.appsflyer.internal.bp.4
                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public final void onInstallReferrerSetupFinished(int i) {
                        bp.this.valueOf.put("code", String.valueOf(i));
                        bp.this.values.put("api_ver", Long.valueOf(aa.valueOf(context, "com.android.vending")));
                        bp.this.values.put("api_ver_name", aa.AFInAppEventParameterName(context, "com.android.vending"));
                        if (i == -1) {
                            AFLogger.AFInAppEventParameterName("InstallReferrer SERVICE_DISCONNECTED");
                            bp.this.values.put("response", "SERVICE_DISCONNECTED");
                        } else if (i == 0) {
                            bp.this.values.put("response", "OK");
                            try {
                                AFLogger.AFKeystoreWrapper("InstallReferrer connected");
                                if (build.isReady()) {
                                    ReferrerDetails installReferrer = build.getInstallReferrer();
                                    String installReferrer2 = installReferrer.getInstallReferrer();
                                    if (installReferrer2 != null) {
                                        bp.this.valueOf.put("val", installReferrer2);
                                        bp.this.values.put("referrer", installReferrer2);
                                    }
                                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                                    bp.this.valueOf.put("clk", Long.toString(referrerClickTimestampSeconds));
                                    bp.this.values.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                                    bp.this.valueOf.put("install", Long.toString(installBeginTimestampSeconds));
                                    bp.this.values.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                                    HashMap hashMap = new HashMap();
                                    try {
                                        boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                                        bp.this.valueOf.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                        hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                                    } catch (NoSuchMethodError unused) {
                                    }
                                    try {
                                        hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                                        hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                                        hashMap.put("install_version", installReferrer.getInstallVersion());
                                    } catch (NoSuchMethodError unused2) {
                                    }
                                    if (!hashMap.isEmpty()) {
                                        bp.this.values.put("google_custom", hashMap);
                                    }
                                } else {
                                    AFLogger.AFInAppEventParameterName("ReferrerClient: InstallReferrer is not ready");
                                    bp.this.valueOf.put(NotificationCompat.CATEGORY_ERROR, "ReferrerClient: InstallReferrer is not ready");
                                }
                            } catch (Throwable th) {
                                AFLogger.AFInAppEventParameterName("Failed to get install referrer: " + th.getMessage());
                                bp.this.valueOf.put(NotificationCompat.CATEGORY_ERROR, th.getMessage());
                            }
                        } else if (i == 1) {
                            bp.this.values.put("response", "SERVICE_UNAVAILABLE");
                            AFLogger.AFInAppEventParameterName("InstallReferrer not supported");
                        } else if (i == 2) {
                            AFLogger.AFInAppEventParameterName("InstallReferrer FEATURE_NOT_SUPPORTED");
                            bp.this.values.put("response", "FEATURE_NOT_SUPPORTED");
                        } else if (i != 3) {
                            AFLogger.AFInAppEventParameterName("responseCode not found.");
                        } else {
                            AFLogger.AFInAppEventParameterName("InstallReferrer DEVELOPER_ERROR");
                            bp.this.values.put("response", "DEVELOPER_ERROR");
                        }
                        AFLogger.AFKeystoreWrapper("Install Referrer collected locally");
                        bp.this.values();
                        build.endConnection();
                    }

                    @Override // com.android.installreferrer.api.InstallReferrerStateListener
                    public final void onInstallReferrerServiceDisconnected() {
                        AFLogger.AFKeystoreWrapper("Install Referrer service disconnected");
                    }
                });
            } catch (Throwable th) {
                AFLogger.values("referrerClient -> startConnection", th);
            }
        }
    }
}
