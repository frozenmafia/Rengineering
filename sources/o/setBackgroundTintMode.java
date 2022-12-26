package o;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
/* loaded from: classes3.dex */
public class setBackgroundTintMode extends setBackgroundTintList {
    private final setTransitionName ag$a;
    private final Writer valueOf;

    /* loaded from: classes3.dex */
    public interface toString {
        void toStream(setBackgroundTintMode setbackgroundtintmode) throws IOException;
    }

    @Override // o.setBackgroundTintList
    public /* bridge */ /* synthetic */ setBackgroundTintList HaptikSDK$a() throws IOException {
        return super.HaptikSDK$a();
    }

    @Override // o.setBackgroundTintList
    public /* bridge */ /* synthetic */ setBackgroundTintList ag$a() throws IOException {
        return super.ag$a();
    }

    @Override // o.setBackgroundTintList
    public /* bridge */ /* synthetic */ setBackgroundTintList ah$a() throws IOException {
        return super.ah$a();
    }

    @Override // o.setBackgroundTintList, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() throws IOException {
        super.close();
    }

    @Override // o.setBackgroundTintList, java.io.Flushable
    public /* bridge */ /* synthetic */ void flush() throws IOException {
        super.flush();
    }

    @Override // o.setBackgroundTintList
    public /* bridge */ /* synthetic */ setBackgroundTintList valueOf() throws IOException {
        return super.valueOf();
    }

    @Override // o.setBackgroundTintList
    public /* bridge */ /* synthetic */ setBackgroundTintList valueOf(long j) throws IOException {
        return super.valueOf(j);
    }

    @Override // o.setBackgroundTintList
    public /* bridge */ /* synthetic */ setBackgroundTintList valueOf(Boolean bool) throws IOException {
        return super.valueOf(bool);
    }

    @Override // o.setBackgroundTintList
    public /* bridge */ /* synthetic */ setBackgroundTintList valueOf(String str) throws IOException {
        return super.valueOf(str);
    }

    @Override // o.setBackgroundTintList
    public /* bridge */ /* synthetic */ setBackgroundTintList values() throws IOException {
        return super.values();
    }

    @Override // o.setBackgroundTintList
    public /* bridge */ /* synthetic */ setBackgroundTintList values(Number number) throws IOException {
        return super.values(number);
    }

    @Override // o.setBackgroundTintList
    public /* bridge */ /* synthetic */ setBackgroundTintList values(boolean z) throws IOException {
        return super.values(z);
    }

    public setBackgroundTintMode(Writer writer) {
        super(writer);
        ah$a(false);
        this.valueOf = writer;
        this.ag$a = new setTransitionName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setBackgroundTintMode(setBackgroundTintMode setbackgroundtintmode, setTransitionName settransitionname) {
        super(setbackgroundtintmode.valueOf);
        ah$a(setbackgroundtintmode.HaptikSDK$b());
        this.valueOf = setbackgroundtintmode.valueOf;
        this.ag$a = settransitionname;
    }

    @Override // o.setBackgroundTintList
    /* renamed from: values */
    public setBackgroundTintMode ag$a(String str) throws IOException {
        super.ag$a(str);
        return this;
    }

    public void ah$a(Object obj, boolean z) throws IOException {
        if (obj instanceof toString) {
            ((toString) obj).toStream(this);
        } else {
            this.ag$a.valueOf(obj, this, z);
        }
    }

    public void ag$a(Object obj) throws IOException {
        ah$a(obj, false);
    }

    public void toString(File file) throws IOException {
        Throwable th;
        BufferedReader bufferedReader;
        if (file == null || file.length() <= 0) {
            return;
        }
        super.flush();
        ah$b();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            try {
                setAccessibilityLiveRegion.valueOf(bufferedReader, this.valueOf);
                setAccessibilityLiveRegion.valueOf(bufferedReader);
                this.valueOf.flush();
            } catch (Throwable th2) {
                th = th2;
                setAccessibilityLiveRegion.valueOf(bufferedReader);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }
}
