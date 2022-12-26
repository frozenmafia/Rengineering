package o;
/* loaded from: classes5.dex */
public class areAllStartsEqual implements createFullSpanItemFromEnd {
    private final int ah$a;
    private final String values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public areAllStartsEqual(String str, int i) {
        this.values = str;
        this.ah$a = i;
    }

    @Override // o.createFullSpanItemFromEnd
    public long ah$a() {
        if (this.ah$a == 0) {
            return 0L;
        }
        String HaptikSDK$b = HaptikSDK$b();
        try {
            return Long.valueOf(HaptikSDK$b).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", HaptikSDK$b, "long"), e);
        }
    }

    @Override // o.createFullSpanItemFromEnd
    public double values() {
        if (this.ah$a == 0) {
            return 0.0d;
        }
        String HaptikSDK$b = HaptikSDK$b();
        try {
            return Double.valueOf(HaptikSDK$b).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", HaptikSDK$b, "double"), e);
        }
    }

    @Override // o.createFullSpanItemFromEnd
    public String ag$a() {
        if (this.ah$a == 0) {
            return "";
        }
        HaptikSDK$a();
        return this.values;
    }

    @Override // o.createFullSpanItemFromEnd
    public boolean valueOf() throws IllegalArgumentException {
        if (this.ah$a == 0) {
            return false;
        }
        String HaptikSDK$b = HaptikSDK$b();
        if (recycleFromStart.toString.matcher(HaptikSDK$b).matches()) {
            return true;
        }
        if (recycleFromStart.ah$a.matcher(HaptikSDK$b).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", HaptikSDK$b, "boolean"));
    }

    @Override // o.createFullSpanItemFromEnd
    public int invoke() {
        return this.ah$a;
    }

    private void HaptikSDK$a() {
        if (this.values == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    private String HaptikSDK$b() {
        return ag$a().trim();
    }
}
