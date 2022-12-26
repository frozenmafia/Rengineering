package com.facebook.react;

import android.app.Service;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import o.FragmentStateManagerControl;
/* loaded from: classes6.dex */
public abstract class HeadlessJsTaskService extends Service implements FragmentStateManagerControl {
    private final Set<Integer> values = new CopyOnWriteArraySet();
}
