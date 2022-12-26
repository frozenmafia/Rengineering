package o;

import android.util.JsonReader;
import com.sendbird.android.constant.StringSet;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.Styleable;
import o.setBackgroundTintMode;
import o.setBackgroundTintMode.toString;
/* loaded from: classes3.dex */
public final class unregisterForLayoutCallback<T extends setBackgroundTintMode.toString> {
    private final ReentrantReadWriteLock ah$a;
    private final File valueOf;

    public unregisterForLayoutCallback(File file) {
        runAnimators.valueOf(file, StringSet.file);
        this.valueOf = file;
        this.ah$a = new ReentrantReadWriteLock();
    }

    public final void ag$a(T t) throws IOException {
        runAnimators.valueOf(t, "streamable");
        ReentrantReadWriteLock.WriteLock writeLock = this.ah$a.writeLock();
        runAnimators.toString(writeLock, "lock.writeLock()");
        ReentrantReadWriteLock.WriteLock writeLock2 = writeLock;
        writeLock2.lock();
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(this.valueOf), ViewUtilsApi29.ah$b);
            BufferedWriter bufferedWriter = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
            Throwable th = null;
            t.toStream(new setBackgroundTintMode(bufferedWriter));
            setSlideEdge.values(bufferedWriter, th);
        } finally {
            writeLock2.unlock();
        }
    }

    public final T ag$a(Styleable.ChangeBounds<? super JsonReader, ? extends T> changeBounds) throws IOException {
        runAnimators.valueOf(changeBounds, "loadCallback");
        ReentrantReadWriteLock.ReadLock readLock = this.ah$a.readLock();
        runAnimators.toString(readLock, "lock.readLock()");
        ReentrantReadWriteLock.ReadLock readLock2 = readLock;
        readLock2.lock();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(this.valueOf), ViewUtilsApi29.ah$b);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            Throwable th = null;
            T invoke = changeBounds.invoke(new JsonReader(bufferedReader));
            setSlideEdge.values(bufferedReader, th);
            return invoke;
        } finally {
            readLock2.unlock();
        }
    }
}
