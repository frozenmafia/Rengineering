package o;

import android.app.Activity;
import android.location.Location;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class isShowingHintText extends isHeading {
    private static boolean ag$a = false;
    private static int ah$a;
    private static WeakReference<Activity> toString;
    private static int values;
    private boolean ak;
    private boolean extraCallbackWithResult;
    private String onXdkEvent;
    private long valueOf = 0;
    private boolean ah$b = false;
    private final Object HaptikSDK$b = new Object();
    private String invoke = null;
    private int HaptikSDK$c = 0;
    private boolean HaptikSDK$d = false;
    private boolean getInitSettings = false;
    private boolean getSignupData = false;
    private int HaptikSDK$e = 0;
    private boolean isLogoutPending = false;
    private boolean aj$a = false;
    private boolean a = false;
    private int ak$a = 0;
    private Location extraCallback = null;
    private final Object ak$b = new Object();
    private HashMap<String, Integer> HaptikWebView = new HashMap<>();
    private long onMessageChannelReady = 0;
    private String onPostMessage = null;
    private String ICustomTabsCallback = null;
    private String HaptikSDK$a = null;
    private JSONObject ICustomTabsCallback$Default = null;

    public static Activity values() {
        WeakReference<Activity> weakReference = toString;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public String aj$a() {
        return this.onXdkEvent;
    }

    public void ag$a(String str) {
        this.onXdkEvent = str;
    }

    public static void values(Activity activity) {
        if (activity == null) {
            toString = null;
        } else if (activity.getLocalClassName().contains("InAppNotificationActivity")) {
        } else {
            toString = new WeakReference<>(activity);
        }
    }

    public static String valueOf() {
        Activity values2 = values();
        if (values2 != null) {
            return values2.getLocalClassName();
        }
        return null;
    }

    public static boolean invoke() {
        return ag$a;
    }

    public long HaptikSDK$d() {
        return this.valueOf;
    }

    public void toString(long j) {
        this.valueOf = j;
    }

    public Location onXdkEvent() {
        return this.extraCallback;
    }

    public void ag$a(Location location) {
        this.extraCallback = location;
    }

    public boolean getDefaultImpl() {
        return this.ak;
    }

    public void HaptikSDK$a(boolean z) {
        this.ak = z;
    }

    public void ah$a(String str) {
        this.invoke = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void HaptikSDK$b() {
        synchronized (this) {
            this.HaptikSDK$a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$b() {
        synchronized (this) {
            this.ICustomTabsCallback = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void HaptikSDK$a() {
        synchronized (this) {
            this.onPostMessage = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getSignupData() {
        synchronized (this) {
            this.ICustomTabsCallback$Default = null;
        }
    }

    public void valueOf(String str) {
        synchronized (this) {
            if (this.HaptikSDK$a == null) {
                this.HaptikSDK$a = str;
            }
        }
    }

    public String HaptikWebView() {
        String str;
        synchronized (this) {
            str = this.HaptikSDK$a;
        }
        return str;
    }

    public int getInitSettings() {
        return this.HaptikSDK$c;
    }

    public int isLogoutPending() {
        return this.HaptikSDK$e;
    }

    public void values(int i) {
        this.HaptikSDK$e = i;
    }

    public HashMap<String, Integer> HaptikSDK$e() {
        return this.HaptikWebView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$a(int i) {
        this.ak$a = i;
    }

    public int a() {
        return this.ak$a;
    }

    public void toString(String str) {
        synchronized (this) {
            if (this.ICustomTabsCallback == null) {
                this.ICustomTabsCallback = str;
            }
        }
    }

    public String ak() {
        String str;
        synchronized (this) {
            str = this.ICustomTabsCallback;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values(long j) {
        this.onMessageChannelReady = j;
    }

    public long ak$b() {
        return this.onMessageChannelReady;
    }

    public String ICustomTabsCallback() {
        String str;
        synchronized (this) {
            str = this.onPostMessage;
        }
        return str;
    }

    public void values(String str) {
        synchronized (this) {
            if (this.onPostMessage == null) {
                this.onPostMessage = str;
            }
        }
    }

    public String ak$a() {
        return this.invoke;
    }

    public void values(JSONObject jSONObject) {
        synchronized (this) {
            if (this.ICustomTabsCallback$Default == null) {
                this.ICustomTabsCallback$Default = jSONObject;
            }
        }
    }

    public JSONObject extraCallbackWithResult() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.ICustomTabsCallback$Default;
        }
        return jSONObject;
    }

    public boolean extraCallback() {
        return this.HaptikSDK$c > 0;
    }

    public void ah$a(boolean z) {
        synchronized (this.HaptikSDK$b) {
            this.ah$b = z;
        }
    }

    public boolean onNavigationEvent() {
        boolean z;
        synchronized (this.HaptikSDK$b) {
            z = this.ah$b;
        }
        return z;
    }

    public boolean onRelationshipValidationResult() {
        return this.aj$a;
    }

    public void values(boolean z) {
        this.aj$a = z;
    }

    public void toString(boolean z) {
        synchronized (this.ak$b) {
            this.HaptikSDK$d = z;
        }
    }

    public boolean onMessageChannelReady() {
        boolean z;
        synchronized (this.ak$b) {
            z = this.HaptikSDK$d;
        }
        return z;
    }

    public boolean ICustomTabsCallback$Default() {
        return this.getInitSettings;
    }

    public void valueOf(boolean z) {
        this.getInitSettings = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ah$b(boolean z) {
        this.getSignupData = z;
    }

    public boolean onPostMessage() {
        return this.getSignupData;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void HaptikSDK$c(boolean z) {
        this.isLogoutPending = z;
    }

    public boolean asBinder() {
        return this.isLogoutPending;
    }

    public boolean asInterface() {
        return this.a;
    }

    public void invoke(boolean z) {
        this.a = z;
    }

    public void HaptikSDK$b(boolean z) {
        this.extraCallbackWithResult = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(int i) {
        this.HaptikSDK$c = i;
    }

    public boolean setDefaultImpl() {
        return this.extraCallbackWithResult;
    }

    public static void valueOf(int i) {
        ah$a = i;
    }

    public static void HaptikSDK$c() {
        ah$a++;
    }
}
