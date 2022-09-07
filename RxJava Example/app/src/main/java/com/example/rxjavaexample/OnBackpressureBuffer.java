package com.example.rxjavaexample;

import android.util.Log;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.schedulers.Schedulers;

public class OnBackpressureBuffer {
    private static final String TAG = OnBackpressureBuffer.class.getSimpleName();
  /* Flowable.range(0, 1000000)
           .onBackpressureBuffer().
    observeOn(Schedulers.computation())
            .subscribe(new FlowableSubscriber<Integer>() {
        @Override
        public void onSubscribe(Subscription s) {

        }
        @Override
        public void onNext(Integer integer) {
            Log.d(TAG, "onNext: " + integer);
        }
        @Override
        public void onError(Throwable t) {
            Log.e(TAG, "onError: ", t);
        }
        @Override
        public void onComplete() {

        }
    });*/
}
