package o;

import java.nio.ByteBuffer;
import o.doOnDetach;
/* loaded from: classes3.dex */
public class consumeStableInsets implements doOnDetach<ByteBuffer> {
    private final ByteBuffer values;

    @Override // o.doOnDetach
    public void values() {
    }

    public consumeStableInsets(ByteBuffer byteBuffer) {
        this.values = byteBuffer;
    }

    @Override // o.doOnDetach
    /* renamed from: valueOf */
    public ByteBuffer ag$a() {
        this.values.position(0);
        return this.values;
    }

    /* loaded from: classes3.dex */
    public static class toString implements doOnDetach.values<ByteBuffer> {
        @Override // o.doOnDetach.values
        /* renamed from: ag$a */
        public doOnDetach<ByteBuffer> valueOf(ByteBuffer byteBuffer) {
            return new consumeStableInsets(byteBuffer);
        }

        @Override // o.doOnDetach.values
        public Class<ByteBuffer> values() {
            return ByteBuffer.class;
        }
    }
}
