package o;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
/* loaded from: classes7.dex */
public final class addEmojiStyle implements Future<Object> {
    final dataStart values;

    @Override // java.util.concurrent.Future
    public Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    public addEmojiStyle(dataStart datastart) {
        this.values = datastart;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.values.dispose();
        return false;
    }
}
