package o;
/* loaded from: classes5.dex */
public class saveOriginalDelegate extends dispatchAddFinished {
    private static final shouldBeKeptAsChild valueOf = shouldBeKeptAsChild.ah$a();
    private final linearEqualitySearch ag$a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public saveOriginalDelegate(linearEqualitySearch linearequalitysearch) {
        this.ag$a = linearequalitysearch;
    }

    @Override // o.dispatchAddFinished
    public boolean ah$a() {
        if (valueOf()) {
            return true;
        }
        valueOf.ah$a("ApplicationInfo is invalid");
        return false;
    }

    private boolean valueOf() {
        linearEqualitySearch linearequalitysearch = this.ag$a;
        if (linearequalitysearch == null) {
            valueOf.ah$a("ApplicationInfo is null");
            return false;
        } else if (!linearequalitysearch.HaptikSDK$b()) {
            valueOf.ah$a("GoogleAppId is null");
            return false;
        } else if (!this.ag$a.HaptikSDK$a()) {
            valueOf.ah$a("AppInstanceId is null");
            return false;
        } else if (!this.ag$a.ah$b()) {
            valueOf.ah$a("ApplicationProcessState is null");
            return false;
        } else if (this.ag$a.invoke()) {
            if (!this.ag$a.valueOf().values()) {
                valueOf.ah$a("AndroidAppInfo.packageName is null");
                return false;
            } else if (this.ag$a.valueOf().ah$b()) {
                return true;
            } else {
                valueOf.ah$a("AndroidAppInfo.sdkVersion is null");
                return false;
            }
        } else {
            return true;
        }
    }
}
