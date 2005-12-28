/** 
 * 
 * Copyright 2004 Protique Ltd
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
 *
 **/
package org.apache.activemq.activemq.usecases;

import java.io.File;
import java.io.IOException;

import org.apache.activemq.activemq.store.DefaultPersistenceAdapterFactory;
import org.apache.activemq.activemq.store.PersistenceAdapter;

/**
 * @version $Revision: 1.1.1.1 $
 */
public class JournalDurableSubscriptionTest extends DurableSubscriptionTestSupport {

    private boolean init;

    protected PersistenceAdapter createPersistenceAdapter() throws IOException {
        File dataDir = new File("target/test-data/durableJournal");
        DefaultPersistenceAdapterFactory factory = new DefaultPersistenceAdapterFactory();
        factory.setDataDirectory(dataDir);
        factory.setUseJournal(true);
        factory.setJournalLogFileSize(1024*64); 
        return factory.createPersistenceAdapter();
    }
}
