package o;

import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.fresco.ui.common.DimensionsInfo;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
/* loaded from: classes4.dex */
public class doLoaderDestroy {
    private ImageRequest HaptikSDK$b;
    private ImageRequest HaptikSDK$c;
    private ControllerListener2.Extras HaptikSDK$d;
    private DimensionsInfo HaptikWebView;
    private String ICustomTabsCallback$Default;
    private ImageRequest a;
    private String ag$a;
    private String ah$b;
    private ImageInfo aj$a;
    private boolean ak$a;
    private Throwable getSignupData;
    private ImageRequest[] invoke;
    private String onRelationshipValidationResult;
    private Object valueOf;
    private long getInitSettings = -1;
    private long HaptikSDK$a = -1;
    private long toString = -1;
    private long ah$a = -1;
    private long values = -1;
    private long ICustomTabsCallback = -1;
    private long isLogoutPending = -1;
    private int onXdkEvent = 1;
    private int extraCallback = -1;
    private int ak$b = -1;
    private int ak = -1;
    private int onPostMessage = -1;
    private long onNavigationEvent = -1;
    private long extraCallbackWithResult = -1;
    private long HaptikSDK$e = -1;

    public void ag$a() {
        this.onRelationshipValidationResult = null;
        this.a = null;
        this.valueOf = null;
        this.aj$a = null;
        this.HaptikSDK$c = null;
        this.HaptikSDK$b = null;
        this.invoke = null;
        this.onXdkEvent = 1;
        this.ICustomTabsCallback$Default = null;
        this.ak$a = false;
        this.extraCallback = -1;
        this.ak$b = -1;
        this.getSignupData = null;
        this.ak = -1;
        this.onPostMessage = -1;
        this.ag$a = null;
        this.HaptikWebView = null;
        this.HaptikSDK$d = null;
        valueOf();
    }

    public void valueOf() {
        this.ICustomTabsCallback = -1L;
        this.isLogoutPending = -1L;
        this.getInitSettings = -1L;
        this.toString = -1L;
        this.ah$a = -1L;
        this.values = -1L;
        this.onNavigationEvent = -1L;
        this.extraCallbackWithResult = -1L;
        this.HaptikSDK$e = -1L;
    }

    public void values(int i) {
        this.ak = i;
    }

    public int ah$a() {
        return this.ak;
    }

    public void ah$a(String str) {
        this.ah$b = str;
    }

    public void valueOf(String str) {
        this.onRelationshipValidationResult = str;
    }

    public void values(ImageRequest imageRequest) {
        this.a = imageRequest;
    }

    public void values(ImageRequest imageRequest, ImageRequest imageRequest2, ImageRequest[] imageRequestArr) {
        this.HaptikSDK$c = imageRequest;
        this.HaptikSDK$b = imageRequest2;
        this.invoke = imageRequestArr;
    }

    public void values(Object obj) {
        this.valueOf = obj;
    }

    public void ag$a(long j) {
        this.getInitSettings = j;
    }

    public void values(long j) {
        this.HaptikSDK$a = j;
    }

    public void valueOf(long j) {
        this.toString = j;
    }

    public void ah$a(long j) {
        this.ah$a = j;
    }

    public void toString(long j) {
        this.values = j;
    }

    public void HaptikSDK$c(long j) {
        this.ICustomTabsCallback = j;
    }

    public void ah$b(long j) {
        this.isLogoutPending = j;
    }

    public void HaptikSDK$b(long j) {
        this.onNavigationEvent = j;
    }

    public void HaptikSDK$a(long j) {
        this.extraCallbackWithResult = j;
    }

    public void valueOf(int i) {
        this.onXdkEvent = i;
    }

    public void values(String str) {
        this.ICustomTabsCallback$Default = str;
    }

    public void toString(boolean z) {
        this.ak$a = z;
    }

    public void ag$a(ImageInfo imageInfo) {
        this.aj$a = imageInfo;
    }

    public void ag$a(int i) {
        this.extraCallback = i;
    }

    public void toString(int i) {
        this.ak$b = i;
    }

    public void toString(Throwable th) {
        this.getSignupData = th;
    }

    public void valueOf(boolean z) {
        this.onPostMessage = z ? 1 : 2;
    }

    public void invoke(long j) {
        this.HaptikSDK$e = j;
    }

    public dispatchPrepareOptionsMenu values() {
        return new dispatchPrepareOptionsMenu(this.ah$b, this.onRelationshipValidationResult, this.a, this.valueOf, this.aj$a, this.HaptikSDK$c, this.HaptikSDK$b, this.invoke, this.getInitSettings, this.HaptikSDK$a, this.toString, this.ah$a, this.values, this.ICustomTabsCallback, this.isLogoutPending, this.onXdkEvent, this.ICustomTabsCallback$Default, this.ak$a, this.extraCallback, this.ak$b, this.getSignupData, this.onPostMessage, this.onNavigationEvent, this.extraCallbackWithResult, this.ag$a, this.HaptikSDK$e, this.HaptikWebView, this.HaptikSDK$d);
    }

    public void ag$a(DimensionsInfo dimensionsInfo) {
        this.HaptikWebView = dimensionsInfo;
    }

    public void valueOf(ControllerListener2.Extras extras) {
        this.HaptikSDK$d = extras;
    }
}
