package o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.conviva.utils.Config;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public class setMinimumVelocity {
    public static ArrayList<String> ag$a = new ArrayList<>();
    private static Context ah$a = null;
    private static String valueOf = "UNKNOWN";

    public static void ag$a(Context context) {
        valueOf = System.getProperty("http.agent");
        if (ah$a == null) {
            ah$a = context;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("amazon")) {
            ag$a.add("c3.fp.fireAdId");
            return;
        }
        ag$a.add("c3.fp.gaId");
        ag$a.add("c3.fp.androidId");
        ag$a.add("c3.fp.gsfId");
    }

    public static String valueOf() {
        return valueOf;
    }

    public static boolean toString(String str) {
        Context context = ah$a;
        return context != null && androidx.core.app.ActivityCompat.checkSelfPermission(context, str) == 0;
    }

    public static Context values() {
        return ah$a;
    }

    public static String toString(Context context) {
        try {
            Cursor query = context.getContentResolver().query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
            if (query == null) {
                return "Not found";
            }
            if (query.moveToFirst() && query.getColumnCount() >= 2) {
                String hexString = Long.toHexString(Long.parseLong(query.getString(1)));
                query.close();
                return hexString.toUpperCase().trim();
            }
            query.close();
            return "Not found";
        } catch (SecurityException e) {
            e.printStackTrace();
            return Config.ConvivaIdErrorCodes.CONVIVAID_FETCH_ERROR.getValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return Config.ConvivaIdErrorCodes.CONVIVAID_FETCH_ERROR.getValue();
        }
    }

    private static String ah$a() {
        try {
            ContentResolver contentResolver = ah$a.getContentResolver();
            return Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0 ? Config.ConvivaIdErrorCodes.CONVIVAID_PRIVACY_RESTRICTION.getValue() : Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return Config.ConvivaIdErrorCodes.CONVIVAID_FETCH_ERROR.getValue();
        }
    }

    public static Map<String, String> valueOf(String str, Map<String, Boolean> map, Map<String, Boolean> map2) {
        String[] split;
        boolean z;
        String value;
        HashMap hashMap = new HashMap();
        for (String str2 : str.split(",")) {
            String str3 = "c3.fp." + str2;
            if (ag$a.contains(str3)) {
                boolean z2 = true;
                if (map == null || !map.containsKey(str2) || map.get(str2).booleanValue()) {
                    z = false;
                } else {
                    hashMap.put(str3, Config.ConvivaIdErrorCodes.CONVIVAID_USER_OPTOUT.getValue());
                    z = true;
                }
                if (map2 != null && map2.containsKey(str2) && map2.get(str2).booleanValue()) {
                    hashMap.put(str3, Config.ConvivaIdErrorCodes.CONVIVAID_USER_OPT_DELETE.getValue());
                } else {
                    z2 = false;
                }
                if (!z2 && !z) {
                    if (str3.equals("c3.fp.gsfId")) {
                        value = toString(ah$a);
                    } else if (str3.equals("c3.fp.androidId")) {
                        value = Settings.Secure.getString(ah$a.getContentResolver(), "android_id");
                    } else if (str3.equals("c3.fp.gaId")) {
                        try {
                            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(ah$a);
                            if (!advertisingIdInfo.isLimitAdTrackingEnabled()) {
                                value = advertisingIdInfo.getId();
                            } else {
                                value = Config.ConvivaIdErrorCodes.CONVIVAID_PRIVACY_RESTRICTION.getValue();
                            }
                        } catch (GooglePlayServicesNotAvailableException unused) {
                            value = Config.ConvivaIdErrorCodes.CONVIVAID_FETCH_ERROR.getValue();
                        } catch (GooglePlayServicesRepairableException unused2) {
                            value = Config.ConvivaIdErrorCodes.CONVIVAID_FETCH_ERROR.getValue();
                        } catch (IOException unused3) {
                            value = Config.ConvivaIdErrorCodes.CONVIVAID_FETCH_ERROR.getValue();
                        } catch (NoClassDefFoundError unused4) {
                            value = Config.ConvivaIdErrorCodes.CONVIVAID_FETCH_ERROR.getValue();
                        }
                    } else {
                        value = str3.equals("c3.fp.fireAdId") ? ah$a() : "";
                    }
                    hashMap.put(str3, value);
                }
            } else if (str2 != null && str2.length() > 0) {
                hashMap.put(str3, Config.ConvivaIdErrorCodes.CONVIVAID_NA.getValue());
            }
        }
        return hashMap;
    }

    public static void ag$a() {
        ah$a = null;
        ag$a.clear();
    }
}
