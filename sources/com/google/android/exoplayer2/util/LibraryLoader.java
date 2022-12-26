package com.google.android.exoplayer2.util;

import java.util.Arrays;
/* loaded from: classes7.dex */
public abstract class LibraryLoader {
    private static final String TAG = "LibraryLoader";
    private boolean isAvailable;
    private boolean loadAttempted;
    private String[] nativeLibraries;

    protected abstract void loadLibrary(String str);

    public LibraryLoader(String... strArr) {
        this.nativeLibraries = strArr;
    }

    public void setLibraries(String... strArr) {
        synchronized (this) {
            Assertions.checkState(!this.loadAttempted, "Cannot set libraries after loading");
            this.nativeLibraries = strArr;
        }
    }

    public boolean isAvailable() {
        synchronized (this) {
            if (this.loadAttempted) {
                return this.isAvailable;
            }
            this.loadAttempted = true;
            try {
                for (String str : this.nativeLibraries) {
                    loadLibrary(str);
                }
                this.isAvailable = true;
            } catch (UnsatisfiedLinkError unused) {
                Log.w(TAG, "Failed to load " + Arrays.toString(this.nativeLibraries));
            }
            return this.isAvailable;
        }
    }
}
