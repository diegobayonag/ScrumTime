/**
 *  Copyright 2009   scrumtime.org
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 * */
package scrumtime.user

import scrumtime.user.SystemUser

class SystemUserCredential {
    /** reference to system user   */
    SystemUser systemUser
    static belongsTo = SystemUser
    /* hashed password */
    String password
    String retypedPassword
    static transients = ['retypedPassword']

    static constraints = {
        password(blank: false)
        retypedPassword(blank: false)
    }

    static mapping = {
        systemUser cascade: "save-update"
    }
}
