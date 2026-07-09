package com.mockitotesting.basic;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        //Arranging

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("mock data");

        MyService service = new MyService(mockApi);

        //Acting

        String result = service.fetchData();

        //Asserting

        Assert.assertEquals("mock data", result);

    }
}

