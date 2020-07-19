package com.clark.network.observer;

import com.clark.network.basebean.BaseResponse;
import io.reactivex.observers.DisposableObserver;

/**
 * 根据不同的页面结构修改相应的代码
 * @param <T>
 */
public abstract class BaseObserver<T> extends DisposableObserver<BaseResponse<T>> {
//    private IView baseView;

    public BaseObserver() {

    }

/*    public BaseObserver(IView baseView) {
        this.baseView = baseView;
    }*/

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    public void onNext(BaseResponse<T> baseResponse) {

    }

    /**
     * 回调正常数据
     *
     * @param data
     */
    protected abstract void onSuccess(T data);

    /**
     * 异常处理，包括两方面数据：
     * (1) 服务端没有没有返回数据，HttpException，如网络异常，连接超时;
     * (2) 服务端返回了数据，但 errcode!=0,即服务端返回的data为空，如 密码错误,App登陆超时,token失效
     */
    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
