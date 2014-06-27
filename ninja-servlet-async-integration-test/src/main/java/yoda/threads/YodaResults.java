/*
 * Copyright 2014 ra.
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

package yoda.threads;

import ninja.Result;
import ninja.Results;


public class YodaResults {
    
    public Result getTimeoutExceptionResult() {
        
        Result result = Results.text().render("too busy");
        return result;
    
    }
    
    public Result getTooBusyResult() {
        
        Result result = Results.text().render("too busy");
        return result;
    
    }
    
    public Result getResponderRejectedExecutionResult() {
        
        Result result = Results.text().render("rejected execution handler...");
        return result;
        
    }

}
