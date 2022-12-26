package o;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import com.conviva.api.ConvivaConstants;
import com.conviva.sdk.ConvivaSdkConstants;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public class setExclusive implements requestStop {
    private Context values;

    @Override // o.requestStop
    public String HaptikSDK$a() {
        return null;
    }

    @Override // o.requestStop
    public String HaptikSDK$c() {
        return null;
    }

    @Override // o.requestStop
    public String HaptikSDK$e() {
        return null;
    }

    @Override // o.requestStop
    public String invoke() {
        return null;
    }

    public setExclusive(Context context) {
        this.values = null;
        this.values = context;
    }

    @Override // o.requestStop
    public String ag$a() {
        return Build.MODEL;
    }

    @Override // o.requestStop
    public ConvivaConstants.DeviceType HaptikSDK$b() {
        Context context;
        UiModeManager uiModeManager;
        if (Build.VERSION.SDK_INT >= 13 && (context = this.values) != null && (uiModeManager = (UiModeManager) context.getSystemService("uimode")) != null && uiModeManager.getCurrentModeType() == 4) {
            return ConvivaConstants.DeviceType.SETTOP;
        }
        return ConvivaConstants.DeviceType.UNKNOWN;
    }

    @Override // o.requestStop
    public String values() {
        return Build.MANUFACTURER;
    }

    @Override // o.requestStop
    public String ah$a() {
        return Build.BRAND;
    }

    @Override // o.requestStop
    public String HaptikSDK$d() {
        if (Build.MANUFACTURER.equalsIgnoreCase("amazon")) {
            return getButtonTintMode.ag$a("ro.build.mktg.fireos", "Unknown");
        }
        return Build.VERSION.RELEASE;
    }

    @Override // o.requestStop
    public Map<String, Object> ah$b() {
        Display display;
        if (this.values == null || Build.VERSION.SDK_INT < 17) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Point point = new Point();
        DisplayManager displayManager = (DisplayManager) this.values.getSystemService(ViewProps.DISPLAY);
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
            return null;
        }
        display.getRealSize(point);
        if (point.x <= 0 || point.y <= 0) {
            return null;
        }
        hashMap.put(ConvivaSdkConstants.DEVICEINFO.SCREEN_RESOLUTION_WIDTH, Integer.valueOf(point.x));
        hashMap.put(ConvivaSdkConstants.DEVICEINFO.SCREEN_RESOLUTION_HEIGHT, Integer.valueOf(point.y));
        hashMap.put(ConvivaSdkConstants.DEVICEINFO.SCREEN_RESOLUTION_SCALE_FACTOR, Double.valueOf(1.0d));
        return hashMap;
    }

    @Override // o.requestStop
    public String valueOf() {
        Context context = this.values;
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(this.values.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override // o.requestStop
    public void HaptikWebView() {
        this.values = null;
    }
}
