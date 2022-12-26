package com.facebook.react.bridge.queue;

import o.FragmentLifecycleCallbacksDispatcher;
/* loaded from: classes.dex */
public class ReactQueueConfigurationSpec {
    private final MessageQueueThreadSpec mJSQueueThreadSpec;
    private final MessageQueueThreadSpec mNativeModulesQueueThreadSpec;

    private ReactQueueConfigurationSpec(MessageQueueThreadSpec messageQueueThreadSpec, MessageQueueThreadSpec messageQueueThreadSpec2) {
        this.mNativeModulesQueueThreadSpec = messageQueueThreadSpec;
        this.mJSQueueThreadSpec = messageQueueThreadSpec2;
    }

    public MessageQueueThreadSpec getNativeModulesQueueThreadSpec() {
        return this.mNativeModulesQueueThreadSpec;
    }

    public MessageQueueThreadSpec getJSQueueThreadSpec() {
        return this.mJSQueueThreadSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReactQueueConfigurationSpec createDefault() {
        return builder().setJSQueueThreadSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("js")).setNativeModulesQueueThreadSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules")).build();
    }

    /* loaded from: classes4.dex */
    public static class Builder {
        private MessageQueueThreadSpec mJSQueueSpec;
        private MessageQueueThreadSpec mNativeModulesQueueSpec;

        public Builder setNativeModulesQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.ah$a(this.mNativeModulesQueueSpec == null, "Setting native modules queue spec multiple times!");
            this.mNativeModulesQueueSpec = messageQueueThreadSpec;
            return this;
        }

        public Builder setJSQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.ah$a(this.mJSQueueSpec == null, "Setting JS queue multiple times!");
            this.mJSQueueSpec = messageQueueThreadSpec;
            return this;
        }

        public ReactQueueConfigurationSpec build() {
            return new ReactQueueConfigurationSpec((MessageQueueThreadSpec) FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.ag$a(this.mNativeModulesQueueSpec), (MessageQueueThreadSpec) FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.ag$a(this.mJSQueueSpec));
        }
    }
}
