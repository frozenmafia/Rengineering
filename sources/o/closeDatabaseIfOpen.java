package o;

import com.google.protobuf.ProtoSyntax;
import o.ViewInfoStore;
/* loaded from: classes5.dex */
public final class closeDatabaseIfOpen implements removeViewHolder {
    private final Object[] ag$a;
    private final String ah$a;
    private final ViewInfoStore.InfoRecord valueOf;
    private final int values;

    public closeDatabaseIfOpen(ViewInfoStore.InfoRecord infoRecord, String str, Object[] objArr) {
        this.valueOf = infoRecord;
        this.ah$a = str;
        this.ag$a = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.values = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            char charAt2 = str.charAt(i2);
            if (charAt2 < 55296) {
                this.values = i | (charAt2 << i3);
                return;
            }
            i |= (charAt2 & 8191) << i3;
            i3 += 13;
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String HaptikSDK$a() {
        return this.ah$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] values() {
        return this.ag$a;
    }

    @Override // o.removeViewHolder
    public ViewInfoStore.InfoRecord valueOf() {
        return this.valueOf;
    }

    @Override // o.removeViewHolder
    public ProtoSyntax ah$a() {
        return (this.values & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    @Override // o.removeViewHolder
    public boolean ag$a() {
        return (this.values & 2) == 2;
    }
}
