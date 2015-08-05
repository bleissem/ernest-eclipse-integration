/*******************************************************************************
 * Copyright (c) 2015 Fraunhofer Institute for Embedded Systems and
 * Communication Technologies ESK
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * This file is part of ERNEST.
 *
 * Contributors:
 * Fraunhofer ESK - initial API and implementation
 *******************************************************************************/
package ernest.architecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ernest.architecture.SoftwarePort#getOwner <em>Owner</em>}</li>
 *   <li>{@link ernest.architecture.SoftwarePort#getConnectedTo <em>Connected To</em>}</li>
 * </ul>
 *
 * @see ernest.architecture.ArchitecturePackage#getSoftwarePort()
 * @model abstract="true"
 * @generated
 */
public interface SoftwarePort extends Port {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ernest.architecture.FModule#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(FModule)
	 * @see ernest.architecture.ArchitecturePackage#getSoftwarePort_Owner()
	 * @see ernest.architecture.FModule#getPorts
	 * @model opposite="ports" required="true" transient="false"
	 * @generated
	 */
	FModule getOwner();

	/**
	 * Sets the value of the '{@link ernest.architecture.SoftwarePort#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(FModule value);

	/**
	 * Returns the value of the '<em><b>Connected To</b></em>' reference list.
	 * The list contents are of type {@link ernest.architecture.SoftwareConnector}.
	 * It is bidirectional and its opposite is '{@link ernest.architecture.SoftwareConnector#getConnectedTo <em>Connected To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected To</em>' reference list.
	 * @see ernest.architecture.ArchitecturePackage#getSoftwarePort_ConnectedTo()
	 * @see ernest.architecture.SoftwareConnector#getConnectedTo
	 * @model opposite="connectedTo"
	 * @generated
	 */
	EList<SoftwareConnector> getConnectedTo();

} // SoftwarePort
