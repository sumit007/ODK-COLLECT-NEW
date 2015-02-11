package org.odk.collect.android.tasks;

import android.content.ContentValues;
import android.net.Uri;
import android.os.AsyncTask;

import org.odk.collect.android.application.Collect;
import org.odk.collect.android.listeners.FormSavedListener;
import org.odk.collect.android.logic.FormController;
import org.odk.collect.android.provider.InstanceProviderAPI;

/**
 * Created by shiva on 1/16/2015.
 *
 *
 *
 *
 *
 */

public class UpdateDatabaseTask  {
    public final static String t = "UpdateDatabaseTask";
    public Uri mUri;
    FormController formController = Collect.getInstance().getFormController();
    ContentValues values = new ContentValues();

    public void fun () {
     //   FormController formController = Collect.getInstance().getFormController();
     //   ContentValues values = new ContentValues();

        System.out.println("suresh ji hellooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

        values.put(InstanceProviderAPI.InstanceColumns.DISPLAY_NAME,"1" );
        values.put(InstanceProviderAPI.InstanceColumns.STATUS, InstanceProviderAPI.STATUS_COMPLETE);
        values.put(InstanceProviderAPI.InstanceColumns.CAN_EDIT_WHEN_COMPLETE,"True");
        values.put(InstanceProviderAPI.InstanceColumns.SUBMISSION_URI,"sk");
        values.put(InstanceProviderAPI.InstanceColumns.JR_FORM_ID,"Owner" );
        values.put(InstanceProviderAPI.InstanceColumns.JR_VERSION,"" );
        values.put(InstanceProviderAPI.InstanceColumns.INSTANCE_FILE_PATH,"/storage/emulated/0/odk/instances/");
        values.put(InstanceProviderAPI.InstanceColumns.DISPLAY_SUBTEXT,"Downloded" );
        values.put(InstanceProviderAPI.InstanceColumns.DISPLAY_TEXT,"Downloded" );
        values.put(InstanceProviderAPI.InstanceColumns.DISPLAY_TEXT1,"Downloded" );
        mUri = Collect.getInstance().getContentResolver()
                .insert(InstanceProviderAPI.InstanceColumns.CONTENT_URI, values);

    }
}
