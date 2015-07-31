/**
 * Copyright 2013-2015 DEMANES.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the LicenseLicensed under the Apache License, Version 2.0.
 */
package eu.artemis.demanes.exceptions;

import eu.artemis.demanes.datatypes.ANES_URN;

/**
 * An InexistentActionID is thrown when an Action is referenced using a ANES_URN
 * that is unknown to the receiver object.
 * 
 * @author leeuwencjv
 * @version 0.1
 * @since 9 apr. 2014
 * 
 */
public class InexistentActionID extends Exception {

	private static final long serialVersionUID = 1996097768538949995L;

	/**
	 * @param id
	 */
	public InexistentActionID(ANES_URN id) {
		super("No action available with id " + id);
	}

}
