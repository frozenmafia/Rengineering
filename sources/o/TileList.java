package o;

import com.google.protobuf.ByteString;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.util.Map;
import o.AutoCloser;
import o.ViewInfoStore;
import o.resetFlags;
/* loaded from: classes7.dex */
public interface TileList extends drainCache {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public abstract class Tile<T extends resetFlags.toString<T>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract <UT, UB> UB ag$a(AutoCloser.AnonymousClass2 anonymousClass2, Object obj, containsPosition containsposition, resetFlags<T> resetflags, UB ub, lambda$delete$5<UT, UB> lambda_delete_5) throws IOException;

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract void ah$a(Writer writer, Map.Entry<?, ?> entry) throws IOException;

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract void ah$a(Object obj);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract void ah$a(AutoCloser.AnonymousClass2 anonymousClass2, Object obj, containsPosition containsposition, resetFlags<T> resetflags) throws IOException;

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract boolean ah$a(ViewInfoStore.InfoRecord infoRecord);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int toString(Map.Entry<?, ?> entry);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract resetFlags<T> toString(Object obj);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract void valueOf(ByteString byteString, Object obj, containsPosition containsposition, resetFlags<T> resetflags) throws IOException;

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Object values(containsPosition containsposition, ViewInfoStore.InfoRecord infoRecord, int i);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract resetFlags<T> values(Object obj);
    }
}
