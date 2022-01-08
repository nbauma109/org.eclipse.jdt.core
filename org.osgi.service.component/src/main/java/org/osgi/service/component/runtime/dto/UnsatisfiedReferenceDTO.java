/*******************************************************************************
 * Copyright (c) Contributors to the Eclipse Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0 
 *******************************************************************************/

package org.osgi.service.component.runtime.dto;

import org.osgi.dto.DTO;
import org.osgi.framework.dto.ServiceReferenceDTO;

/**
 * A representation of an unsatisfied reference.
 * 
 * @since 1.3
 * @NotThreadSafe
 * @author $Id: 566dc732504c5ebe6f36553d601898a0fbdba909 $
 */
public class UnsatisfiedReferenceDTO extends DTO {
	/**
	 * The name of the declared reference.
	 * 
	 * <p>
	 * This is declared in the {@code name} attribute of the {@code reference}
	 * element of the component description.
	 * 
	 * @see ReferenceDTO#name
	 */
	public String					name;

	/**
	 * The target property of the unsatisfied reference.
	 * 
	 * <p>
	 * This is the value of the {@link ComponentConfigurationDTO#properties
	 * component property} whose name is the concatenation of the
	 * {@link ReferenceDTO#name declared reference name} and
	 * &quot;.target&quot;. This must be {@code null} if no target property is
	 * set for the reference.
	 */
	public String					target;

	/**
	 * The target services.
	 * 
	 * <p>
	 * Each {@link ServiceReferenceDTO} in the array represents a target service
	 * for the reference. The array must be empty if there are no target
	 * services. The upper bound on the number of target services in the array
	 * is the upper bound on the {@link ReferenceDTO#cardinality cardinality} of
	 * the reference.
	 */
	public ServiceReferenceDTO[]	targetServices;
}
