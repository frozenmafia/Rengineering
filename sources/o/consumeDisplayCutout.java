package o;

import o.WindowInsetsControllerCompat;
/* loaded from: classes3.dex */
public class consumeDisplayCutout implements ViewKt$postDelayed$runnable$1<byte[]> {
    private final byte[] ag$a;

    @Override // o.ViewKt$postDelayed$runnable$1
    public void HaptikSDK$a() {
    }

    public consumeDisplayCutout(byte[] bArr) {
        this.ag$a = (byte[]) WindowInsetsControllerCompat.Impl30.AnonymousClass2.toString(bArr);
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public Class<byte[]> valueOf() {
        return byte[].class;
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    /* renamed from: values */
    public byte[] ag$a() {
        return this.ag$a;
    }

    @Override // o.ViewKt$postDelayed$runnable$1
    public int ah$b() {
        return this.ag$a.length;
    }
}
