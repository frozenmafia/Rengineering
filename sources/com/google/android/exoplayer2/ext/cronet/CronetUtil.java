package com.google.android.exoplayer2.ext.cronet;

import android.content.Context;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
/* loaded from: classes7.dex */
public final class CronetUtil {
    private static final String TAG = "CronetUtil";

    public static CronetEngine buildCronetEngine(Context context) {
        return buildCronetEngine(context, null, false);
    }

    public static CronetEngine buildCronetEngine(Context context, String str, boolean z) {
        ArrayList arrayList = new ArrayList(CronetProvider.getAllProviders(context));
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((CronetProvider) arrayList.get(size)).isEnabled() || CronetProvider.PROVIDER_NAME_FALLBACK.equals(((CronetProvider) arrayList.get(size)).getName())) {
                arrayList.remove(size);
            }
        }
        Collections.sort(arrayList, new CronetProviderComparator(z));
        for (int i = 0; i < arrayList.size(); i++) {
            String name = ((CronetProvider) arrayList.get(i)).getName();
            try {
                CronetEngine.Builder createBuilder = ((CronetProvider) arrayList.get(i)).createBuilder();
                if (str != null) {
                    createBuilder.setUserAgent(str);
                }
                CronetEngine build = createBuilder.build();
                Log.d(TAG, "CronetEngine built using " + name);
                return build;
            } catch (SecurityException unused) {
                Log.w(TAG, "Failed to build CronetEngine. Please check that the process has android.permission.ACCESS_NETWORK_STATE.");
            } catch (UnsatisfiedLinkError unused2) {
                Log.w(TAG, "Failed to link Cronet binaries. Please check that native Cronet binaries arebundled into your app.");
            }
        }
        Log.w(TAG, "CronetEngine could not be built.");
        return null;
    }

    private CronetUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class CronetProviderComparator implements Comparator<CronetProvider> {
        private static final String GOOGLE_PLAY_SERVICES_PROVIDER_NAME = "Google-Play-Services-Cronet-Provider";
        private final boolean preferGooglePlayServices;

        public CronetProviderComparator(boolean z) {
            this.preferGooglePlayServices = z;
        }

        @Override // java.util.Comparator
        public int compare(CronetProvider cronetProvider, CronetProvider cronetProvider2) {
            int priority = getPriority(cronetProvider) - getPriority(cronetProvider2);
            return priority != 0 ? priority : -compareVersionStrings(cronetProvider.getVersion(), cronetProvider2.getVersion());
        }

        private int getPriority(CronetProvider cronetProvider) {
            String name = cronetProvider.getName();
            if (CronetProvider.PROVIDER_NAME_APP_PACKAGED.equals(name)) {
                return 1;
            }
            if ("Google-Play-Services-Cronet-Provider".equals(name)) {
                return this.preferGooglePlayServices ? 0 : 2;
            }
            return 3;
        }

        private static int compareVersionStrings(String str, String str2) {
            if (str != null && str2 != null) {
                String[] split = Util.split(str, "\\.");
                String[] split2 = Util.split(str2, "\\.");
                int min = Math.min(split.length, split2.length);
                for (int i = 0; i < min; i++) {
                    if (!split[i].equals(split2[i])) {
                        try {
                            return Integer.parseInt(split[i]) - Integer.parseInt(split2[i]);
                        } catch (NumberFormatException unused) {
                            return 0;
                        }
                    }
                }
            }
            return 0;
        }
    }
}
