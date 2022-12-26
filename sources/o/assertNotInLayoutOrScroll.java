package o;

import android.os.Bundle;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgn;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzid;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes7.dex */
public final class assertNotInLayoutOrScroll {
    private static final Set values = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));
    private static final List valueOf = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    private static final List ag$a = Arrays.asList("auto", "app", "am");
    private static final List toString = Arrays.asList("_r", "_dbg");
    private static final List ah$a = Arrays.asList((String[]) ArrayUtils.concat(zzgq.zza, zzgq.zzb));
    private static final List ah$b = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static collectAdjacentPrefetchPositions$ah$a ah$a(Bundle bundle) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(bundle);
        collectAdjacentPrefetchPositions$ah$a collectadjacentprefetchpositions_ah_a = new collectAdjacentPrefetchPositions$ah$a();
        collectadjacentprefetchpositions_ah_a.HaptikSDK$a = (String) com.google.android.gms.common.internal.Preconditions.checkNotNull((String) zzgn.zza(bundle, "origin", String.class, null));
        collectadjacentprefetchpositions_ah_a.ag$a = (String) com.google.android.gms.common.internal.Preconditions.checkNotNull((String) zzgn.zza(bundle, "name", String.class, null));
        collectadjacentprefetchpositions_ah_a.HaptikSDK$e = zzgn.zza(bundle, "value", Object.class, null);
        collectadjacentprefetchpositions_ah_a.HaptikSDK$c = (String) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        collectadjacentprefetchpositions_ah_a.getInitSettings = ((Long) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
        collectadjacentprefetchpositions_ah_a.HaptikSDK$b = (String) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        collectadjacentprefetchpositions_ah_a.ah$b = (Bundle) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        collectadjacentprefetchpositions_ah_a.getSignupData = (String) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        collectadjacentprefetchpositions_ah_a.HaptikWebView = (Bundle) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        collectadjacentprefetchpositions_ah_a.invoke = ((Long) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
        collectadjacentprefetchpositions_ah_a.values = (String) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        collectadjacentprefetchpositions_ah_a.valueOf = (Bundle) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        collectadjacentprefetchpositions_ah_a.ah$a = ((Boolean) zzgn.zza(bundle, "active", Boolean.class, false)).booleanValue();
        collectadjacentprefetchpositions_ah_a.toString = ((Long) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
        collectadjacentprefetchpositions_ah_a.HaptikSDK$d = ((Long) zzgn.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
        return collectadjacentprefetchpositions_ah_a;
    }

    public static boolean ah$a(String str) {
        return !ag$a.contains(str);
    }

    public static boolean ah$a(String str, Bundle bundle) {
        if (valueOf.contains(str)) {
            return false;
        }
        if (bundle != null) {
            for (String str2 : toString) {
                if (bundle.containsKey(str2)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean ah$a(String str, String str2, Bundle bundle) {
        char c;
        if ("_cmp".equals(str2)) {
            if (ah$a(str) && bundle != null) {
                for (String str3 : toString) {
                    if (bundle.containsKey(str3)) {
                        return false;
                    }
                }
                int hashCode = str.hashCode();
                if (hashCode == 101200) {
                    if (str.equals(AppMeasurement.FCM_ORIGIN)) {
                        c = 0;
                    }
                    c = 65535;
                } else if (hashCode != 101230) {
                    if (hashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                        c = 2;
                    }
                    c = 65535;
                } else {
                    if (str.equals("fdl")) {
                        c = 1;
                    }
                    c = 65535;
                }
                if (c == 0) {
                    bundle.putString("_cis", "fcm_integration");
                    return true;
                } else if (c == 1) {
                    bundle.putString("_cis", "fdl_integration");
                    return true;
                } else if (c != 2) {
                    return false;
                } else {
                    bundle.putString("_cis", "fiam_integration");
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static String toString(String str) {
        String zza = zzgo.zza(str);
        return zza != null ? zza : str;
    }

    public static boolean toString(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc");
        } else if ("_ln".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN);
        } else if (ah$a.contains(str2)) {
            return false;
        } else {
            for (String str3 : ah$b) {
                if (str2.matches(str3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean toString(collectAdjacentPrefetchPositions$ah$a collectadjacentprefetchpositions_ah_a) {
        String str;
        if (collectadjacentprefetchpositions_ah_a == null || (str = collectadjacentprefetchpositions_ah_a.HaptikSDK$a) == null || str.isEmpty()) {
            return false;
        }
        if ((collectadjacentprefetchpositions_ah_a.HaptikSDK$e == null || zzid.zza(collectadjacentprefetchpositions_ah_a.HaptikSDK$e) != null) && ah$a(str) && toString(str, collectadjacentprefetchpositions_ah_a.ag$a)) {
            if (collectadjacentprefetchpositions_ah_a.values == null || (ah$a(collectadjacentprefetchpositions_ah_a.values, collectadjacentprefetchpositions_ah_a.valueOf) && ah$a(str, collectadjacentprefetchpositions_ah_a.values, collectadjacentprefetchpositions_ah_a.valueOf))) {
                if (collectadjacentprefetchpositions_ah_a.getSignupData == null || (ah$a(collectadjacentprefetchpositions_ah_a.getSignupData, collectadjacentprefetchpositions_ah_a.HaptikWebView) && ah$a(str, collectadjacentprefetchpositions_ah_a.getSignupData, collectadjacentprefetchpositions_ah_a.HaptikWebView))) {
                    if (collectadjacentprefetchpositions_ah_a.HaptikSDK$b != null) {
                        return ah$a(collectadjacentprefetchpositions_ah_a.HaptikSDK$b, collectadjacentprefetchpositions_ah_a.ah$b) && ah$a(str, collectadjacentprefetchpositions_ah_a.HaptikSDK$b, collectadjacentprefetchpositions_ah_a.ah$b);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void valueOf(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static Bundle values(collectAdjacentPrefetchPositions$ah$a collectadjacentprefetchpositions_ah_a) {
        Bundle bundle = new Bundle();
        if (collectadjacentprefetchpositions_ah_a.HaptikSDK$a != null) {
            bundle.putString("origin", collectadjacentprefetchpositions_ah_a.HaptikSDK$a);
        }
        if (collectadjacentprefetchpositions_ah_a.ag$a != null) {
            bundle.putString("name", collectadjacentprefetchpositions_ah_a.ag$a);
        }
        if (collectadjacentprefetchpositions_ah_a.HaptikSDK$e != null) {
            zzgn.zzb(bundle, collectadjacentprefetchpositions_ah_a.HaptikSDK$e);
        }
        if (collectadjacentprefetchpositions_ah_a.HaptikSDK$c != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, collectadjacentprefetchpositions_ah_a.HaptikSDK$c);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, collectadjacentprefetchpositions_ah_a.getInitSettings);
        if (collectadjacentprefetchpositions_ah_a.HaptikSDK$b != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, collectadjacentprefetchpositions_ah_a.HaptikSDK$b);
        }
        if (collectadjacentprefetchpositions_ah_a.ah$b != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, collectadjacentprefetchpositions_ah_a.ah$b);
        }
        if (collectadjacentprefetchpositions_ah_a.getSignupData != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, collectadjacentprefetchpositions_ah_a.getSignupData);
        }
        if (collectadjacentprefetchpositions_ah_a.HaptikWebView != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, collectadjacentprefetchpositions_ah_a.HaptikWebView);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, collectadjacentprefetchpositions_ah_a.invoke);
        if (collectadjacentprefetchpositions_ah_a.values != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, collectadjacentprefetchpositions_ah_a.values);
        }
        if (collectadjacentprefetchpositions_ah_a.valueOf != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, collectadjacentprefetchpositions_ah_a.valueOf);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, collectadjacentprefetchpositions_ah_a.toString);
        bundle.putBoolean("active", collectadjacentprefetchpositions_ah_a.ah$a);
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, collectadjacentprefetchpositions_ah_a.HaptikSDK$d);
        return bundle;
    }

    public static boolean values(String str) {
        return !values.contains(str);
    }
}
