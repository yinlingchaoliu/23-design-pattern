package com.chaoliu.pattern.mvp;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/**
 * present核心逻辑
 * 弱引用避免内存泄漏
 * @param <VIEW>
 */
public abstract class BasePresenter<VIEW> {

    private Reference<VIEW> mViewRef; //弱引用

    /**
     * 绑定视图
     * @param view
     */
    public void attachView(VIEW view) {
        mViewRef = new WeakReference<VIEW>( view );
    }

    protected VIEW getView() {
        return mViewRef.get();
    }

    public boolean isAttached(){
        return mViewRef!=null && mViewRef.get() != null; //判断是否绑定视图
    }

    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear(); //解除关联
            mViewRef = null;
        }
    }

}