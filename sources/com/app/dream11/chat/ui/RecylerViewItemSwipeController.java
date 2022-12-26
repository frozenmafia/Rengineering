package com.app.dream11.chat.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.events.TouchesHelper;
import o.loadFont;
import o.runAnimators;
/* loaded from: classes.dex */
public class RecylerViewItemSwipeController extends ItemTouchHelper.Callback {
    private final Context context;
    private RecyclerView.ViewHolder currentItemViewHolder;
    private float dX;
    private View mView;
    private final int maxSwipeLimitInDP;
    private final int minSwipeLimitForSendingCallbackInDP;
    private boolean startTracking;
    private boolean swipeBack;

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        runAnimators.ag$a(recyclerView, "recyclerView");
        runAnimators.ag$a(viewHolder, "viewHolder");
        runAnimators.ag$a(viewHolder2, TouchesHelper.TARGET_KEY);
        return false;
    }

    protected void onSwipeComplete(RecyclerView.ViewHolder viewHolder, RecyclerView.Adapter<?> adapter) {
        runAnimators.ag$a(viewHolder, "viewholder");
        runAnimators.ag$a(adapter, "adapter");
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
        runAnimators.ag$a(viewHolder, "viewHolder");
    }

    protected boolean shouldSwipeCurrentViewHolder(RecyclerView.ViewHolder viewHolder) {
        runAnimators.ag$a(viewHolder, "viewHolder");
        return true;
    }

    public RecylerViewItemSwipeController(Context context) {
        runAnimators.ag$a(context, "context");
        this.context = context;
        this.maxSwipeLimitInDP = 65;
        this.minSwipeLimitForSendingCallbackInDP = 40;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        runAnimators.ag$a(recyclerView, "recyclerView");
        runAnimators.ag$a(viewHolder, "viewHolder");
        View view = viewHolder.itemView;
        runAnimators.ah$a(view, "viewHolder.itemView");
        this.mView = view;
        return ItemTouchHelper.Callback.makeMovementFlags(0, 8);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int convertToAbsoluteDirection(int i, int i2) {
        if (this.swipeBack) {
            this.swipeBack = false;
            return 0;
        }
        return super.convertToAbsoluteDirection(i, i2);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
        runAnimators.ag$a(canvas, "c");
        runAnimators.ag$a(recyclerView, "recyclerView");
        runAnimators.ag$a(viewHolder, "viewHolder");
        if (shouldSwipeCurrentViewHolder(viewHolder)) {
            if (i == 1) {
                setTouchListener(recyclerView, viewHolder);
            }
            View view = this.mView;
            if (view == null) {
                runAnimators.valueOf("mView");
                view = null;
            }
            if (view.getTranslationX() < convertTodp(this.maxSwipeLimitInDP) || f < this.dX) {
                super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
                this.dX = f;
                this.startTracking = true;
            }
            this.currentItemViewHolder = viewHolder;
        }
    }

    private final void setTouchListener(final RecyclerView recyclerView, final RecyclerView.ViewHolder viewHolder) {
        recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: com.app.dream11.chat.ui.RecylerViewItemSwipeController$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m840setTouchListener$lambda1;
                m840setTouchListener$lambda1 = RecylerViewItemSwipeController.m840setTouchListener$lambda1(RecylerViewItemSwipeController.this, recyclerView, viewHolder, view, motionEvent);
                return m840setTouchListener$lambda1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setTouchListener$lambda-1  reason: not valid java name */
    public static final boolean m840setTouchListener$lambda1(RecylerViewItemSwipeController recylerViewItemSwipeController, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, View view, MotionEvent motionEvent) {
        RecyclerView.Adapter adapter;
        runAnimators.ag$a(recylerViewItemSwipeController, "this$0");
        runAnimators.ag$a(recyclerView, "$recyclerView");
        runAnimators.ag$a(viewHolder, "$viewHolder");
        boolean z = true;
        if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
            z = false;
        }
        recylerViewItemSwipeController.swipeBack = z;
        if (z) {
            View view2 = recylerViewItemSwipeController.mView;
            if (view2 == null) {
                runAnimators.valueOf("mView");
                view2 = null;
            }
            if (Math.abs(view2.getTranslationX()) >= recylerViewItemSwipeController.convertTodp(recylerViewItemSwipeController.minSwipeLimitForSendingCallbackInDP) && (adapter = recyclerView.getAdapter()) != null) {
                recylerViewItemSwipeController.onSwipeComplete(viewHolder, adapter);
            }
        }
        return false;
    }

    private final int convertTodp(int i) {
        return (int) loadFont.values(this.context, i);
    }
}
