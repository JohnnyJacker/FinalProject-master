package com.udacity.gradle.builditbigger;



import android.widget.ProgressBar;
import org.junit.Test;
import java.util.concurrent.TimeUnit;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by chris on 1/14/2017.
 */

public class EndpointsAsyncTaskTest{

    ProgressBar progressBar;

    EndpointsAsyncTask asyncTask = new EndpointsAsyncTask();


    @Test
    public void AsyncTaskTest() throws Exception {

        String result = asyncTask.execute().get(60, TimeUnit.SECONDS);

        assertNotNull(result);
        assertTrue("AsyncTask Test Failed", result.length() > 0);


    }

}
