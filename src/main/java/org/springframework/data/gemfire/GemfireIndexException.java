/*
 * Copyright 2010-2013 the original author or authors.
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

package org.springframework.data.gemfire;

import org.springframework.dao.DataIntegrityViolationException;

import com.gemstone.gemfire.cache.query.IndexCreationException;
import com.gemstone.gemfire.cache.query.IndexExistsException;
import com.gemstone.gemfire.cache.query.IndexInvalidException;
import com.gemstone.gemfire.cache.query.IndexMaintenanceException;
import com.gemstone.gemfire.cache.query.IndexNameConflictException;

/**
 * Gemfire-specific subclass thrown on Index management.
 *  
 * @author Costin Leau
 * @author John Blum
 * @see com.gemstone.gemfire.cache.query.IndexCreationException
 * @see com.gemstone.gemfire.cache.query.IndexExistsException
 * @see com.gemstone.gemfire.cache.query.IndexInvalidException
 * @see com.gemstone.gemfire.cache.query.IndexMaintenanceException
 * @see com.gemstone.gemfire.cache.query.IndexNameConflictException
 */
@SuppressWarnings({ "serial", "unused" })
public class GemfireIndexException extends DataIntegrityViolationException {

	public GemfireIndexException(IndexCreationException cause) {
		this(cause.getMessage(), cause);
	}

	public GemfireIndexException(String message, IndexCreationException cause) {
		super(message, cause);
	}

	public GemfireIndexException(IndexExistsException cause) {
		this(cause.getMessage(), cause);
	}

	public GemfireIndexException(String message, IndexExistsException cause) {
		super(message, cause);
	}

	public GemfireIndexException(IndexInvalidException cause) {
		this(cause.getMessage(), cause);
	}

	public GemfireIndexException(String message, IndexInvalidException cause) {
		super(message, cause);
	}

	public GemfireIndexException(IndexMaintenanceException cause) {
		this(cause.getMessage(), cause);
	}

	public GemfireIndexException(String message, IndexMaintenanceException cause) {
		super(message, cause);
	}

	public GemfireIndexException(IndexNameConflictException cause) {
		this(cause.getMessage(), cause);
	}

	public GemfireIndexException(String message, IndexNameConflictException cause) {
		super(message, cause);
	}

}
