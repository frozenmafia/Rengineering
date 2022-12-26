package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.image.EncodedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o.Fragment;
import o.FragmentActivity;
import o.requireActivity;
/* loaded from: classes4.dex */
public class StagingArea {
    private static final Class<?> TAG = StagingArea.class;
    private Map<requireActivity, EncodedImage> mMap = new HashMap();

    private StagingArea() {
    }

    public static StagingArea getInstance() {
        return new StagingArea();
    }

    public void put(requireActivity requireactivity, EncodedImage encodedImage) {
        synchronized (this) {
            requireactivity.getClass();
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf(EncodedImage.isValid(encodedImage)));
            EncodedImage.closeSafely(this.mMap.put(requireactivity, EncodedImage.cloneOrNull(encodedImage)));
            logStats();
        }
    }

    public void clearAll() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.mMap.values());
            this.mMap.clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            EncodedImage encodedImage = (EncodedImage) arrayList.get(i);
            if (encodedImage != null) {
                encodedImage.close();
            }
        }
    }

    public boolean remove(requireActivity requireactivity) {
        EncodedImage remove;
        requireactivity.getClass();
        synchronized (this) {
            remove = this.mMap.remove(requireactivity);
        }
        if (remove == null) {
            return false;
        }
        try {
            return remove.isValid();
        } finally {
            remove.close();
        }
    }

    public boolean remove(requireActivity requireactivity, EncodedImage encodedImage) {
        synchronized (this) {
            requireactivity.getClass();
            encodedImage.getClass();
            Fragment.AnonymousClass8.valueOf(Boolean.valueOf(EncodedImage.isValid(encodedImage)));
            EncodedImage encodedImage2 = this.mMap.get(requireactivity);
            if (encodedImage2 == null) {
                return false;
            }
            FragmentActivity.AnonymousClass1<PooledByteBuffer> byteBufferRef = encodedImage2.getByteBufferRef();
            FragmentActivity.AnonymousClass1<PooledByteBuffer> byteBufferRef2 = encodedImage.getByteBufferRef();
            if (byteBufferRef != null && byteBufferRef2 != null && byteBufferRef.HaptikSDK$c() == byteBufferRef2.HaptikSDK$c()) {
                this.mMap.remove(requireactivity);
                FragmentActivity.AnonymousClass1.valueOf(byteBufferRef2);
                FragmentActivity.AnonymousClass1.valueOf(byteBufferRef);
                EncodedImage.closeSafely(encodedImage2);
                logStats();
                return true;
            }
            FragmentActivity.AnonymousClass1.valueOf(byteBufferRef2);
            FragmentActivity.AnonymousClass1.valueOf(byteBufferRef);
            EncodedImage.closeSafely(encodedImage2);
            return false;
        }
    }

    public EncodedImage get(requireActivity requireactivity) {
        synchronized (this) {
            requireactivity.getClass();
            EncodedImage encodedImage = this.mMap.get(requireactivity);
            if (encodedImage != null) {
                synchronized (encodedImage) {
                    if (!EncodedImage.isValid(encodedImage)) {
                        this.mMap.remove(requireactivity);
                        FragmentActivity.toString(TAG, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(encodedImage)), requireactivity.getUriString(), Integer.valueOf(System.identityHashCode(requireactivity)));
                        return null;
                    }
                    encodedImage = EncodedImage.cloneOrNull(encodedImage);
                }
            }
            return encodedImage;
        }
    }

    public boolean containsKey(requireActivity requireactivity) {
        synchronized (this) {
            requireactivity.getClass();
            if (this.mMap.containsKey(requireactivity)) {
                EncodedImage encodedImage = this.mMap.get(requireactivity);
                synchronized (encodedImage) {
                    if (EncodedImage.isValid(encodedImage)) {
                        return true;
                    }
                    this.mMap.remove(requireactivity);
                    FragmentActivity.toString(TAG, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(encodedImage)), requireactivity.getUriString(), Integer.valueOf(System.identityHashCode(requireactivity)));
                    return false;
                }
            }
            return false;
        }
    }

    private void logStats() {
        synchronized (this) {
            FragmentActivity.toString(TAG, "Count = %d", Integer.valueOf(this.mMap.size()));
        }
    }
}
