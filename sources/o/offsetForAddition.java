package o;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import o.StaggeredGridLayoutManager;
/* loaded from: classes5.dex */
public final class offsetForAddition {
    public static invalidateSpanAssignments ah$a(StaggeredGridLayoutManager.SavedState.AnonymousClass1 anonymousClass1) throws JsonParseException {
        boolean z;
        try {
            try {
                anonymousClass1.aj$a();
                z = false;
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return TypeAdapters.getDefaultImpl.read(anonymousClass1);
            } catch (EOFException e2) {
                e = e2;
                if (z) {
                    return setGapStrategy.values;
                }
                throw new JsonSyntaxException(e);
            }
        } catch (MalformedJsonException e3) {
            throw new JsonSyntaxException(e3);
        } catch (IOException e4) {
            throw new JsonIOException(e4);
        } catch (NumberFormatException e5) {
            throw new JsonSyntaxException(e5);
        }
    }

    public static void ah$a(invalidateSpanAssignments invalidatespanassignments, StaggeredGridLayoutManager.Span span) throws IOException {
        TypeAdapters.getDefaultImpl.write(span, invalidatespanassignments);
    }

    public static Writer valueOf(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new valueOf(appendable);
    }

    /* loaded from: classes5.dex */
    public static final class valueOf extends Writer {
        private final Appendable ag$a;
        private final offsetForAddition$valueOf$ag$a valueOf = new offsetForAddition$valueOf$ag$a();

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        valueOf(Appendable appendable) {
            this.ag$a = appendable;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) throws IOException {
            this.valueOf.values = cArr;
            this.ag$a.append(this.valueOf, i, i2 + i);
        }

        @Override // java.io.Writer
        public void write(int i) throws IOException {
            this.ag$a.append((char) i);
        }
    }
}
