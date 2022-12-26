package o;

import com.bugsnag.android.BreadcrumbType;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes6.dex */
public class getStateDescription {
    public void toString(Map<String, Object> map, setContentChangeTypes setcontentchangetypes) {
        map.put("apiKey", setcontentchangetypes.ag$a());
        map.put("autoDetectErrors", Boolean.valueOf(setcontentchangetypes.HaptikSDK$a()));
        map.put("autoTrackSessions", Boolean.valueOf(setcontentchangetypes.ah$b()));
        map.put("sendThreads", setcontentchangetypes.onMessageChannelReady().toString());
        map.put("discardClasses", setcontentchangetypes.invoke());
        map.put("projectPackages", setcontentchangetypes.ak$b());
        map.put("enabledReleaseStages", setcontentchangetypes.HaptikWebView());
        map.put("releaseStage", setcontentchangetypes.onRelationshipValidationResult());
        map.put("buildUuid", setcontentchangetypes.HaptikSDK$b());
        if (setcontentchangetypes.values() != null) {
            map.put("appVersion", setcontentchangetypes.values());
        }
        map.put("versionCode", setcontentchangetypes.getDefaultImpl());
        map.put("type", setcontentchangetypes.valueOf());
        map.put("persistUser", Boolean.valueOf(setcontentchangetypes.extraCallbackWithResult()));
        map.put("launchCrashThresholdMs", Integer.valueOf((int) setcontentchangetypes.getSignupData()));
        map.put("maxBreadcrumbs", Integer.valueOf(setcontentchangetypes.onXdkEvent()));
        map.put("enabledBreadcrumbTypes", valueOf(setcontentchangetypes));
        map.put("enabledErrorTypes", ah$a(setcontentchangetypes));
        map.put("endpoints", ag$a(setcontentchangetypes));
    }

    private Collection<String> valueOf(setContentChangeTypes setcontentchangetypes) {
        Set<BreadcrumbType> HaptikSDK$e = setcontentchangetypes.HaptikSDK$e();
        if (HaptikSDK$e == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (BreadcrumbType breadcrumbType : HaptikSDK$e) {
            hashSet.add(breadcrumbType.toString());
        }
        return hashSet;
    }

    private Map<String, Object> ah$a(setContentChangeTypes setcontentchangetypes) {
        HashMap hashMap = new HashMap();
        postInvalidateOnAnimation initSettings = setcontentchangetypes.getInitSettings();
        hashMap.put("anrs", Boolean.valueOf(initSettings.valueOf()));
        hashMap.put("ndkCrashes", Boolean.valueOf(initSettings.ah$a()));
        hashMap.put("unhandledExceptions", Boolean.valueOf(initSettings.values()));
        hashMap.put("unhandledRejections", Boolean.valueOf(initSettings.HaptikSDK$b()));
        return hashMap;
    }

    private Map<String, Object> ag$a(setContentChangeTypes setcontentchangetypes) {
        HashMap hashMap = new HashMap();
        offsetTopAndBottom HaptikSDK$d = setcontentchangetypes.HaptikSDK$d();
        hashMap.put("notify", HaptikSDK$d.values());
        hashMap.put("sessions", HaptikSDK$d.ag$a());
        return hashMap;
    }
}
