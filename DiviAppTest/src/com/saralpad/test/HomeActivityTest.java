package com.saralpad.test;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ActivityUnitTestCase;
import android.test.InstrumentationTestCase;
import android.test.ViewAsserts;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.jayway.android.robotium.solo.Solo;
import com.saralpad.HomeActivity;
import com.saralpad.LearnActivity;
import com.saralpad.LoginActivity;
import com.saralpad.PracticeHomeActivity;
import com.saralpad.ProgressActivity;
import com.saralpad.R;
import com.saralpad.SettingsActivity;
import com.saralpad.data.DatabaseHelper;
import com.saralpad.util.Config;
import com.saralpad.util.LoadInitialDataHelper;

public class HomeActivityTest extends
		ActivityInstrumentationTestCase2<HomeActivity> {
	private static final String TAG = "com.saralpad.test.HomeActivityTest";
	HomeActivity mHomeActivity;
	Button importButton, reloadButton,showDownloads;
	 TextView learn,practice,progress,settings,hSchoolName,hMainStuName;
	 Intent myIntent;
	 Instrumentation mInstrumentation;
	 ImageView home_logo;
	
	 private String resourceString;
	 private Activity nextActivity;


	public HomeActivityTest() {
		super(HomeActivity.class);
	
		
	}

	protected void setUp() throws Exception {
		super.setUp();
		//(false);
		//  mInstrumentation = getInstrumentation();
		 // setActivityInitialTouchMode(false);
		 myIntent = new Intent(Intent.ACTION_VIEW);
		 mHomeActivity=getActivity();
		
	importButton=(Button) mHomeActivity.findViewById(R.id.import_button);
		 showDownloads = (Button) mHomeActivity.findViewById(R.id.showDownloads);
	 learn = (TextView) mHomeActivity.findViewById(R.id.home_learn);
	  practice = (TextView) mHomeActivity.findViewById(R.id.home_practice);
		   progress = (TextView) mHomeActivity.findViewById(R.id.home_progress);
		  settings = (TextView) mHomeActivity.findViewById(R.id.home_settings);
		  hSchoolName=(TextView)mHomeActivity.findViewById(R.id.main_course_name);
		   hMainStuName = (TextView)mHomeActivity.findViewById(R.id.main_student_name);
		   home_logo=(ImageView)mHomeActivity.findViewById(R.id.home_logo);
		  
		  
		
		
		 
	}
	
	/*public void testText(){
	    assertEquals(resourceString,(String)learn.getText());
	    assertEquals(resourceString,(String)practice.getText());
	    assertEquals(resourceString,(String)progress.getText());
	    assertEquals(resourceString,(String)settings.getText());
	}
	public void testButton(){
	     mHomeActivity.runOnUiThread(
	                new Runnable() {
	                    public void run() {
	                       learn.performClick();
	                       nextActivity =  getActivity();
	                       assertEquals(nextActivity, LearnActivity.class);
	                    }
	                }
	            );
	}

*/

	public void testPreconditions() {
	    assertTrue(learn != null);
	    assertTrue(practice != null);
	    assertTrue(importButton!=null);
	    assertTrue(showDownloads!=null);
	    assertTrue(progress!=null);
	    assertTrue(settings!=null);
	    assertTrue(hSchoolName!=null);
	}
	public void testPreconditionss(){
		assertTrue(learn == null);
	    assertTrue(practice == null);
	    assertTrue(importButton == null);
	    assertTrue(showDownloads ==null);
	    assertTrue(progress==null);
	    assertTrue(settings==null);
	    assertTrue(hSchoolName==null);
	}
	public void testWrongTextLearn(){
		String lExpected="learn";
		String l=learn.getText().toString();
		assertEquals(lExpected,l);
	}
	public void testWrongTextPractice(){
		String lExpected="practice";
		String l=learn.getText().toString();
		assertEquals(lExpected,l);
	}
	public void testWrongTextProgress(){
		String lExpected="progress";
		String l=learn.getText().toString();
		assertEquals(lExpected,l);
	}
	public void testWrongTextSettings(){
		String lExpected="setting";
		String l=learn.getText().toString();
		assertEquals(lExpected,l);
	}
	public void testWrongTextShowDownloads(){
		String expected="show downloads";
		String s=showDownloads.getText().toString();
		assertEquals(s,expected);
	}
	public void testWrongTextImportContent(){
		String expected="import ";
		String s=importButton.getText().toString();
		assertEquals(s,expected);
	}
	public void testWrongMainCourseName(){
		
		 String expected="Sri Krishnaveni  School";
		 String actual=hSchoolName.getText().toString();
		 assertEquals(expected,actual);
	}
	public void testWrongMainStudentName(){
		String expected="Sanju";
		 String actual=hMainStuName.getText().toString();
		 assertEquals(expected,actual);
	}

	/*public void testButtons(){
		
		 mHomeActivity.runOnUiThread(new Runnable() {
			 public void run(){
				 
				practice.requestFocus();
				learn.requestFocus();
				progress.requestFocus();
				settings.requestFocus();
				showDownloads.requestFocus();
				importButton.requestFocus();
				 
			 }
			 
		});
		 mInstrumentation.waitForIdleSync();
		 
		 this.sendKeys(KeyEvent.KEYCODE_DPAD_CENTER);
	}*/
		/*public void testAValidUserCanLogIn() {
		 
		 Instrumentation instrumentation=getInstrumentation();
		// Register we are interested in the LoginActivity activiry...
		Instrumentation.ActivityMonitor monitor=instrumentation.addMonitor(LoginActivity.class.getName(),null,false);
		// Start the LoginActivity as the first activity...
		
		 Intent intent=new Intent(Intent.ACTION_MAIN);
		 intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		 intent.setClassName(instrumentation.getTargetContext(), LoginActivity.class.getName());
		 instrumentation.startActivitySync(intent);
		 
		// Wait for it to start...
		 Activity currentActivity=getInstrumentation().waitForMonitorWithTimeout(monitor, 5);
		assertNotNull(currentActivity);
		}*/
	public void testMainStudentName(){
		// getActivity();
		 String expected="Sanjana";
		 String actual=hMainStuName.getText().toString();
		 assertEquals(expected,actual);
	}
	public void testMainCourseName(){
		// getActivity();
		 String expected="Sri Krishnaveni Talent School";
		 String actual=hSchoolName.getText().toString();
		 assertEquals(expected,actual);
	}
	public void testShowDownloads(){
		// getActivity();
		 String expected="Show Downloads";
		 String actual=showDownloads.getText().toString();
		 assertEquals(expected,actual);
	}
	public void testImportButton(){
		//getActivity();
		String expected="Import Content";
		String actual=importButton.getText().toString();
		assertEquals(expected,actual);
	}
	public void testLearnButton(){
		//assertNotNull(learn);
	
			
				/*myIntent.setClass(getActivity(), getClass());
				LearnActivity lActivity=launchActivityWithIntent("com.saralpad",LearnActivity.class,myIntent);
				
				assertTrue(Config.DEBUG);
				Log.d(TAG, "loading learn activity");*/
			//	startActivity(myIntent,null,null);
				//getActivity();
				//learn=(TextView)mHomeActivity.findViewById(R.id.home_learn);
			String l1=learn.getText().toString();
				String expected="Learn";
				assertEquals(expected,l1);
				
				
				
		
		
		/*myIntent=new Intent(Intent.ACTION_VIEW);
		LearnActivity lActivity=launchActivityWithIntent("com.saralpad",LearnActivity.class,myIntent);
		 learn = (TextView) mHomeActivity.findViewById(R.id.home_learn);
		 assertNotNull(learn);*/
	}
	public void testPracticeButton(){
		assertNotNull(practice);
		
		
				// TODO Auto-generated method stub
				
				// getActivity();
				 String actual=practice.getText().toString();
				 String pexpected="Practice";
				 assertEquals(actual,pexpected);
				 
				 
				// myIntent.setClass(getActivity(), getClass());
             //  setActivityIntent(myIntent);
				//mHomeActivity=getActivity();
			/*
				PracticeHomeActivity pActivity=launchActivityWithIntent("com.saralpad",PracticeHomeActivity.class,myIntent);
				myIntent.setClass(mHomeActivity, PracticeHomeActivity.class);
				if(!mHomeActivity.courseId.equals("krishnaveni_xclass"))
				return;
				launchActivity("com.saralpad",PracticeHomeActivity.class,null);
				assertTrue(Config.DEBUG);
				Log.d(TAG,"Loading Practice Activity");
					*/
					//getInstrumentation().callActivityOnStart(pActivity);
					
				
		
		 /*myIntent = new Intent(Intent.ACTION_VIEW);
		 PracticeHomeActivity pActivity=launchActivityWithIntent("com.saralpad",PracticeHomeActivity.class,myIntent);*/
	}
	public void testProgressButton(){
		/*assertTrue(progress!=null);
		
		
		progress.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				myIntent=new Intent(Intent.ACTION_VIEW);
			//	myIntent.setClass(getActivity(), getClass());
				ProgressActivity progActivity=launchActivityWithIntent("com.saralpad",ProgressActivity.class,myIntent);
				if(!mHomeActivity.courseId.equals("Krishnaveni_xclass"))
				return;
				launchActivity("com.saralpad",ProgressActivity.class,null);
				View view=mHomeActivity.findViewById(R.id.location);
				assertTrue(view!=null);
				assertTrue(view.getVisibility()==0);
				getInstrumentation().callActivityOnStart(progActivity);			}
		});
		myIntent=new Intent(Intent.ACTION_VIEW);
		ProgressActivity progActivity=launchActivityWithIntent("com.saralpad",ProgressActivity.class,myIntent);
		*/
		  getActivity();
		  String progExpected="Progress";
		  String p1=progress.getText().toString();
		  assertEquals(p1,progExpected);
		 
	}
	public void testSettingsButton(){
		
		/*settings.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				myIntent=new Intent(Intent.ACTION_VIEW);
			//	myIntent.setClass(getActivity(), getClass());
				
				SettingsActivity sActivity=launchActivityWithIntent("com.saralpad",SettingsActivity.class,myIntent);
			
				
			}
		});
		myIntent=new Intent(Intent.ACTION_VIEW);
		SettingsActivity sActivity=launchActivityWithIntent("com.saralpad",SettingsActivity.class,myIntent);*/
	//	getActivity();
		String settingsExpected="Settings";
		
		
		String s1=settings.getText().toString();
		assertEquals(s1,settingsExpected);
		
	}
	
	 
	/*public void testImportButtonWork(){
		importButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(mHomeActivity, "Starting content import", Toast.LENGTH_LONG).show();
				Log.d(TAG, "Starting content import");
				
			}
		});
		
	}*/
	
	public void testButtonVisibility(){
		
		
		ViewAsserts.assertOnScreen(importButton.getRootView(),importButton);
		ViewAsserts.assertOnScreen(showDownloads.getRootView(), showDownloads);
		ViewAsserts.assertOnScreen(learn.getRootView(), learn);
		ViewAsserts.assertOnScreen(practice.getRootView(), practice);
		ViewAsserts.assertOnScreen(progress.getRootView(), progress);
		ViewAsserts.assertOnScreen(settings.getRootView(), settings);
		ViewAsserts.assertOnScreen(hSchoolName.getRootView(), hSchoolName);
		ViewAsserts.assertOnScreen(hMainStuName.getRootView(), hMainStuName);
	}
	public void testImageViewAlignment(){
		
		ViewAsserts.assertVerticalCenterAligned(home_logo.getRootView(), home_logo);
		
	}
	public void testButtonAlignments(){
		
		ViewAsserts.assertBottomAligned(learn.getRootView(), learn);
		ViewAsserts.assertBottomAligned(practice.getRootView(), practice);
		ViewAsserts.assertBottomAligned(progress.getRootView(), progress);
		ViewAsserts.assertBottomAligned(settings.getRootView(), settings);
		
		ViewAsserts.assertBaselineAligned(learn, practice);
		ViewAsserts.assertBaselineAligned(progress, settings);
		
	}
	public void testImageViewWrongAlignment(){
		ViewAsserts.assertBaselineAligned(home_logo.getRootView(), home_logo);
	}
	
	
	/*public void testReloadeInitResources(){
		assertFalse(Config.LOAD_INIT_RESOURCES);
		LoadInitialDataHelper.loadResources(mHomeActivity);
		Log.w(TAG, "reloading init database!");
		DatabaseHelper.getInstance(mHomeActivity);
		
	}*/
	/*public void testReloadInitDatabase(){
		assertFalse(Config.LOAD_INIT_CONTENT_DATABASE);
		
	}
	public void testButtonsToast() throws Exception {
     	solo .clickOnButton(0);
        boolean toast1 = solo.searchText("Starting content import");
              assertEquals("Toast message appered- starting content import",toast1,true);
                       
 }
	*/
	

	
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
