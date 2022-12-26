package o;
/* loaded from: classes3.dex */
public final class setBadgeIconType {
    private final getPriority ah$a;
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setBadgeIconType) {
            setBadgeIconType setbadgeicontype = (setBadgeIconType) obj;
            return runAnimators.values((Object) this.valueOf, (Object) setbadgeicontype.valueOf) && runAnimators.values(this.ah$a, setbadgeicontype.ah$a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.valueOf;
        int hashCode = str == null ? 0 : str.hashCode();
        getPriority getpriority = this.ah$a;
        return (hashCode * 31) + (getpriority != null ? getpriority.hashCode() : 0);
    }

    public String toString() {
        String str = this.valueOf;
        getPriority getpriority = this.ah$a;
        return "RecommendedFriendsInputData(source=" + str + ", callback=" + getpriority + ")";
    }

    public setBadgeIconType(String str, getPriority getpriority) {
        this.valueOf = str;
        this.ah$a = getpriority;
    }

    public final getPriority ah$a() {
        return this.ah$a;
    }

    public final String values() {
        return this.valueOf;
    }
}
