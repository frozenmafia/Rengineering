package o;

import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.fresco.ui.common.DimensionsInfo;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
/* loaded from: classes4.dex */
public class dispatchPrepareOptionsMenu {
    private final long HaptikSDK$a;
    private final ImageRequest HaptikSDK$b;
    private final String HaptikSDK$c;
    private final long HaptikSDK$d;
    private final DimensionsInfo HaptikSDK$e;
    private final long HaptikWebView;
    private final long ICustomTabsCallback;
    private final int a;
    private final long ag$a;
    private final String ah$a;
    private final ImageRequest ah$b;
    private final long aj$a;
    private final ImageInfo ak;
    private final boolean ak$a;
    private final int ak$b;
    private final String extraCallback;
    private final int extraCallbackWithResult;
    private ControllerListener2.Extras getInitSettings;
    private final Throwable getSignupData;
    private final ImageRequest[] invoke;
    private final long isLogoutPending;
    private final String onMessageChannelReady;
    private final int onNavigationEvent;
    private final long onPostMessage;
    private final ImageRequest onXdkEvent;
    private final long toString;
    private final Object valueOf;
    private final long values;

    public dispatchPrepareOptionsMenu(String str, String str2, ImageRequest imageRequest, Object obj, ImageInfo imageInfo, ImageRequest imageRequest2, ImageRequest imageRequest3, ImageRequest[] imageRequestArr, long j, long j2, long j3, long j4, long j5, long j6, long j7, int i, String str3, boolean z, int i2, int i3, Throwable th, int i4, long j8, long j9, String str4, long j10, DimensionsInfo dimensionsInfo, ControllerListener2.Extras extras) {
        this.HaptikSDK$c = str;
        this.extraCallback = str2;
        this.onXdkEvent = imageRequest;
        this.valueOf = obj;
        this.ak = imageInfo;
        this.ah$b = imageRequest2;
        this.HaptikSDK$b = imageRequest3;
        this.invoke = imageRequestArr;
        this.HaptikSDK$d = j;
        this.HaptikSDK$a = j2;
        this.ag$a = j3;
        this.toString = j4;
        this.values = j5;
        this.isLogoutPending = j6;
        this.aj$a = j7;
        this.a = i;
        this.onMessageChannelReady = str3;
        this.ak$a = z;
        this.ak$b = i2;
        this.extraCallbackWithResult = i3;
        this.getSignupData = th;
        this.onNavigationEvent = i4;
        this.onPostMessage = j8;
        this.ICustomTabsCallback = j9;
        this.ah$a = str4;
        this.HaptikWebView = j10;
        this.HaptikSDK$e = dimensionsInfo;
        this.getInitSettings = extras;
    }
}
