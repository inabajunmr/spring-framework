/*
 * Copyright 2002-2022 the original author or authors.
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

package org.springframework.ui.context;

import org.springframework.lang.Nullable;

/**
 * Sub-interface of ThemeSource to be implemented by objects that
 * can resolve theme messages hierarchically.
 *
 * @author Jean-Pierre Pawlak
 * @author Juergen Hoeller
 * @deprecated as of 6.0, with no concrete replacement
 */
@Deprecated(since = "6.0")
public interface HierarchicalThemeSource extends ThemeSource {

	/**
	 * Set the parent that will be used to try to resolve theme messages
	 * that this object can't resolve.
	 * @param parent the parent ThemeSource that will be used to
	 * resolve messages that this object can't resolve.
	 * May be {@code null}, in which case no further resolution is possible.
	 */
	void setParentThemeSource(@Nullable ThemeSource parent);

	/**
	 * Return the parent of this ThemeSource, or {@code null} if none.
	 */
	@Nullable
	ThemeSource getParentThemeSource();

}
