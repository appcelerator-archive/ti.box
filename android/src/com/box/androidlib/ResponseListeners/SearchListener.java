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

import com.box.androidlib.DAO.SearchResult;

/**
 * Interface definition for a callback to be invoked when Box.search() is
 * called.
 */
public interface SearchListener extends ResponseListener {
    
    /** Operation was successful. */
    String STATUS_S_SEARCH = "s_search";
    
    /** Operation was unsuccessful. */
    String STATUS_E_SEARCH = "e_search";
    
    /**
     * Called when the API request has completed.
     * 
     * @param searchResult
     *            A SearchResult object, or null if there was an error
     * @param status
     *            Status code from Box API
     */
    void onComplete(SearchResult searchResult, String status);
}
