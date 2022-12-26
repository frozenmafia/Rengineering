package o;

import android.content.Context;
import com.dream11.feature.downloader.FileType;
/* loaded from: classes4.dex */
public final class cancelChildViewTouch {
    private final String HaptikSDK$a;
    private final FileType ag$a;
    private final Context ah$a;
    private final String invoke;
    private final String toString;
    private final boolean valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cancelChildViewTouch) {
            cancelChildViewTouch cancelchildviewtouch = (cancelChildViewTouch) obj;
            return runAnimators.values(this.ah$a, cancelchildviewtouch.ah$a) && runAnimators.values((Object) this.invoke, (Object) cancelchildviewtouch.invoke) && runAnimators.values((Object) this.toString, (Object) cancelchildviewtouch.toString) && runAnimators.values((Object) this.values, (Object) cancelchildviewtouch.values) && this.ag$a == cancelchildviewtouch.ag$a && this.valueOf == cancelchildviewtouch.valueOf && runAnimators.values((Object) this.HaptikSDK$a, (Object) cancelchildviewtouch.HaptikSDK$a);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.ah$a.hashCode();
        int hashCode2 = this.invoke.hashCode();
        int hashCode3 = this.toString.hashCode();
        int hashCode4 = this.values.hashCode();
        int hashCode5 = this.ag$a.hashCode();
        boolean z = this.valueOf;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        String str = this.HaptikSDK$a;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i) * 31) + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        Context context = this.ah$a;
        String str = this.invoke;
        String str2 = this.toString;
        String str3 = this.values;
        FileType fileType = this.ag$a;
        boolean z = this.valueOf;
        String str4 = this.HaptikSDK$a;
        return "DownloadRequest(context=" + context + ", url=" + str + ", folderName=" + str2 + ", fileName=" + str3 + ", fileType=" + fileType + ", isCancellable=" + z + ", message=" + str4 + ")";
    }

    public cancelChildViewTouch(Context context, String str, String str2, String str3, FileType fileType, boolean z, String str4) {
        runAnimators.ag$a(context, "context");
        runAnimators.ag$a(str, "url");
        runAnimators.ag$a(str2, "folderName");
        runAnimators.ag$a(str3, "fileName");
        runAnimators.ag$a(fileType, "fileType");
        this.ah$a = context;
        this.invoke = str;
        this.toString = str2;
        this.values = str3;
        this.ag$a = fileType;
        this.valueOf = z;
        this.HaptikSDK$a = str4;
    }

    public final Context ag$a() {
        return this.ah$a;
    }

    public final String HaptikSDK$b() {
        return this.invoke;
    }

    public final String ah$a() {
        return this.toString;
    }

    public final String values() {
        return this.values;
    }

    public final FileType valueOf() {
        return this.ag$a;
    }

    public final boolean HaptikSDK$c() {
        return this.valueOf;
    }

    public final String ah$b() {
        return this.HaptikSDK$a;
    }
}
