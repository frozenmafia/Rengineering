package o;

import java.util.concurrent.ThreadFactory;
import o.FlatBufferBuilder;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class FlatBufferBuilder$HeapByteBufferFactory$ag$a implements createCodepointsVector {
    final int ag$a;
    final FlatBufferBuilder.HeapByteBufferFactory.toString[] valueOf;
    long values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlatBufferBuilder$HeapByteBufferFactory$ag$a(int i, ThreadFactory threadFactory) {
        this.ag$a = i;
        this.valueOf = new FlatBufferBuilder.HeapByteBufferFactory.toString[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.valueOf[i2] = new FlatBufferBuilder.HeapByteBufferFactory.toString(threadFactory);
        }
    }

    public FlatBufferBuilder.HeapByteBufferFactory.toString values() {
        int i = this.ag$a;
        if (i == 0) {
            return FlatBufferBuilder.HeapByteBufferFactory.ah$a;
        }
        FlatBufferBuilder.HeapByteBufferFactory.toString[] tostringArr = this.valueOf;
        long j = this.values;
        this.values = 1 + j;
        return tostringArr[(int) (j % i)];
    }

    public void valueOf() {
        for (FlatBufferBuilder.HeapByteBufferFactory.toString tostring : this.valueOf) {
            tostring.dispose();
        }
    }

    @Override // o.createCodepointsVector
    public void toString(int i, createCodepointsVector$ag$a createcodepointsvector_ag_a) {
        int i2 = this.ag$a;
        if (i2 == 0) {
            for (int i3 = 0; i3 < i; i3++) {
                createcodepointsvector_ag_a.ah$a(i3, FlatBufferBuilder.HeapByteBufferFactory.ah$a);
            }
            return;
        }
        int i4 = ((int) this.values) % i2;
        for (int i5 = 0; i5 < i; i5++) {
            createcodepointsvector_ag_a.ah$a(i5, new FlatBufferBuilder.HeapByteBufferFactory.valueOf(this.valueOf[i4]));
            i4++;
            if (i4 == i2) {
                i4 = 0;
            }
        }
        this.values = i4;
    }
}
