package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;
import o.doOnDetach;
/* loaded from: classes3.dex */
public final class ParcelFileDescriptorRewinder implements doOnDetach<ParcelFileDescriptor> {
    private final InternalRewinder valueOf;

    @Override // o.doOnDetach
    public void values() {
    }

    public static boolean ah$a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.valueOf = new InternalRewinder(parcelFileDescriptor);
    }

    @Override // o.doOnDetach
    /* renamed from: valueOf */
    public ParcelFileDescriptor ag$a() throws IOException {
        return this.valueOf.rewind();
    }

    /* loaded from: classes3.dex */
    public static final class toString implements doOnDetach.values<ParcelFileDescriptor> {
        @Override // o.doOnDetach.values
        public doOnDetach<ParcelFileDescriptor> valueOf(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // o.doOnDetach.values
        public Class<ParcelFileDescriptor> values() {
            return ParcelFileDescriptor.class;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class InternalRewinder {
        private final ParcelFileDescriptor valueOf;

        InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.valueOf = parcelFileDescriptor;
        }

        ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.valueOf.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.valueOf;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }
}
