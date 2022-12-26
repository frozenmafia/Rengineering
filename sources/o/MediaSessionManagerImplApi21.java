package o;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.github.mikephil.charting.listener.ChartTouchListener;
import java.util.ArrayList;
import o.MediaSessionManager;
/* loaded from: classes4.dex */
public class MediaSessionManagerImplApi21 extends ChartTouchListener<PieRadarChartBase<?>> {
    private MediaButtonReceiver HaptikSDK$a;
    private float HaptikSDK$b;
    private ArrayList<toString> HaptikSDK$c;
    private float ah$b;
    private long invoke;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public MediaSessionManagerImplApi21(PieRadarChartBase<?> pieRadarChartBase) {
        super(pieRadarChartBase);
        this.HaptikSDK$a = MediaButtonReceiver.toString(0.0f, 0.0f);
        this.HaptikSDK$b = 0.0f;
        this.HaptikSDK$c = new ArrayList<>();
        this.invoke = 0L;
        this.ah$b = 0.0f;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.ag$a.onTouchEvent(motionEvent) && ((PieRadarChartBase) this.values).onMessageChannelReady()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                valueOf(motionEvent);
                valueOf();
                values();
                if (((PieRadarChartBase) this.values).IPostMessageService()) {
                    valueOf(x, y);
                }
                ah$a(x, y);
                this.HaptikSDK$a.values = x;
                this.HaptikSDK$a.toString = y;
            } else if (action == 1) {
                if (((PieRadarChartBase) this.values).IPostMessageService()) {
                    valueOf();
                    valueOf(x, y);
                    float ah$a = ah$a();
                    this.ah$b = ah$a;
                    if (ah$a != 0.0f) {
                        this.invoke = AnimationUtils.currentAnimationTimeMillis();
                        getServiceComponentByAction.toString(this.values);
                    }
                }
                ((PieRadarChartBase) this.values).ICustomTabsService();
                this.toString = 0;
                ah$a(motionEvent);
            } else if (action == 2) {
                if (((PieRadarChartBase) this.values).IPostMessageService()) {
                    valueOf(x, y);
                }
                if (this.toString == 0 && ag$a(x, this.HaptikSDK$a.values, y, this.HaptikSDK$a.toString) > getServiceComponentByAction.valueOf(8.0f)) {
                    this.valueOf = ChartTouchListener.ChartGesture.ROTATE;
                    this.toString = 6;
                    ((PieRadarChartBase) this.values).asBinder();
                } else if (this.toString == 6) {
                    values(x, y);
                    ((PieRadarChartBase) this.values).invalidate();
                }
                ah$a(motionEvent);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.valueOf = ChartTouchListener.ChartGesture.LONG_PRESS;
        MediaSessionManager.RemoteUserInfoImpl warmup = ((PieRadarChartBase) this.values).warmup();
        if (warmup != null) {
            warmup.ag$a(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.valueOf = ChartTouchListener.ChartGesture.SINGLE_TAP;
        MediaSessionManager.RemoteUserInfoImpl warmup = ((PieRadarChartBase) this.values).warmup();
        if (warmup != null) {
            warmup.toString(motionEvent);
        }
        if (((PieRadarChartBase) this.values).ICustomTabsService$Stub()) {
            values(((PieRadarChartBase) this.values).ah$a(motionEvent.getX(), motionEvent.getY()), motionEvent);
            return true;
        }
        return false;
    }

    private void values() {
        this.HaptikSDK$c.clear();
    }

    private void valueOf(float f, float f2) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.HaptikSDK$c.add(new toString(currentAnimationTimeMillis, ((PieRadarChartBase) this.values).values(f, f2)));
        for (int size = this.HaptikSDK$c.size(); size - 2 > 0 && currentAnimationTimeMillis - this.HaptikSDK$c.get(0).valueOf > 1000; size--) {
            this.HaptikSDK$c.remove(0);
        }
    }

    private float ah$a() {
        if (this.HaptikSDK$c.isEmpty()) {
            return 0.0f;
        }
        toString tostring = this.HaptikSDK$c.get(0);
        ArrayList<toString> arrayList = this.HaptikSDK$c;
        toString tostring2 = arrayList.get(arrayList.size() - 1);
        toString tostring3 = tostring;
        for (int size = this.HaptikSDK$c.size() - 1; size >= 0; size--) {
            tostring3 = this.HaptikSDK$c.get(size);
            if (tostring3.ag$a != tostring2.ag$a) {
                break;
            }
        }
        float f = ((float) (tostring2.valueOf - tostring.valueOf)) / 1000.0f;
        if (f == 0.0f) {
            f = 0.1f;
        }
        boolean z = tostring2.ag$a >= tostring3.ag$a;
        if (Math.abs(tostring2.ag$a - tostring3.ag$a) > 270.0d) {
            z = !z;
        }
        if (tostring2.ag$a - tostring.ag$a > 180.0d) {
            tostring.ag$a = (float) (tostring.ag$a + 360.0d);
        } else if (tostring.ag$a - tostring2.ag$a > 180.0d) {
            tostring2.ag$a = (float) (tostring2.ag$a + 360.0d);
        }
        float abs = Math.abs((tostring2.ag$a - tostring.ag$a) / f);
        return !z ? -abs : abs;
    }

    public void ah$a(float f, float f2) {
        this.HaptikSDK$b = ((PieRadarChartBase) this.values).values(f, f2) - ((PieRadarChartBase) this.values).onPostMessage();
    }

    public void values(float f, float f2) {
        ((PieRadarChartBase) this.values).setRotationAngle(((PieRadarChartBase) this.values).values(f, f2) - this.HaptikSDK$b);
    }

    public void valueOf() {
        this.ah$b = 0.0f;
    }

    public void ag$a() {
        if (this.ah$b == 0.0f) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.ah$b *= ((PieRadarChartBase) this.values).receiveFile();
        ((PieRadarChartBase) this.values).setRotationAngle(((PieRadarChartBase) this.values).onRelationshipValidationResult() + (this.ah$b * (((float) (currentAnimationTimeMillis - this.invoke)) / 1000.0f)));
        this.invoke = currentAnimationTimeMillis;
        if (Math.abs(this.ah$b) >= 0.001d) {
            getServiceComponentByAction.toString(this.values);
        } else {
            valueOf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class toString {
        public float ag$a;
        public long valueOf;

        public toString(long j, float f) {
            this.valueOf = j;
            this.ag$a = f;
        }
    }
}
