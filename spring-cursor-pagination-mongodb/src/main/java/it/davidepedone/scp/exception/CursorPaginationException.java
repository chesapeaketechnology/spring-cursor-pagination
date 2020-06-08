/*
 * Copyright 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package it.davidepedone.scp.exception;

import org.springframework.lang.Nullable;

/**
 * An exception indicating that a cursor pagination operation failed.
 *
 * @author Davide Pedone
 * @since 1.0
 */
public class CursorPaginationException extends Exception {

	public CursorPaginationException(@Nullable String s) {
		super(s);
	}

	public CursorPaginationException(@Nullable String s, @Nullable Throwable throwable) {
		super(s, throwable);
	}

}
