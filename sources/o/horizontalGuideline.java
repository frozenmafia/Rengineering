package o;
/* loaded from: classes3.dex */
public final class horizontalGuideline {
    private final map toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof horizontalGuideline) && runAnimators.values(this.toString, ((horizontalGuideline) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        map mapVar = this.toString;
        return "MiniProfileQueryResponse(user=" + mapVar + ")";
    }

    public horizontalGuideline(map mapVar) {
        runAnimators.ag$a(mapVar, "user");
        this.toString = mapVar;
    }

    public final map ag$a() {
        return this.toString;
    }
}
