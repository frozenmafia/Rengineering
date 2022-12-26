package o;

import com.fasterxml.jackson.core.JsonEncoding;
/* loaded from: classes6.dex */
public class onStopLoading {
    protected byte[] HaptikSDK$a;
    protected final Object HaptikSDK$b;
    protected char[] ag$a;
    protected JsonEncoding ah$a;
    protected byte[] ah$b;
    protected char[] invoke;
    protected final boolean toString;
    protected final unregisterListener valueOf;
    protected char[] values;

    public onStopLoading(unregisterListener unregisterlistener, Object obj, boolean z) {
        this.valueOf = unregisterlistener;
        this.HaptikSDK$b = obj;
        this.toString = z;
    }

    public void toString(JsonEncoding jsonEncoding) {
        this.ah$a = jsonEncoding;
    }

    public Object HaptikSDK$c() {
        return this.HaptikSDK$b;
    }

    public JsonEncoding HaptikSDK$a() {
        return this.ah$a;
    }

    public boolean invoke() {
        return this.toString;
    }

    public rollbackContentChanged ah$b() {
        return new rollbackContentChanged(this.valueOf);
    }

    public byte[] ag$a() {
        ah$a(this.HaptikSDK$a);
        byte[] unregisterlistener = this.valueOf.toString(0);
        this.HaptikSDK$a = unregisterlistener;
        return unregisterlistener;
    }

    public byte[] ah$a() {
        ah$a(this.ah$b);
        byte[] unregisterlistener = this.valueOf.toString(1);
        this.ah$b = unregisterlistener;
        return unregisterlistener;
    }

    public char[] values() {
        ah$a((Object) this.invoke);
        char[] values = this.valueOf.values(0);
        this.invoke = values;
        return values;
    }

    public char[] valueOf(int i) {
        ah$a((Object) this.invoke);
        char[] ag$a = this.valueOf.ag$a(0, i);
        this.invoke = ag$a;
        return ag$a;
    }

    public char[] valueOf() {
        ah$a((Object) this.values);
        char[] values = this.valueOf.values(1);
        this.values = values;
        return values;
    }

    public void valueOf(byte[] bArr) {
        if (bArr != null) {
            ag$a(bArr, this.HaptikSDK$a);
            this.HaptikSDK$a = null;
            this.valueOf.values(0, bArr);
        }
    }

    public void values(byte[] bArr) {
        if (bArr != null) {
            ag$a(bArr, this.ah$b);
            this.ah$b = null;
            this.valueOf.values(1, bArr);
        }
    }

    public void toString(char[] cArr) {
        if (cArr != null) {
            values(cArr, this.invoke);
            this.invoke = null;
            this.valueOf.toString(0, cArr);
        }
    }

    public void values(char[] cArr) {
        if (cArr != null) {
            values(cArr, this.values);
            this.values = null;
            this.valueOf.toString(1, cArr);
        }
    }

    public void ah$a(char[] cArr) {
        if (cArr != null) {
            values(cArr, this.ag$a);
            this.ag$a = null;
            this.valueOf.toString(3, cArr);
        }
    }

    protected final void ah$a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    protected final void ag$a(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw HaptikSDK$b();
        }
    }

    protected final void values(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw HaptikSDK$b();
        }
    }

    private IllegalArgumentException HaptikSDK$b() {
        return new IllegalArgumentException("Trying to release buffer smaller than original");
    }
}
