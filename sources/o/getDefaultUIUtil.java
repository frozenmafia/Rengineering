package o;

import com.google.crypto.tink.shaded.protobuf.ProtoSyntax;
import o.ItemTouchHelper;
/* loaded from: classes7.dex */
public final class getDefaultUIUtil implements onChildViewDetachedFromWindow {
    private final ItemTouchHelper.AnonymousClass3 ag$a;
    private final int ah$a;
    private final Object[] toString;
    private final String valueOf;

    public getDefaultUIUtil(ItemTouchHelper.AnonymousClass3 anonymousClass3, String str, Object[] objArr) {
        this.ag$a = anonymousClass3;
        this.valueOf = str;
        this.toString = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.ah$a = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            char charAt2 = str.charAt(i2);
            if (charAt2 < 55296) {
                this.ah$a = i | (charAt2 << i3);
                return;
            }
            i |= (charAt2 & 8191) << i3;
            i3 += 13;
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String HaptikSDK$c() {
        return this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] values() {
        return this.toString;
    }

    @Override // o.onChildViewDetachedFromWindow
    public ItemTouchHelper.AnonymousClass3 valueOf() {
        return this.ag$a;
    }

    @Override // o.onChildViewDetachedFromWindow
    public ProtoSyntax ag$a() {
        return (this.ah$a & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    @Override // o.onChildViewDetachedFromWindow
    public boolean ah$a() {
        return (this.ah$a & 2) == 2;
    }
}
