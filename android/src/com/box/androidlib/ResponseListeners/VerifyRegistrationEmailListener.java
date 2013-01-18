/*******************************************************************************
 * Copyright 2011 Box.net.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.box.androidlib.ResponseListeners;

/**
 * Interface definition for a callback to be invoked when
 * Box.verifyRegistrationEmail() is called.
 */
public interface VerifyRegistrationEmailListener extends ResponseListener {
    
    /** Operation was successful. */
    String STATUS_EMAIL_OK = "email_ok";
    
    /** Not a valid email address. */
    String STATUS_EMAIL_INVALID = "email_invalid";
    
    /** E-mail already registered. */
    String STATUS_EMAIL_ALREADY_REGISTERED = "email_already_registered";
    
    /**
     * Called when the API request has completed.
     * 
     * @param status
     *            Status code from Box API
     */
    void onComplete(String status);
}
