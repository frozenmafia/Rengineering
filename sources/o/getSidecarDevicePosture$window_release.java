package o;
/* loaded from: classes5.dex */
public class getSidecarDevicePosture$window_release {
    public static final getSidecarDevicePosture$window_release ah$a = new getSidecarDevicePosture$window_release(false, false);
    public static final getSidecarDevicePosture$window_release toString = new getSidecarDevicePosture$window_release(true, true);
    private final boolean ag$a;
    private final boolean valueOf;

    public getSidecarDevicePosture$window_release(boolean z, boolean z2) {
        this.ag$a = z;
        this.valueOf = z2;
    }

    public String valueOf(String str) {
        String trim = str.trim();
        return !this.ag$a ? isWindowLayoutComponentValid.valueOf(trim) : trim;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public windowExtensionsProviderClass valueOf(windowExtensionsProviderClass windowextensionsproviderclass) {
        if (!this.valueOf) {
            windowextensionsproviderclass.ag$a();
        }
        return windowextensionsproviderclass;
    }
}
