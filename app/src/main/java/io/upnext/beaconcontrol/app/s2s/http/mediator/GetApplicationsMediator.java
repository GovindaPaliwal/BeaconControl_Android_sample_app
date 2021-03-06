/*
 * Copyright (c) 2016, Upnext Technologies Sp. z o.o.
 * All rights reserved.
 *
 * This source code is licensed under the BSD 3-Clause License found in the
 * LICENSE.txt file in the root directory of this source tree.
 */

package io.upnext.beaconcontrol.app.s2s.http.mediator;

import android.content.Context;

import io.upnext.beaconcontrol.app.s2s.http.BeaconControlManager;
import io.upnext.beaconcontrol.app.s2s.http.HttpListener;
import io.upnext.beaconcontrol.app.s2s.http.response.GetApplicationsResponse;

public class GetApplicationsMediator extends HttpCallMediator<GetApplicationsResponse> {

    public GetApplicationsMediator(Context context, BeaconControlManager beaconControlManager, HttpListener listener) {
        super(context, beaconControlManager, listener);
    }

    public void getApplications() {
        onStartCall();
    }

    @Override
    protected void execute() {
        call = beaconControlManager.getApplications();
    }
}
