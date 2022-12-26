package com.facebook.react.modules.share;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.fbreact.specs.NativeShareModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import o.FragmentStateManager;
import o.isAfterLast;
import org.apache.http.protocol.HTTP;
@FragmentStateManager.AnonymousClass1(values = ShareModule.NAME)
/* loaded from: classes4.dex */
public class ShareModule extends NativeShareModuleSpec {
    static final String ACTION_SHARED = "sharedAction";
    static final String ERROR_INVALID_CONTENT = "E_INVALID_CONTENT";
    static final String ERROR_UNABLE_TO_OPEN_DIALOG = "E_UNABLE_TO_OPEN_DIALOG";
    public static final String NAME = "ShareModule";
    private static int ah$a = 199;
    private static int toString = 0;
    private static int valueOf = 1;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        int i = valueOf + 79;
        toString = i % 128;
        if (!(i % 2 == 0)) {
            int i2 = 16 / 0;
        }
        int i3 = toString + 55;
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            return NAME;
        }
        Object obj = null;
        super.hashCode();
        return NAME;
    }

    public ShareModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeShareModuleSpec
    public void share(ReadableMap readableMap, String str, Promise promise) {
        if (readableMap == null) {
            int i = valueOf + 27;
            toString = i % 128;
            int i2 = i % 2;
            promise.reject(ERROR_INVALID_CONTENT, "Content cannot be null");
            int i3 = toString + 1;
            valueOf = i3 % 128;
            if ((i3 % 2 == 0 ? (char) 19 : '@') != '@') {
                Object[] objArr = null;
                int length = objArr.length;
                return;
            }
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setTypeAndNormalize(HTTP.PLAIN_TEXT_TYPE);
            if (readableMap.hasKey(ah$a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 307, true, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 5, new char[]{65535, 7, 65532, 7, 65528}).intern())) {
                intent.putExtra("android.intent.extra.SUBJECT", readableMap.getString(ah$a(4 - ExpandableListView.getPackedPositionGroup(0L), 307 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), true, 5 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{65535, 7, 65532, 7, 65528}).intern()));
                int i4 = valueOf + 85;
                toString = i4 % 128;
                int i5 = i4 % 2;
            }
            if (!(!readableMap.hasKey("message"))) {
                intent.putExtra("android.intent.extra.TEXT", readableMap.getString("message"));
            }
            Intent createChooser = Intent.createChooser(intent, str);
            createChooser.addCategory("android.intent.category.DEFAULT");
            Activity currentActivity = getCurrentActivity();
            if (!(currentActivity == null)) {
                currentActivity.startActivity(createChooser);
            } else {
                getReactApplicationContext().startActivity(createChooser);
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString("action", ACTION_SHARED);
            promise.resolve(createMap);
        } catch (Exception unused) {
            promise.reject(ERROR_UNABLE_TO_OPEN_DIALOG, "Failed to open share dialog");
        }
    }

    private static String ah$a(int i, int i2, boolean z, int i3, char[] cArr) {
        String str;
        synchronized (isAfterLast.valueOf) {
            char[] cArr2 = new char[i3];
            isAfterLast.values = 0;
            while (isAfterLast.values < i3) {
                isAfterLast.ag$a = cArr[isAfterLast.values];
                cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                int i4 = isAfterLast.values;
                cArr2[i4] = (char) (cArr2[i4] - ah$a);
                isAfterLast.values++;
            }
            if (i > 0) {
                isAfterLast.toString = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                isAfterLast.values = 0;
                while (isAfterLast.values < i3) {
                    cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                    isAfterLast.values++;
                }
                cArr2 = cArr4;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
