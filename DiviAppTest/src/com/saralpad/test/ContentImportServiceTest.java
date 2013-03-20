package com.saralpad.test;

import com.saralpad.data.importer.ContentImportService;

import android.content.Intent;
import android.os.IBinder;
import android.test.ServiceTestCase;
import android.test.suitebuilder.annotation.MediumTest;
import android.test.suitebuilder.annotation.SmallTest;

public class ContentImportServiceTest extends
		ServiceTestCase<ContentImportService> {

	public ContentImportServiceTest() {
		super(ContentImportService.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
    @SmallTest
    public void testPreconditions() {
    }
    
    public void testService()
    {
        Intent intent = new Intent(getSystemContext(), ContentImportService.class);
        super.startService(intent);     
        assertNotNull(getService());        
    }
    
    /**
     * Test basic startup/shutdown of Service
     */
    @SmallTest
    public void testStartable() {
        Intent startIntent = new Intent();
        startIntent.setClass(getContext(), ContentImportService.class);
        startService(startIntent); 
    }
    
    /**
     * Test binding to service
     */
    @MediumTest
    public void testBindable() {
        Intent startIntent = new Intent();
        startIntent.setClass(getContext(), ContentImportService.class);
        IBinder service = bindService(startIntent); 
    }

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
