package o;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
/* loaded from: classes4.dex */
public class setShowingHintText {
    public static setTextEntryKey ag$a(Context context, String str, CleverTapInstanceConfig cleverTapInstanceConfig, getTouchDelegateInfo gettouchdelegateinfo, getRoleDescription getroledescription) {
        return new setTextEntryKey(str, cleverTapInstanceConfig, gettouchdelegateinfo, getroledescription, new InputConnectionCompat(context, cleverTapInstanceConfig));
    }
}
