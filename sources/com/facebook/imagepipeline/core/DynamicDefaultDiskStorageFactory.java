package com.facebook.imagepipeline.core;

import o.setAnimatingAway;
import o.setAnimations;
import o.setHasOptionsMenu;
/* loaded from: classes4.dex */
public class DynamicDefaultDiskStorageFactory implements DiskStorageFactory {
    @Override // com.facebook.imagepipeline.core.DiskStorageFactory
    public setAnimatingAway get(setAnimations setanimations) {
        return new setHasOptionsMenu(setanimations.getInitSettings(), setanimations.ah$a(), setanimations.valueOf(), setanimations.ag$a());
    }
}
