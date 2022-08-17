package com.antsilo.ahttpdemo;

import org.junit.Test;

import static org.junit.Assert.*;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        RetrofitManager.getInstance().testApi()
                .getData("福利", 3, 1)
                .subscribe(new Consumer<HttpResp>() {
                    @Override
                    public void accept(HttpResp httpResp) throws Exception {
                        System.out.println(httpResp);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        throwable.printStackTrace();
                    }
                }, new Action() {
                    @Override
                    public void run() throws Exception {

                    }
                });
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(4, 2 + 2);
        System.out.println("end------->");
    }
}