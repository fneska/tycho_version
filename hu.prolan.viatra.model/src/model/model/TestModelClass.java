/**
 */
package model.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Model Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model.model.TestModelClass#getName <em>Name</em>}</li>
 *   <li>{@link model.model.TestModelClass#getTestmodelclasscomp <em>Testmodelclasscomp</em>}</li>
 * </ul>
 *
 * @see model.model.ModelPackage#getTestModelClass()
 * @model
 * @generated
 */
public interface TestModelClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.model.ModelPackage#getTestModelClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link model.model.TestModelClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Testmodelclasscomp</b></em>' containment reference list.
	 * The list contents are of type {@link model.model.TestModelClassComp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Testmodelclasscomp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testmodelclasscomp</em>' containment reference list.
	 * @see model.model.ModelPackage#getTestModelClass_Testmodelclasscomp()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestModelClassComp> getTestmodelclasscomp();

} // TestModelClass
