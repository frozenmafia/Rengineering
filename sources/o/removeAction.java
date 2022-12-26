package o;

import com.clevertap.android.sdk.inapp.CTInAppNotification;
import java.util.Map;
/* loaded from: classes3.dex */
public interface removeAction {
    boolean beforeShow(Map<String, Object> map);

    void onDismissed(Map<String, Object> map, Map<String, Object> map2);

    void values(CTInAppNotification cTInAppNotification);
}
