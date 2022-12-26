package o;

import com.conviva.sdk.ConvivaSdkConstants;
import com.conviva.session.Monitor;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public class getValueAt {
    public static String ag$a = "ok";
    public static String ah$a = "sdk.android.1";
    public static String invoke = "2.6";
    public static String toString = "/0/wsg";
    public static String valueOf = "0";
    public static String values = "pending";

    public Map<String, Object> valueOf(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        hashMap.put("sch", ah$a);
        if (map.containsKey(ConvivaSdkConstants.DEVICEINFO.ANROID_BUILD_MODEL)) {
            hashMap.put("abm", map.get(ConvivaSdkConstants.DEVICEINFO.ANROID_BUILD_MODEL));
        }
        if (map.containsKey(ConvivaSdkConstants.DEVICEINFO.OPERATING_SYSTEM_VERSION)) {
            hashMap.put("osv", map.get(ConvivaSdkConstants.DEVICEINFO.OPERATING_SYSTEM_VERSION));
        }
        if (map.containsKey(ConvivaSdkConstants.DEVICEINFO.DEVICE_BRAND)) {
            hashMap.put("dvb", map.get(ConvivaSdkConstants.DEVICEINFO.DEVICE_BRAND));
        }
        if (map.containsKey(ConvivaSdkConstants.DEVICEINFO.DEVICE_MANUFACTURER)) {
            hashMap.put("dvma", map.get(ConvivaSdkConstants.DEVICEINFO.DEVICE_MANUFACTURER));
        }
        if (map.containsKey(ConvivaSdkConstants.DEVICEINFO.DEVICE_MODEL)) {
            hashMap.put("dvm", map.get(ConvivaSdkConstants.DEVICEINFO.DEVICE_MODEL));
        }
        if (map.containsKey("deviceType")) {
            hashMap.put("dvt", map.get("deviceType"));
        }
        if (map.containsKey(ConvivaSdkConstants.DEVICEINFO.DEVICE_VERSION)) {
            hashMap.put("dvv", map.get(ConvivaSdkConstants.DEVICEINFO.DEVICE_VERSION));
        }
        if (map.containsKey(ConvivaSdkConstants.FRAMEWORK_NAME)) {
            hashMap.put("fw", map.get(ConvivaSdkConstants.FRAMEWORK_NAME));
        }
        if (map.containsKey(ConvivaSdkConstants.FRAMEWORK_VERSION)) {
            hashMap.put("fwv", map.get(ConvivaSdkConstants.FRAMEWORK_VERSION));
        }
        if (map.containsKey(ConvivaSdkConstants.DEVICEINFO.SCREEN_RESOLUTION_WIDTH)) {
            hashMap.put("sw", map.get(ConvivaSdkConstants.DEVICEINFO.SCREEN_RESOLUTION_WIDTH));
        }
        if (map.containsKey(ConvivaSdkConstants.DEVICEINFO.SCREEN_RESOLUTION_HEIGHT)) {
            hashMap.put("sh", map.get(ConvivaSdkConstants.DEVICEINFO.SCREEN_RESOLUTION_HEIGHT));
        }
        if (map.containsKey(ConvivaSdkConstants.DEVICEINFO.SCREEN_RESOLUTION_SCALE_FACTOR)) {
            hashMap.put("scf", map.get(ConvivaSdkConstants.DEVICEINFO.SCREEN_RESOLUTION_SCALE_FACTOR));
        }
        return hashMap;
    }

    public static int valueOf(Monitor.InternalPlayerState internalPlayerState) {
        if (internalPlayerState == Monitor.InternalPlayerState.STOPPED) {
            return 1;
        }
        if (internalPlayerState == Monitor.InternalPlayerState.PLAYING) {
            return 3;
        }
        if (internalPlayerState == Monitor.InternalPlayerState.BUFFERING) {
            return 6;
        }
        if (internalPlayerState == Monitor.InternalPlayerState.PAUSED) {
            return 12;
        }
        return internalPlayerState == Monitor.InternalPlayerState.NOT_MONITORED ? 98 : 100;
    }
}
