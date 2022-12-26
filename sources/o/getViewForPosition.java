package o;
/* loaded from: classes7.dex */
final class getViewForPosition extends tryGetViewHolderForPositionByDeadline {
    private final long ag$a;
    private final String ah$a;
    private final long toString;

    private getViewForPosition(String str, long j, long j2) {
        this.ah$a = str;
        this.toString = j;
        this.ag$a = j2;
    }

    @Override // o.tryGetViewHolderForPositionByDeadline
    public String ah$a() {
        return this.ah$a;
    }

    @Override // o.tryGetViewHolderForPositionByDeadline
    public long valueOf() {
        return this.toString;
    }

    @Override // o.tryGetViewHolderForPositionByDeadline
    public long values() {
        return this.ag$a;
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.ah$a + ", tokenExpirationTimestamp=" + this.toString + ", tokenCreationTimestamp=" + this.ag$a + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tryGetViewHolderForPositionByDeadline) {
            tryGetViewHolderForPositionByDeadline trygetviewholderforpositionbydeadline = (tryGetViewHolderForPositionByDeadline) obj;
            return this.ah$a.equals(trygetviewholderforpositionbydeadline.ah$a()) && this.toString == trygetviewholderforpositionbydeadline.valueOf() && this.ag$a == trygetviewholderforpositionbydeadline.values();
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.ah$a.hashCode();
        long j = this.toString;
        long j2 = this.ag$a;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }
}
