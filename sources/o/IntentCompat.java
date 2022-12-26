package o;
/* loaded from: classes3.dex */
public final class IntentCompat {
    private final String HaptikSDK$c;
    private final String ag$a;
    private final String ah$a;
    private final boolean invoke;
    private final String toString;
    private final String valueOf;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntentCompat) {
            IntentCompat intentCompat = (IntentCompat) obj;
            return runAnimators.values((Object) this.ah$a, (Object) intentCompat.ah$a) && runAnimators.values((Object) this.ag$a, (Object) intentCompat.ag$a) && runAnimators.values((Object) this.values, (Object) intentCompat.values) && runAnimators.values((Object) this.valueOf, (Object) intentCompat.valueOf) && runAnimators.values((Object) this.HaptikSDK$c, (Object) intentCompat.HaptikSDK$c) && runAnimators.values((Object) this.toString, (Object) intentCompat.toString) && this.invoke == intentCompat.invoke;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.ah$a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ag$a;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.values;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.valueOf;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.HaptikSDK$c;
        int hashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.toString;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        boolean z = this.invoke;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public String toString() {
        String str = this.ah$a;
        String str2 = this.ag$a;
        String str3 = this.values;
        String str4 = this.valueOf;
        String str5 = this.HaptikSDK$c;
        String str6 = this.toString;
        boolean z = this.invoke;
        return "PlayerInfoMetaModel(playerName=" + str + ", playerType=" + str2 + ", playerNationality=" + str3 + ", birthday=" + str4 + ", skillInfo=" + str5 + ", playingTypeIconUrl=" + str6 + ", shouldShowPlayingType=" + z + ")";
    }

    public IntentCompat(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.ah$a = str;
        this.ag$a = str2;
        this.values = str3;
        this.valueOf = str4;
        this.HaptikSDK$c = str5;
        this.toString = str6;
        this.invoke = z;
    }

    public final String values() {
        return this.ag$a;
    }

    public final String ag$a() {
        return this.values;
    }

    public final String ah$a() {
        return this.valueOf;
    }

    public final String HaptikSDK$a() {
        return this.HaptikSDK$c;
    }

    public final String valueOf() {
        return this.toString;
    }

    public final boolean HaptikSDK$b() {
        return this.invoke;
    }
}
