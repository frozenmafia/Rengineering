package o;
/* loaded from: classes5.dex */
class offsetForAddition$valueOf$ag$a implements CharSequence {
    char[] values;

    @Override // java.lang.CharSequence
    public int length() {
        return this.values.length;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.values[i];
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return new String(this.values, i, i2 - i);
    }
}
