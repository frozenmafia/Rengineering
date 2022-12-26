package o;

import android.os.Build;
import android.os.StrictMode;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.http.message.TokenParser;
/* loaded from: classes3.dex */
public final class getScaledVerticalScrollFactor implements Closeable {
    private Writer HaptikSDK$a;
    private final File HaptikSDK$b;
    private final int HaptikWebView;
    private final int ah$a;
    private final File ah$b;
    private int getInitSettings;
    private long invoke;
    private final File valueOf;
    private final File values;
    private long getSignupData = 0;
    private final LinkedHashMap<String, getScaledVerticalScrollFactor$ah$a> HaptikSDK$c = new LinkedHashMap<>(0, 0.75f, true);
    private long HaptikSDK$e = 0;
    final ThreadPoolExecutor ag$a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new valueOf());
    private final Callable<Void> toString = new Callable<Void>() { // from class: o.getScaledVerticalScrollFactor.5
        {
            getScaledVerticalScrollFactor.this = this;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: ah$a */
        public Void call() throws Exception {
            synchronized (getScaledVerticalScrollFactor.this) {
                if (getScaledVerticalScrollFactor.this.HaptikSDK$a == null) {
                    return null;
                }
                getScaledVerticalScrollFactor.this.HaptikSDK$b();
                if (getScaledVerticalScrollFactor.this.ah$a()) {
                    getScaledVerticalScrollFactor.this.HaptikSDK$c();
                    getScaledVerticalScrollFactor.this.getInitSettings = 0;
                }
                return null;
            }
        }
    };

    private getScaledVerticalScrollFactor(File file, int i, int i2, long j) {
        this.values = file;
        this.ah$a = i;
        this.valueOf = new File(file, "journal");
        this.ah$b = new File(file, "journal.tmp");
        this.HaptikSDK$b = new File(file, "journal.bkp");
        this.HaptikWebView = i2;
        this.invoke = j;
    }

    public static getScaledVerticalScrollFactor valueOf(File file, int i, int i2, long j) throws IOException {
        if (j > 0) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("valueCount <= 0");
            }
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    toString(file2, file3, false);
                }
            }
            getScaledVerticalScrollFactor getscaledverticalscrollfactor = new getScaledVerticalScrollFactor(file, i, i2, j);
            if (getscaledverticalscrollfactor.valueOf.exists()) {
                try {
                    getscaledverticalscrollfactor.HaptikSDK$a();
                    getscaledverticalscrollfactor.values();
                    return getscaledverticalscrollfactor;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    getscaledverticalscrollfactor.ag$a();
                }
            }
            file.mkdirs();
            getScaledVerticalScrollFactor getscaledverticalscrollfactor2 = new getScaledVerticalScrollFactor(file, i, i2, j);
            getscaledverticalscrollfactor2.HaptikSDK$c();
            return getscaledverticalscrollfactor2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void HaptikSDK$a() throws IOException {
        getLegacyScrollFactor getlegacyscrollfactor = new getLegacyScrollFactor(new FileInputStream(this.valueOf), getScaledHoverSlop.ah$a);
        try {
            String ag$a = getlegacyscrollfactor.ag$a();
            String ag$a2 = getlegacyscrollfactor.ag$a();
            String ag$a3 = getlegacyscrollfactor.ag$a();
            String ag$a4 = getlegacyscrollfactor.ag$a();
            String ag$a5 = getlegacyscrollfactor.ag$a();
            if (!"libcore.io.DiskLruCache".equals(ag$a) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(ag$a2) || !Integer.toString(this.ah$a).equals(ag$a3) || !Integer.toString(this.HaptikWebView).equals(ag$a4) || !"".equals(ag$a5)) {
                throw new IOException("unexpected journal header: [" + ag$a + ", " + ag$a2 + ", " + ag$a4 + ", " + ag$a5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    valueOf(getlegacyscrollfactor.ag$a());
                    i++;
                } catch (EOFException unused) {
                    this.getInitSettings = i - this.HaptikSDK$c.size();
                    if (getlegacyscrollfactor.ah$a()) {
                        HaptikSDK$c();
                    } else {
                        this.HaptikSDK$a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.valueOf, true), getScaledHoverSlop.ah$a));
                    }
                    getScaledHoverSlop.ag$a(getlegacyscrollfactor);
                    return;
                }
            }
        } catch (Throwable th) {
            getScaledHoverSlop.ag$a(getlegacyscrollfactor);
            throw th;
        }
    }

    private void valueOf(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.HaptikSDK$c.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        getScaledVerticalScrollFactor$ah$a getscaledverticalscrollfactor_ah_a = this.HaptikSDK$c.get(substring);
        if (getscaledverticalscrollfactor_ah_a == null) {
            getscaledverticalscrollfactor_ah_a = new getScaledVerticalScrollFactor$ah$a(this, substring);
            this.HaptikSDK$c.put(substring, getscaledverticalscrollfactor_ah_a);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(com.dreampay.commons.constants.Constants.WHITE_SPACE);
            getscaledverticalscrollfactor_ah_a.HaptikSDK$b = true;
            getscaledverticalscrollfactor_ah_a.valueOf = null;
            getscaledverticalscrollfactor_ah_a.ah$a(split);
        } else if (indexOf2 != -1 || indexOf != 5 || !str.startsWith("DIRTY")) {
            if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            }
            throw new IOException("unexpected journal line: " + str);
        } else {
            getscaledverticalscrollfactor_ah_a.valueOf = new toString(getscaledverticalscrollfactor_ah_a);
        }
    }

    private void values() throws IOException {
        toString tostring;
        long[] jArr;
        ah$a(this.ah$b);
        Iterator<getScaledVerticalScrollFactor$ah$a> it = this.HaptikSDK$c.values().iterator();
        while (it.hasNext()) {
            getScaledVerticalScrollFactor$ah$a next = it.next();
            tostring = next.valueOf;
            int i = 0;
            if (tostring == null) {
                while (i < this.HaptikWebView) {
                    long j = this.getSignupData;
                    jArr = next.HaptikSDK$c;
                    this.getSignupData = j + jArr[i];
                    i++;
                }
            } else {
                next.valueOf = null;
                while (i < this.HaptikWebView) {
                    ah$a(next.valueOf(i));
                    ah$a(next.toString(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public void HaptikSDK$c() throws IOException {
        toString tostring;
        String str;
        String str2;
        synchronized (this) {
            Writer writer = this.HaptikSDK$a;
            if (writer != null) {
                toString(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.ah$b), getScaledHoverSlop.ah$a));
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.ah$a));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.HaptikWebView));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (getScaledVerticalScrollFactor$ah$a getscaledverticalscrollfactor_ah_a : this.HaptikSDK$c.values()) {
                tostring = getscaledverticalscrollfactor_ah_a.valueOf;
                if (tostring != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DIRTY ");
                    str = getscaledverticalscrollfactor_ah_a.values;
                    sb.append(str);
                    sb.append('\n');
                    bufferedWriter.write(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    str2 = getscaledverticalscrollfactor_ah_a.values;
                    sb2.append(str2);
                    sb2.append(getscaledverticalscrollfactor_ah_a.valueOf());
                    sb2.append('\n');
                    bufferedWriter.write(sb2.toString());
                }
            }
            toString(bufferedWriter);
            if (this.valueOf.exists()) {
                toString(this.valueOf, this.HaptikSDK$b, true);
            }
            toString(this.ah$b, this.valueOf, false);
            this.HaptikSDK$b.delete();
            this.HaptikSDK$a = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.valueOf, true), getScaledHoverSlop.ah$a));
        }
    }

    private static void ah$a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void toString(File file, File file2, boolean z) throws IOException {
        if (z) {
            ah$a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public getScaledVerticalScrollFactor$ag$a ah$a(String str) throws IOException {
        boolean z;
        long j;
        long[] jArr;
        synchronized (this) {
            valueOf();
            getScaledVerticalScrollFactor$ah$a getscaledverticalscrollfactor_ah_a = this.HaptikSDK$c.get(str);
            if (getscaledverticalscrollfactor_ah_a == null) {
                return null;
            }
            z = getscaledverticalscrollfactor_ah_a.HaptikSDK$b;
            if (z) {
                for (File file : getscaledverticalscrollfactor_ah_a.toString) {
                    if (!file.exists()) {
                        return null;
                    }
                }
                this.getInitSettings++;
                this.HaptikSDK$a.append((CharSequence) "READ");
                this.HaptikSDK$a.append(TokenParser.SP);
                this.HaptikSDK$a.append((CharSequence) str);
                this.HaptikSDK$a.append('\n');
                if (ah$a()) {
                    this.ag$a.submit(this.toString);
                }
                j = getscaledverticalscrollfactor_ah_a.invoke;
                File[] fileArr = getscaledverticalscrollfactor_ah_a.toString;
                jArr = getscaledverticalscrollfactor_ah_a.HaptikSDK$c;
                return new getScaledVerticalScrollFactor$ag$a(this, str, j, fileArr, jArr);
            }
            return null;
        }
    }

    public toString values(String str) throws IOException {
        return ah$a(str, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x001b, code lost:
        if (r1 != r7) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private o.getScaledVerticalScrollFactor.toString ah$a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.valueOf()     // Catch: java.lang.Throwable -> L5d
            java.util.LinkedHashMap<java.lang.String, o.getScaledVerticalScrollFactor$ah$a> r0 = r5.HaptikSDK$c     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L5d
            o.getScaledVerticalScrollFactor$ah$a r0 = (o.getScaledVerticalScrollFactor$ah$a) r0     // Catch: java.lang.Throwable -> L5d
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L1f
            if (r0 == 0) goto L1d
            long r1 = o.getScaledVerticalScrollFactor$ah$a.valueOf(r0)     // Catch: java.lang.Throwable -> L5d
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L1f
        L1d:
            monitor-exit(r5)
            return r3
        L1f:
            if (r0 != 0) goto L2c
            o.getScaledVerticalScrollFactor$ah$a r0 = new o.getScaledVerticalScrollFactor$ah$a     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L5d
            java.util.LinkedHashMap<java.lang.String, o.getScaledVerticalScrollFactor$ah$a> r7 = r5.HaptikSDK$c     // Catch: java.lang.Throwable -> L5d
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L5d
            goto L34
        L2c:
            o.getScaledVerticalScrollFactor$toString r7 = o.getScaledVerticalScrollFactor$ah$a.values(r0)     // Catch: java.lang.Throwable -> L5d
            if (r7 == 0) goto L34
            monitor-exit(r5)
            return r3
        L34:
            o.getScaledVerticalScrollFactor$toString r7 = new o.getScaledVerticalScrollFactor$toString     // Catch: java.lang.Throwable -> L5d
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L5d
            o.getScaledVerticalScrollFactor$ah$a.ag$a(r0, r7)     // Catch: java.lang.Throwable -> L5d
            java.io.Writer r8 = r5.HaptikSDK$a     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.io.Writer r8 = r5.HaptikSDK$a     // Catch: java.lang.Throwable -> L5d
            r0 = 32
            r8.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.io.Writer r8 = r5.HaptikSDK$a     // Catch: java.lang.Throwable -> L5d
            r8.append(r6)     // Catch: java.lang.Throwable -> L5d
            java.io.Writer r6 = r5.HaptikSDK$a     // Catch: java.lang.Throwable -> L5d
            r8 = 10
            r6.append(r8)     // Catch: java.lang.Throwable -> L5d
            java.io.Writer r6 = r5.HaptikSDK$a     // Catch: java.lang.Throwable -> L5d
            ah$a(r6)     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r5)
            return r7
        L5d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getScaledVerticalScrollFactor.ah$a(java.lang.String, long):o.getScaledVerticalScrollFactor$toString");
    }

    public void valueOf(toString tostring, boolean z) throws IOException {
        toString tostring2;
        boolean z2;
        String str;
        String str2;
        String str3;
        long[] jArr;
        long[] jArr2;
        boolean z3;
        synchronized (this) {
            getScaledVerticalScrollFactor$ah$a getscaledverticalscrollfactor_ah_a = tostring.ah$a;
            tostring2 = getscaledverticalscrollfactor_ah_a.valueOf;
            if (tostring2 != tostring) {
                throw new IllegalStateException();
            }
            if (z) {
                z3 = getscaledverticalscrollfactor_ah_a.HaptikSDK$b;
                if (!z3) {
                    for (int i = 0; i < this.HaptikWebView; i++) {
                        if (!tostring.valueOf[i]) {
                            tostring.ag$a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                        } else if (!getscaledverticalscrollfactor_ah_a.toString(i).exists()) {
                            tostring.ag$a();
                            return;
                        }
                    }
                }
            }
            for (int i2 = 0; i2 < this.HaptikWebView; i2++) {
                File getscaledverticalscrollfactor_ah_a2 = getscaledverticalscrollfactor_ah_a.toString(i2);
                if (z) {
                    if (getscaledverticalscrollfactor_ah_a2.exists()) {
                        File valueOf2 = getscaledverticalscrollfactor_ah_a.valueOf(i2);
                        getscaledverticalscrollfactor_ah_a2.renameTo(valueOf2);
                        jArr = getscaledverticalscrollfactor_ah_a.HaptikSDK$c;
                        long j = jArr[i2];
                        long length = valueOf2.length();
                        jArr2 = getscaledverticalscrollfactor_ah_a.HaptikSDK$c;
                        jArr2[i2] = length;
                        this.getSignupData = (this.getSignupData - j) + length;
                    }
                } else {
                    ah$a(getscaledverticalscrollfactor_ah_a2);
                }
            }
            this.getInitSettings++;
            getscaledverticalscrollfactor_ah_a.valueOf = null;
            z2 = getscaledverticalscrollfactor_ah_a.HaptikSDK$b;
            if (!(z2 | z)) {
                LinkedHashMap<String, getScaledVerticalScrollFactor$ah$a> linkedHashMap = this.HaptikSDK$c;
                str = getscaledverticalscrollfactor_ah_a.values;
                linkedHashMap.remove(str);
                this.HaptikSDK$a.append((CharSequence) "REMOVE");
                this.HaptikSDK$a.append(TokenParser.SP);
                Writer writer = this.HaptikSDK$a;
                str2 = getscaledverticalscrollfactor_ah_a.values;
                writer.append((CharSequence) str2);
                this.HaptikSDK$a.append('\n');
            } else {
                getscaledverticalscrollfactor_ah_a.HaptikSDK$b = true;
                this.HaptikSDK$a.append((CharSequence) "CLEAN");
                this.HaptikSDK$a.append(TokenParser.SP);
                Writer writer2 = this.HaptikSDK$a;
                str3 = getscaledverticalscrollfactor_ah_a.values;
                writer2.append((CharSequence) str3);
                this.HaptikSDK$a.append((CharSequence) getscaledverticalscrollfactor_ah_a.valueOf());
                this.HaptikSDK$a.append('\n');
                if (z) {
                    long j2 = this.HaptikSDK$e;
                    this.HaptikSDK$e = 1 + j2;
                    getscaledverticalscrollfactor_ah_a.invoke = j2;
                }
            }
            ah$a(this.HaptikSDK$a);
            if (this.getSignupData > this.invoke || ah$a()) {
                this.ag$a.submit(this.toString);
            }
        }
    }

    public boolean ah$a() {
        int i = this.getInitSettings;
        return i >= 2000 && i >= this.HaptikSDK$c.size();
    }

    public boolean ag$a(String str) throws IOException {
        toString tostring;
        long[] jArr;
        long[] jArr2;
        synchronized (this) {
            valueOf();
            getScaledVerticalScrollFactor$ah$a getscaledverticalscrollfactor_ah_a = this.HaptikSDK$c.get(str);
            if (getscaledverticalscrollfactor_ah_a != null) {
                tostring = getscaledverticalscrollfactor_ah_a.valueOf;
                if (tostring == null) {
                    for (int i = 0; i < this.HaptikWebView; i++) {
                        File valueOf2 = getscaledverticalscrollfactor_ah_a.valueOf(i);
                        if (valueOf2.exists() && !valueOf2.delete()) {
                            throw new IOException("failed to delete " + valueOf2);
                        }
                        long j = this.getSignupData;
                        jArr = getscaledverticalscrollfactor_ah_a.HaptikSDK$c;
                        this.getSignupData = j - jArr[i];
                        jArr2 = getscaledverticalscrollfactor_ah_a.HaptikSDK$c;
                        jArr2[i] = 0;
                    }
                    this.getInitSettings++;
                    this.HaptikSDK$a.append((CharSequence) "REMOVE");
                    this.HaptikSDK$a.append(TokenParser.SP);
                    this.HaptikSDK$a.append((CharSequence) str);
                    this.HaptikSDK$a.append('\n');
                    this.HaptikSDK$c.remove(str);
                    if (ah$a()) {
                        this.ag$a.submit(this.toString);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    private void valueOf() {
        if (this.HaptikSDK$a == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        toString tostring;
        toString tostring2;
        synchronized (this) {
            if (this.HaptikSDK$a == null) {
                return;
            }
            Iterator it = new ArrayList(this.HaptikSDK$c.values()).iterator();
            while (it.hasNext()) {
                getScaledVerticalScrollFactor$ah$a getscaledverticalscrollfactor_ah_a = (getScaledVerticalScrollFactor$ah$a) it.next();
                tostring = getscaledverticalscrollfactor_ah_a.valueOf;
                if (tostring != null) {
                    tostring2 = getscaledverticalscrollfactor_ah_a.valueOf;
                    tostring2.ag$a();
                }
            }
            HaptikSDK$b();
            toString(this.HaptikSDK$a);
            this.HaptikSDK$a = null;
        }
    }

    public void HaptikSDK$b() throws IOException {
        while (this.getSignupData > this.invoke) {
            ag$a(this.HaptikSDK$c.entrySet().iterator().next().getKey());
        }
    }

    public void ag$a() throws IOException {
        close();
        getScaledHoverSlop.valueOf(this.values);
    }

    private static void toString(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void ah$a(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* loaded from: classes3.dex */
    public final class toString {
        private boolean ag$a;
        private final getScaledVerticalScrollFactor$ah$a ah$a;
        private final boolean[] valueOf;

        private toString(getScaledVerticalScrollFactor$ah$a getscaledverticalscrollfactor_ah_a) {
            boolean z;
            getScaledVerticalScrollFactor.this = r1;
            this.ah$a = getscaledverticalscrollfactor_ah_a;
            z = getscaledverticalscrollfactor_ah_a.HaptikSDK$b;
            this.valueOf = z ? null : new boolean[r1.HaptikWebView];
        }

        public File toString(int i) throws IOException {
            toString tostring;
            boolean z;
            File getscaledverticalscrollfactor_ah_a;
            synchronized (getScaledVerticalScrollFactor.this) {
                tostring = this.ah$a.valueOf;
                if (tostring != this) {
                    throw new IllegalStateException();
                }
                z = this.ah$a.HaptikSDK$b;
                if (!z) {
                    this.valueOf[i] = true;
                }
                getscaledverticalscrollfactor_ah_a = this.ah$a.toString(i);
                getScaledVerticalScrollFactor.this.values.mkdirs();
            }
            return getscaledverticalscrollfactor_ah_a;
        }

        public void ah$a() throws IOException {
            getScaledVerticalScrollFactor.this.valueOf(this, true);
            this.ag$a = true;
        }

        public void ag$a() throws IOException {
            getScaledVerticalScrollFactor.this.valueOf(this, false);
        }

        public void values() {
            if (this.ag$a) {
                return;
            }
            try {
                ag$a();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class valueOf implements ThreadFactory {
        private valueOf() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread;
            synchronized (this) {
                thread = new Thread(runnable, "glide-disk-lru-cache-thread");
                thread.setPriority(1);
            }
            return thread;
        }
    }
}
