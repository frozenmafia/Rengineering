package o;

import com.app.dream11.privacy.privacygqlmapper.SettingName;
/* loaded from: classes3.dex */
public final class getIncomingEdgesInternal {
    private final boolean HaptikSDK$a;
    private final SettingName ag$a;
    private final String ah$a;
    private final dfs toString;
    private final String valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getIncomingEdgesInternal) {
            getIncomingEdgesInternal getincomingedgesinternal = (getIncomingEdgesInternal) obj;
            return runAnimators.values(this.toString, getincomingedgesinternal.toString) && runAnimators.values((Object) this.valueOf, (Object) getincomingedgesinternal.valueOf) && runAnimators.values((Object) this.values, (Object) getincomingedgesinternal.values) && this.ag$a == getincomingedgesinternal.ag$a && this.HaptikSDK$a == getincomingedgesinternal.HaptikSDK$a && runAnimators.values((Object) this.ah$a, (Object) getincomingedgesinternal.ah$a);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        dfs dfsVar = this.toString;
        int hashCode = dfsVar == null ? 0 : dfsVar.hashCode();
        int hashCode2 = this.valueOf.hashCode();
        int hashCode3 = this.values.hashCode();
        int hashCode4 = this.ag$a.hashCode();
        boolean z = this.HaptikSDK$a;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        String str = this.ah$a;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i) * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        dfs dfsVar = this.toString;
        String str = this.valueOf;
        String str2 = this.values;
        SettingName settingName = this.ag$a;
        boolean z = this.HaptikSDK$a;
        String str3 = this.ah$a;
        return "Setting(confirmationPopup=" + dfsVar + ", displayName=" + str + ", desc=" + str2 + ", type=" + settingName + ", value=" + z + ", link=" + str3 + ")";
    }

    public getIncomingEdgesInternal(dfs dfsVar, String str, String str2, SettingName settingName, boolean z, String str3) {
        runAnimators.ag$a(str, "displayName");
        runAnimators.ag$a(str2, "desc");
        runAnimators.ag$a(settingName, "type");
        this.toString = dfsVar;
        this.valueOf = str;
        this.values = str2;
        this.ag$a = settingName;
        this.HaptikSDK$a = z;
        this.ah$a = str3;
    }

    public final dfs values() {
        return this.toString;
    }

    public final String ag$a() {
        return this.valueOf;
    }

    public final String ah$a() {
        return this.values;
    }

    public final SettingName invoke() {
        return this.ag$a;
    }

    public final boolean HaptikSDK$a() {
        return this.HaptikSDK$a;
    }

    public final String valueOf() {
        return this.ah$a;
    }
}
