package o;
/* loaded from: classes3.dex */
public final class getEditChoicesBeforeSending {
    private Integer toString;

    public getEditChoicesBeforeSending() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getEditChoicesBeforeSending) && runAnimators.values(this.toString, ((getEditChoicesBeforeSending) obj).toString);
    }

    public int hashCode() {
        Integer num = this.toString;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        Integer num = this.toString;
        return "CreateTeamResponseModel(id=" + num + ")";
    }

    public getEditChoicesBeforeSending(Integer num) {
        this.toString = num;
    }

    public /* synthetic */ getEditChoicesBeforeSending(Integer num, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : num);
    }
}
