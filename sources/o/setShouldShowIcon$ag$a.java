package o;
/* loaded from: classes3.dex */
public final class setShouldShowIcon$ag$a extends setShouldShowIcon {
    private final boolean HaptikSDK$a;
    private String HaptikSDK$b;
    private final String ag$a;
    private boolean ah$a;
    private final String ah$b;
    private final int toString;
    private final String valueOf;
    private boolean values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setShouldShowIcon$ag$a) {
            setShouldShowIcon$ag$a setshouldshowicon_ag_a = (setShouldShowIcon$ag$a) obj;
            return this.toString == setshouldshowicon_ag_a.toString && runAnimators.values((Object) this.ag$a, (Object) setshouldshowicon_ag_a.ag$a) && runAnimators.values((Object) this.valueOf, (Object) setshouldshowicon_ag_a.valueOf) && runAnimators.values((Object) this.ah$b, (Object) setshouldshowicon_ag_a.ah$b) && this.values == setshouldshowicon_ag_a.values && this.ah$a == setshouldshowicon_ag_a.ah$a && runAnimators.values((Object) this.HaptikSDK$b, (Object) setshouldshowicon_ag_a.HaptikSDK$b) && this.HaptikSDK$a == setshouldshowicon_ag_a.HaptikSDK$a;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = this.toString;
        int hashCode = this.ag$a.hashCode();
        int hashCode2 = this.valueOf.hashCode();
        int hashCode3 = this.ah$b.hashCode();
        boolean z = this.values;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        boolean z2 = this.ah$a;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        String str = this.HaptikSDK$b;
        int hashCode4 = str == null ? 0 : str.hashCode();
        boolean z3 = this.HaptikSDK$a;
        return (((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + i3) * 31) + hashCode4) * 31) + (z3 ? 1 : z3 ? 1 : 0);
    }

    public String toString() {
        int i = this.toString;
        String str = this.ag$a;
        String str2 = this.valueOf;
        String str3 = this.ah$b;
        boolean z = this.values;
        boolean z2 = this.ah$a;
        String str4 = this.HaptikSDK$b;
        boolean z3 = this.HaptikSDK$a;
        return "HomeTeamLineUpVM(playerId=" + i + ", playerName=" + str + ", playerImageUrl=" + str2 + ", playerType=" + str3 + ", isPlayerSelected=" + z + ", isPlayerAnnounced=" + z2 + ", playingTypeIconUrl=" + str4 + ", showPlayingTypeIcon=" + z3 + ")";
    }

    public final String ah$a() {
        return this.ag$a;
    }

    public final int valueOf() {
        return this.toString;
    }

    public final String ag$a() {
        return this.ah$b;
    }

    public final String values() {
        return this.valueOf;
    }

    public final boolean HaptikSDK$a() {
        return this.ah$a;
    }

    public final boolean HaptikSDK$b() {
        return this.values;
    }

    public final void values(boolean z) {
        this.values = z;
    }

    public final String ah$b() {
        return this.HaptikSDK$b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setShouldShowIcon$ag$a(int i, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3) {
        super(null);
        runAnimators.ag$a(str, "playerName");
        runAnimators.ag$a(str2, "playerImageUrl");
        runAnimators.ag$a(str3, "playerType");
        this.toString = i;
        this.ag$a = str;
        this.valueOf = str2;
        this.ah$b = str3;
        this.values = z;
        this.ah$a = z2;
        this.HaptikSDK$b = str4;
        this.HaptikSDK$a = z3;
    }
}
