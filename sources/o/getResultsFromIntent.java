package o;
/* loaded from: classes3.dex */
public final class getResultsFromIntent {
    private ContentResolverCompat ag$a;
    private int ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getResultsFromIntent) {
            getResultsFromIntent getresultsfromintent = (getResultsFromIntent) obj;
            return this.ah$a == getresultsfromintent.ah$a && runAnimators.values(this.ag$a, getresultsfromintent.ag$a);
        }
        return false;
    }

    public int hashCode() {
        return (this.ah$a * 31) + this.ag$a.hashCode();
    }

    public String toString() {
        int i = this.ah$a;
        ContentResolverCompat contentResolverCompat = this.ag$a;
        return "CreateTeamFragmentViewEvent(action=" + i + ", createTeamVM=" + contentResolverCompat + ")";
    }

    public getResultsFromIntent(int i, ContentResolverCompat contentResolverCompat) {
        runAnimators.ag$a(contentResolverCompat, "createTeamVM");
        this.ah$a = i;
        this.ag$a = contentResolverCompat;
    }

    public final int ag$a() {
        return this.ah$a;
    }

    public final ContentResolverCompat ah$a() {
        return this.ag$a;
    }
}
