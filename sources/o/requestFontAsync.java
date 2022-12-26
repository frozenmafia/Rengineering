package o;

import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
public interface requestFontAsync {
    public static final requestFontAsync values = new requestFontAsync() { // from class: o.requestFontAsync.1
        @Override // o.requestFontAsync
        public boolean valueOf() {
            return false;
        }

        @Override // o.requestFontAsync
        public long HaptikSDK$a() {
            throw new NoSuchElementException();
        }

        @Override // o.requestFontAsync
        public long invoke() {
            throw new NoSuchElementException();
        }
    };

    long HaptikSDK$a();

    long invoke();

    boolean valueOf();
}
