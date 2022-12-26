package o;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import o.doOnDetach;
/* loaded from: classes3.dex */
public final class doOnPreDraw implements doOnDetach<InputStream> {
    private final RecyclableBufferedInputStream ag$a;

    public doOnPreDraw(InputStream inputStream, rotationXBy rotationxby) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, rotationxby);
        this.ag$a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    @Override // o.doOnDetach
    /* renamed from: valueOf */
    public InputStream ag$a() throws IOException {
        this.ag$a.reset();
        return this.ag$a;
    }

    @Override // o.doOnDetach
    public void values() {
        this.ag$a.ag$a();
    }

    public void ah$a() {
        this.ag$a.ah$a();
    }

    /* loaded from: classes3.dex */
    public static final class toString implements doOnDetach.values<InputStream> {
        private final rotationXBy toString;

        public toString(rotationXBy rotationxby) {
            this.toString = rotationxby;
        }

        @Override // o.doOnDetach.values
        /* renamed from: ah$a */
        public doOnDetach<InputStream> valueOf(InputStream inputStream) {
            return new doOnPreDraw(inputStream, this.toString);
        }

        @Override // o.doOnDetach.values
        public Class<InputStream> values() {
            return InputStream.class;
        }
    }
}
