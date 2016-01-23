package com.bytestemplar.slackboard;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Fortyseven on 2016-01-22.
 */
public class Pamphlet1Activity extends Activity
{
    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );

        setContentView( R.layout.pam1 );
    }

    public void btnLaunchSite( View v )
    {
        Intent i = new Intent( Intent.ACTION_VIEW );
        i.setData( Uri.parse( "http://www.SubGenius.com/" ) );
        startActivity( i );
    }
}
