package o;

import android.content.Context;
import android.location.Location;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.concurrent.Future;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class setCanOpenPopup extends getTraversalAfter {
    private final setBoundsInScreen HaptikSDK$b;
    private final isShowingHintText HaptikSDK$c;
    private final setPaneTitle ag$a;
    private final Context ah$a;
    private final CleverTapInstanceConfig toString;
    private int valueOf = 0;
    private int values = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCanOpenPopup(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, isShowingHintText isshowinghinttext, setPaneTitle setpanetitle) {
        this.ah$a = context;
        this.toString = cleverTapInstanceConfig;
        this.HaptikSDK$b = cleverTapInstanceConfig.HaptikSDK$c();
        this.HaptikSDK$c = isshowinghinttext;
        this.ag$a = setpanetitle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.getTraversalAfter
    public Future<?> ag$a(Location location) {
        if (location == null) {
            return null;
        }
        this.HaptikSDK$c.ag$a(location);
        setBoundsInScreen setboundsinscreen = this.HaptikSDK$b;
        String valueOf = this.toString.valueOf();
        setboundsinscreen.ah$a(valueOf, "Location updated (" + location.getLatitude() + ", " + location.getLongitude() + ")");
        if (this.HaptikSDK$c.asInterface() || CleverTapAPI.values()) {
            int values = values();
            if (this.HaptikSDK$c.asInterface() && values > this.values + 10) {
                Future<?> setpanetitle = this.ag$a.toString(this.ah$a, new JSONObject(), 2);
                ag$a(values);
                setBoundsInScreen setboundsinscreen2 = this.HaptikSDK$b;
                String valueOf2 = this.toString.valueOf();
                setboundsinscreen2.ah$a(valueOf2, "Queuing location ping event for geofence location (" + location.getLatitude() + ", " + location.getLongitude() + ")");
                return setpanetitle;
            } else if (this.HaptikSDK$c.asInterface() || values <= this.valueOf + 10) {
                return null;
            } else {
                Future<?> setpanetitle2 = this.ag$a.toString(this.ah$a, new JSONObject(), 2);
                ah$a(values);
                setBoundsInScreen setboundsinscreen3 = this.HaptikSDK$b;
                String valueOf3 = this.toString.valueOf();
                setboundsinscreen3.ah$a(valueOf3, "Queuing location ping event for location (" + location.getLatitude() + ", " + location.getLongitude() + ")");
                return setpanetitle2;
            }
        }
        return null;
    }

    void ah$a(int i) {
        this.valueOf = i;
    }

    void ag$a(int i) {
        this.values = i;
    }

    int values() {
        return (int) (System.currentTimeMillis() / 1000);
    }
}
