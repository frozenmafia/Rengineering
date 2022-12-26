package o;
/* loaded from: classes5.dex */
public class createFullSpanItemFromStart$ah$a {
    private long values = 60;
    private long ah$a = getMinStart.toString;

    public createFullSpanItemFromStart$ah$a ah$a(long j) throws IllegalArgumentException {
        if (j < 0) {
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
        }
        this.values = j;
        return this;
    }

    public createFullSpanItemFromStart$ah$a valueOf(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
        this.ah$a = j;
        return this;
    }

    public createFullSpanItemFromStart ag$a() {
        return new createFullSpanItemFromStart(this);
    }
}
