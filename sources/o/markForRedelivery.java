package o;

import android.content.Context;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.net.CronetProviderInstaller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
/* loaded from: classes4.dex */
public class markForRedelivery {
    public static CronetEngine ag$a(Context context, String str, boolean z) {
        ArrayList arrayList = new ArrayList(CronetProvider.getAllProviders(context));
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((CronetProvider) arrayList.get(size)).isEnabled() || CronetProvider.PROVIDER_NAME_FALLBACK.equals(((CronetProvider) arrayList.get(size)).getName())) {
                arrayList.remove(size);
            }
        }
        Collections.sort(arrayList, new Comparator<CronetProvider>(z) { // from class: o.markForRedelivery$ag$a
            private final boolean toString;

            {
                this.toString = z;
            }

            @Override // java.util.Comparator
            /* renamed from: values */
            public int compare(CronetProvider cronetProvider, CronetProvider cronetProvider2) {
                int valueOf = valueOf(cronetProvider) - valueOf(cronetProvider2);
                return valueOf != 0 ? valueOf : -ag$a(cronetProvider.getVersion(), cronetProvider2.getVersion());
            }

            private int valueOf(CronetProvider cronetProvider) {
                String name = cronetProvider.getName();
                if (CronetProvider.PROVIDER_NAME_APP_PACKAGED.equals(name)) {
                    return 1;
                }
                if (CronetProviderInstaller.PROVIDER_NAME.equals(name)) {
                    return this.toString ? 0 : 2;
                }
                return 3;
            }

            private static int ag$a(String str2, String str3) {
                if (str2 != null && str3 != null) {
                    String[] split = Util.split(str2, "\\.");
                    String[] split2 = Util.split(str3, "\\.");
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
        });
        for (int i = 0; i < arrayList.size(); i++) {
            String name = ((CronetProvider) arrayList.get(i)).getName();
            try {
                CronetEngine.Builder createBuilder = ((CronetProvider) arrayList.get(i)).createBuilder();
                if (str != null) {
                    createBuilder.setUserAgent(str);
                }
                createBuilder.enableHttp2(true);
                createBuilder.enableQuic(true);
                CronetEngine build = createBuilder.build();
                Log.d("CronetUtil", "CronetEngine built using " + name);
                return build;
            } catch (SecurityException unused) {
                Log.w("CronetUtil", "Failed to build CronetEngine. Please check that the process has android.permission.ACCESS_NETWORK_STATE.");
            } catch (UnsatisfiedLinkError unused2) {
                Log.w("CronetUtil", "Failed to link Cronet binaries. Please check that native Cronet binaries arebundled into your app.");
            }
        }
        Log.w("CronetUtil", "CronetEngine could not be built.");
        return null;
    }
}
