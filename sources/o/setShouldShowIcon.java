package o;
/* loaded from: classes3.dex */
public abstract class setShouldShowIcon {
    public /* synthetic */ setShouldShowIcon(getTargetTypes gettargettypes) {
        this();
    }

    private setShouldShowIcon() {
    }

    /* loaded from: classes3.dex */
    public static final class values extends setShouldShowIcon {
        private final boolean HaptikSDK$b;
        private final String HaptikSDK$c;
        private final String ag$a;
        private final String ah$a;
        private String invoke;
        private boolean toString;
        private final int valueOf;
        private boolean values;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof values) {
                values valuesVar = (values) obj;
                return this.valueOf == valuesVar.valueOf && runAnimators.values((Object) this.ah$a, (Object) valuesVar.ah$a) && runAnimators.values((Object) this.ag$a, (Object) valuesVar.ag$a) && runAnimators.values((Object) this.HaptikSDK$c, (Object) valuesVar.HaptikSDK$c) && this.values == valuesVar.values && this.toString == valuesVar.toString && runAnimators.values((Object) this.invoke, (Object) valuesVar.invoke) && this.HaptikSDK$b == valuesVar.HaptikSDK$b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int i = this.valueOf;
            int hashCode = this.ah$a.hashCode();
            int hashCode2 = this.ag$a.hashCode();
            int hashCode3 = this.HaptikSDK$c.hashCode();
            boolean z = this.values;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            boolean z2 = this.toString;
            int i3 = z2;
            if (z2 != 0) {
                i3 = 1;
            }
            String str = this.invoke;
            int hashCode4 = str == null ? 0 : str.hashCode();
            boolean z3 = this.HaptikSDK$b;
            return (((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + i3) * 31) + hashCode4) * 31) + (z3 ? 1 : z3 ? 1 : 0);
        }

        public String toString() {
            int i = this.valueOf;
            String str = this.ah$a;
            String str2 = this.ag$a;
            String str3 = this.HaptikSDK$c;
            boolean z = this.values;
            boolean z2 = this.toString;
            String str4 = this.invoke;
            boolean z3 = this.HaptikSDK$b;
            return "AwayTeamLineUpVM(playerId=" + i + ", playerName=" + str + ", playerImageUrl=" + str2 + ", playerType=" + str3 + ", isPlayerSelected=" + z + ", isPlayerAnnounced=" + z2 + ", playingTypeIconUrl=" + str4 + ", showPlayingTypeIcon=" + z3 + ")";
        }

        public final int ag$a() {
            return this.valueOf;
        }

        public final String valueOf() {
            return this.ah$a;
        }

        public final String ah$a() {
            return this.ag$a;
        }

        public final String values() {
            return this.HaptikSDK$c;
        }

        public final void ah$a(boolean z) {
            this.values = z;
        }

        public final boolean ah$b() {
            return this.toString;
        }

        public final boolean invoke() {
            return this.values;
        }

        public final String HaptikSDK$a() {
            return this.invoke;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public values(int i, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3) {
            super(null);
            runAnimators.ag$a(str, "playerName");
            runAnimators.ag$a(str2, "playerImageUrl");
            runAnimators.ag$a(str3, "playerType");
            this.valueOf = i;
            this.ah$a = str;
            this.ag$a = str2;
            this.HaptikSDK$c = str3;
            this.values = z;
            this.toString = z2;
            this.invoke = str4;
            this.HaptikSDK$b = z3;
        }
    }

    /* loaded from: classes3.dex */
    public static final class toString extends setShouldShowIcon {
        public static final toString ah$a = new toString();

        private toString() {
            super(null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class valueOf extends setShouldShowIcon {
        public static final valueOf toString = new valueOf();

        private valueOf() {
            super(null);
        }
    }
}
