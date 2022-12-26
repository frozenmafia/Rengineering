package o;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o.Transition;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class getGoneY implements invalidateChildInParent<String> {
    private final BufferedReader ah$a;

    public getGoneY(BufferedReader bufferedReader) {
        runAnimators.ag$a(bufferedReader, "reader");
        this.ah$a = bufferedReader;
    }

    /* loaded from: classes5.dex */
    public static final class valueOf implements Iterator<String>, Transition.ArrayListManager {
        private String toString;
        private boolean values;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        valueOf() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.toString == null && !this.values) {
                String readLine = getGoneY.this.ah$a.readLine();
                this.toString = readLine;
                if (readLine == null) {
                    this.values = true;
                }
            }
            return this.toString != null;
        }

        @Override // java.util.Iterator
        /* renamed from: ag$a */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.toString;
            this.toString = null;
            runAnimators.toString((Object) str);
            return str;
        }
    }

    @Override // o.invalidateChildInParent
    public Iterator<String> iterator() {
        return new valueOf();
    }
}
