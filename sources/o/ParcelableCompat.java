package o;

import android.net.Uri;
import com.appsamurai.storyly.exoplayer2.common.metadata.Metadata;
import com.appsamurai.storyly.exoplayer2.common.offline.StreamKey;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import o.SelfDestructiveThread;
/* loaded from: classes3.dex */
public interface ParcelableCompat {
    void values(Metadata metadata);

    /* loaded from: classes3.dex */
    public final class ParcelableCompatCreatorHoneycombMR2<T extends ParcelableCompatCreatorCallbacks<T>> implements SelfDestructiveThread.AnonymousClass2.AnonymousClass1.values<T> {
        private final List<StreamKey> ag$a;
        private final SelfDestructiveThread.AnonymousClass2.AnonymousClass1.values<? extends T> values;

        public ParcelableCompatCreatorHoneycombMR2(SelfDestructiveThread.AnonymousClass2.AnonymousClass1.values<? extends T> valuesVar, List<StreamKey> list) {
            this.values = valuesVar;
            this.ag$a = list;
        }

        @Override // o.SelfDestructiveThread.AnonymousClass2.AnonymousClass1.values
        /* renamed from: ag$a */
        public T valueOf(Uri uri, InputStream inputStream) throws IOException {
            T valueOf = this.values.valueOf(uri, inputStream);
            List<StreamKey> list = this.ag$a;
            return (list == null || list.isEmpty()) ? valueOf : (T) valueOf.toString(this.ag$a);
        }
    }
}
