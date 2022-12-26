package o;

import android.util.Log;
import com.facebook.fresco.ui.common.DimensionsInfo;
import com.facebook.fresco.ui.common.OnDrawControllerListener;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class getActiveFragments<INFO> implements dumpLoaders<INFO>, OnDrawControllerListener<INFO> {
    private final List<dumpLoaders<? super INFO>> values = new ArrayList(2);

    public void ah$a(dumpLoaders<? super INFO> dumploaders) {
        synchronized (this) {
            this.values.add(dumploaders);
        }
    }

    public void values() {
        synchronized (this) {
            this.values.clear();
        }
    }

    private void valueOf(String str, Throwable th) {
        synchronized (this) {
            Log.e("FdingControllerListener", str, th);
        }
    }

    @Override // o.dumpLoaders
    public void onSubmit(String str, Object obj) {
        synchronized (this) {
            int size = this.values.size();
            for (int i = 0; i < size; i++) {
                try {
                    dumpLoaders<? super INFO> dumploaders = this.values.get(i);
                    if (dumploaders != null) {
                        dumploaders.onSubmit(str, obj);
                    }
                } catch (Exception e) {
                    valueOf("InternalListener exception in onSubmit", e);
                }
            }
        }
    }

    @Override // o.dumpLoaders
    public void onFinalImageSet(String str, INFO info, android.graphics.drawable.Animatable animatable) {
        synchronized (this) {
            int size = this.values.size();
            for (int i = 0; i < size; i++) {
                try {
                    dumpLoaders<? super INFO> dumploaders = this.values.get(i);
                    if (dumploaders != null) {
                        dumploaders.onFinalImageSet(str, info, animatable);
                    }
                } catch (Exception e) {
                    valueOf("InternalListener exception in onFinalImageSet", e);
                }
            }
        }
    }

    @Override // o.dumpLoaders
    public void onIntermediateImageSet(String str, INFO info) {
        int size = this.values.size();
        for (int i = 0; i < size; i++) {
            try {
                dumpLoaders<? super INFO> dumploaders = this.values.get(i);
                if (dumploaders != null) {
                    dumploaders.onIntermediateImageSet(str, info);
                }
            } catch (Exception e) {
                valueOf("InternalListener exception in onIntermediateImageSet", e);
            }
        }
    }

    @Override // o.dumpLoaders
    public void onIntermediateImageFailed(String str, Throwable th) {
        int size = this.values.size();
        for (int i = 0; i < size; i++) {
            try {
                dumpLoaders<? super INFO> dumploaders = this.values.get(i);
                if (dumploaders != null) {
                    dumploaders.onIntermediateImageFailed(str, th);
                }
            } catch (Exception e) {
                valueOf("InternalListener exception in onIntermediateImageFailed", e);
            }
        }
    }

    @Override // o.dumpLoaders
    public void onFailure(String str, Throwable th) {
        synchronized (this) {
            int size = this.values.size();
            for (int i = 0; i < size; i++) {
                try {
                    dumpLoaders<? super INFO> dumploaders = this.values.get(i);
                    if (dumploaders != null) {
                        dumploaders.onFailure(str, th);
                    }
                } catch (Exception e) {
                    valueOf("InternalListener exception in onFailure", e);
                }
            }
        }
    }

    @Override // o.dumpLoaders
    public void onRelease(String str) {
        synchronized (this) {
            int size = this.values.size();
            for (int i = 0; i < size; i++) {
                try {
                    dumpLoaders<? super INFO> dumploaders = this.values.get(i);
                    if (dumploaders != null) {
                        dumploaders.onRelease(str);
                    }
                } catch (Exception e) {
                    valueOf("InternalListener exception in onRelease", e);
                }
            }
        }
    }

    @Override // com.facebook.fresco.ui.common.OnDrawControllerListener
    public void onImageDrawn(String str, INFO info, DimensionsInfo dimensionsInfo) {
        int size = this.values.size();
        for (int i = 0; i < size; i++) {
            try {
                dumpLoaders<? super INFO> dumploaders = this.values.get(i);
                if (dumploaders instanceof OnDrawControllerListener) {
                    ((OnDrawControllerListener) dumploaders).onImageDrawn(str, info, dimensionsInfo);
                }
            } catch (Exception e) {
                valueOf("InternalListener exception in onImageDrawn", e);
            }
        }
    }
}
