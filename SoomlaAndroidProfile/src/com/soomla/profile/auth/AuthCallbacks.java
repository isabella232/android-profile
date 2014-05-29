/*
 * Copyright (C) 2012-2014 Soomla Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.soomla.profile.auth;

 import com.soomla.profile.domain.UserProfile;
 import com.soomla.store.billing.IabPurchase;
 import com.soomla.store.billing.IabSkuDetails;

 import java.util.List;

 /**
  * A utility class that defines interfaces for passing callbacks to in-app billing events.
  */
public class AuthCallbacks {

     /**
      * Listens for in-app billing service initialization
      */
     public interface AuthListener {

         /**
          * Performs the following function upon success.
          */
        public void success();

         /**
          * Performs the following function upon failure and prints the given message.
          *
          * @param message reason for failure
          */
        public void fail(String message);
     }

     public interface LoginListener {

         /**
          * Performs the following function upon success.
          */
         public void success();

         /**
          * Performs the following function upon failure and prints the given message.
          *
          * @param message reason for failure
          */
         public void fail(String message);

         public void cancel();
     }

     /**
      * Listens for in-app billing service initialization
      */
     public interface UserProfileListener {

         /**
          * Performs the following function upon success.
          */
         public void success(UserProfile userProfile);

         /**
          * Performs the following function upon failure and prints the given message.
          *
          * @param message reason for failure
          */
         public void fail(String message);
     }





}
