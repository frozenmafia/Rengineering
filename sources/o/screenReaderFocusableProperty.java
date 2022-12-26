package o;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import o.setBackgroundTintMode;
/* loaded from: classes3.dex */
public abstract class screenReaderFocusableProperty {
    private final File HaptikSDK$a;
    private final toString ag$a;
    private final int toString;
    private final Comparator<File> valueOf;
    protected final setImportantForAccessibility values;
    private final Lock ah$a = new ReentrantLock();
    private final Collection<File> HaptikSDK$c = new ConcurrentSkipListSet();

    /* loaded from: classes3.dex */
    public interface toString {
        void toString(Exception exc, File file, String str);
    }

    abstract String values(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public screenReaderFocusableProperty(File file, int i, Comparator<File> comparator, setImportantForAccessibility setimportantforaccessibility, toString tostring) {
        this.toString = i;
        this.valueOf = comparator;
        this.values = setimportantforaccessibility;
        this.ag$a = tostring;
        this.HaptikSDK$a = file;
        values(file);
    }

    private boolean values(File file) {
        try {
            file.mkdirs();
            return true;
        } catch (Exception e) {
            this.values.ag$a("Could not prepare file storage directory", e);
            return false;
        }
    }

    public void toString(String str, String str2) {
        BufferedWriter bufferedWriter;
        setImportantForAccessibility setimportantforaccessibility;
        StringBuilder sb;
        if (values(this.HaptikSDK$a)) {
            values();
            this.ah$a.lock();
            String absolutePath = new File(this.HaptikSDK$a, str2).getAbsolutePath();
            BufferedWriter bufferedWriter2 = null;
            try {
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePath), "UTF-8"));
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = null;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                bufferedWriter.write(str);
                try {
                    bufferedWriter.close();
                } catch (Exception e2) {
                    e = e2;
                    setimportantforaccessibility = this.values;
                    sb = new StringBuilder();
                    sb.append("Failed to close unsent payload writer: ");
                    sb.append(str2);
                    setimportantforaccessibility.toString(sb.toString(), e);
                    this.ah$a.unlock();
                }
            } catch (Exception e3) {
                e = e3;
                bufferedWriter2 = bufferedWriter;
                File file = new File(absolutePath);
                toString tostring = this.ag$a;
                if (tostring != null) {
                    tostring.toString(e, file, "NDK Crash report copy");
                }
                setAccessibilityLiveRegion.ah$a(file, this.values);
                if (bufferedWriter2 != null) {
                    try {
                        bufferedWriter2.close();
                    } catch (Exception e4) {
                        e = e4;
                        setimportantforaccessibility = this.values;
                        sb = new StringBuilder();
                        sb.append("Failed to close unsent payload writer: ");
                        sb.append(str2);
                        setimportantforaccessibility.toString(sb.toString(), e);
                        this.ah$a.unlock();
                    }
                }
                this.ah$a.unlock();
            } catch (Throwable th2) {
                th = th2;
                if (bufferedWriter != null) {
                    try {
                        bufferedWriter.close();
                    } catch (Exception e5) {
                        this.values.toString("Failed to close unsent payload writer: " + str2, e5);
                    }
                }
                this.ah$a.unlock();
                throw th;
            }
            this.ah$a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public String ah$a(setBackgroundTintMode.toString tostring) {
        setBackgroundTintMode setbackgroundtintmode;
        Closeable closeable = null;
        if (!values(this.HaptikSDK$a) || this.toString == 0) {
            return null;
        }
        values();
        String absolutePath = new File(this.HaptikSDK$a, values(tostring)).getAbsolutePath();
        Lock lock = this.ah$a;
        lock.lock();
        try {
            try {
                setbackgroundtintmode = new setBackgroundTintMode(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(absolutePath), "UTF-8")));
                try {
                    setbackgroundtintmode.ag$a(tostring);
                    this.values.values("Saved unsent payload to disk: '" + absolutePath + '\'');
                    setAccessibilityLiveRegion.valueOf(setbackgroundtintmode);
                    this.ah$a.unlock();
                    return absolutePath;
                } catch (FileNotFoundException e) {
                    e = e;
                    this.values.toString("Ignoring FileNotFoundException - unable to create file", e);
                    setAccessibilityLiveRegion.valueOf(setbackgroundtintmode);
                    this.ah$a.unlock();
                    return null;
                } catch (Exception e2) {
                    e = e2;
                    File file = new File(absolutePath);
                    toString tostring2 = this.ag$a;
                    if (tostring2 != null) {
                        tostring2.toString(e, file, "Crash report serialization");
                    }
                    setAccessibilityLiveRegion.ah$a(file, this.values);
                    setAccessibilityLiveRegion.valueOf(setbackgroundtintmode);
                    this.ah$a.unlock();
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                closeable = lock;
                setAccessibilityLiveRegion.valueOf(closeable);
                this.ah$a.unlock();
                throw th;
            }
        } catch (FileNotFoundException e3) {
            e = e3;
            setbackgroundtintmode = null;
        } catch (Exception e4) {
            e = e4;
            setbackgroundtintmode = null;
        } catch (Throwable th2) {
            th = th2;
            setAccessibilityLiveRegion.valueOf(closeable);
            this.ah$a.unlock();
            throw th;
        }
    }

    void values() {
        File[] listFiles;
        if (!values(this.HaptikSDK$a) || (listFiles = this.HaptikSDK$a.listFiles()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(listFiles));
        if (arrayList.size() >= this.toString) {
            Collections.sort(arrayList, this.valueOf);
            int i = 0;
            while (i < arrayList.size() && arrayList.size() >= this.toString) {
                File file = (File) arrayList.get(i);
                if (!this.HaptikSDK$c.contains(file)) {
                    setImportantForAccessibility setimportantforaccessibility = this.values;
                    setimportantforaccessibility.ah$a("Discarding oldest error as stored error limit reached: '" + file.getPath() + '\'');
                    toString(Collections.singleton(file));
                    arrayList.remove(i);
                    i += -1;
                }
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<File> ah$b() {
        File[] listFiles;
        this.ah$a.lock();
        try {
            ArrayList arrayList = new ArrayList();
            if (values(this.HaptikSDK$a) && (listFiles = this.HaptikSDK$a.listFiles()) != null) {
                for (File file : listFiles) {
                    if (file.length() == 0) {
                        if (!file.delete()) {
                            file.deleteOnExit();
                        }
                    } else if (file.isFile() && !this.HaptikSDK$c.contains(file)) {
                        arrayList.add(file);
                    }
                }
            }
            this.HaptikSDK$c.addAll(arrayList);
            return arrayList;
        } finally {
            this.ah$a.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void valueOf(Collection<File> collection) {
        this.ah$a.lock();
        if (collection != null) {
            try {
                this.HaptikSDK$c.removeAll(collection);
            } finally {
                this.ah$a.unlock();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void toString(Collection<File> collection) {
        this.ah$a.lock();
        if (collection != null) {
            try {
                this.HaptikSDK$c.removeAll(collection);
                for (File file : collection) {
                    if (!file.delete()) {
                        file.deleteOnExit();
                    }
                }
            } finally {
                this.ah$a.unlock();
            }
        }
    }
}
